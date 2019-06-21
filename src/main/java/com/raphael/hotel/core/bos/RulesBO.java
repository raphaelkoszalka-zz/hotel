package com.raphael.hotel.core.bos;

import com.raphael.hotel.persistence.dto.TableDTO;
import com.raphael.hotel.persistence.entities.CheckInEntity;
import com.raphael.hotel.persistence.entities.PersonEntity;
import com.raphael.hotel.persistence.repositories.CheckInRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RulesBO {

    private final CheckInRepository checkInRepository;

    @Autowired
    public RulesBO(final CheckInRepository checkInRepository) {
        this.checkInRepository = checkInRepository;
    }

    private boolean stillHosted(CheckInEntity guest, LocalDateTime moment) {
        return moment.isAfter(guest.getEnterDate()) && moment.isBefore(guest.getLeaveDate());
    }

    public List<TableDTO> getCheckedStatus() {
        List<CheckInEntity> checkedGuests = checkInRepository.findAll();
        List<TableDTO> dtos = checkedGuests
            .stream()
            .map(guest -> {
                TableDTO hostedGuest = new TableDTO();
                if (stillHosted(guest, LocalDateTime.now())) {
                    hostedGuest.setBill(guest.getBill());
                }
                return hostedGuest;
            })
            .collect(Collectors.toList());
        return dtos;
    }

}
