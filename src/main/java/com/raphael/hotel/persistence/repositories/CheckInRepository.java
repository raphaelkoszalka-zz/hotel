package com.raphael.hotel.persistence.repositories;

import com.raphael.hotel.persistence.entities.CheckInEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckInRepository extends JpaRepository<CheckInEntity, String> {

    @Query("SELECT p, c from PersonEntity p, CheckInEntity c WHERE p.person_id = c.person_fk_id")
    List<CheckInEntity> getAllCheckdIn();

    @Query("FROM CheckInEntity cki WHERE id = :id")
    CheckInEntity getCheckInById(Long id);

}