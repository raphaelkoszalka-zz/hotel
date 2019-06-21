package com.raphael.hotel.core.bos;

import com.raphael.hotel.persistence.entities.CheckInEntity;
import com.raphael.hotel.persistence.entities.PersonEntity;
import com.raphael.hotel.persistence.repositories.CheckInRepository;
import com.raphael.hotel.persistence.repositories.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInBO {

    private final CheckInRepository checkInRepository;
    private final PersonRepository personRepository;

    @Autowired
    public CheckInBO(final CheckInRepository checkInRepository,
        final PersonRepository personRepository) {
        this.checkInRepository = checkInRepository;
        this.personRepository = personRepository;
    }

    public List<CheckInEntity> findAll() {
        return checkInRepository.findAll();
    }

    public void save(CheckInEntity data) {
        checkInRepository.save(data);
    }

    public PersonEntity getPersonById(Long id) {
        return personRepository.getPersonEntityById(id);
    }

}
