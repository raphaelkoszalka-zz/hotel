package com.raphael.hotel.persistence.repositories;

import com.raphael.hotel.persistence.entities.CheckInEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CheckInRepository extends JpaRepository<CheckInEntity, String> {
    @Query("FROM CheckInEntity cki WHERE id = :id")
    CheckInEntity getCheckInById(Long id);
}