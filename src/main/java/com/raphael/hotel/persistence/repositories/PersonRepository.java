package com.raphael.hotel.persistence.repositories;

import com.raphael.hotel.persistence.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, String> {

}