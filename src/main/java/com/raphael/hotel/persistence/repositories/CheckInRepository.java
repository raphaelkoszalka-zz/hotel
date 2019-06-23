package com.raphael.hotel.persistence.repositories;

import com.raphael.hotel.persistence.entities.CheckInEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckInEntity, String> {

}