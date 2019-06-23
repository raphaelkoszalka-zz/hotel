package com.raphael.hotel.persistence.repositories;

import com.raphael.hotel.persistence.dto.CheckInDTO;
import com.raphael.hotel.persistence.entities.CheckInEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckInRepository extends JpaRepository<CheckInEntity, String> {

    @Query("SELECT p.name, p.document, p.phone, c from PersonEntity p, CheckInEntity c WHERE p.person_id = c.person")
    List<CheckInDTO> getAllGuests();

    @Query("FROM CheckInEntity cki WHERE id = :id")
    CheckInEntity getCheckInById(Long id);

}