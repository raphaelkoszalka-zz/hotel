package com.raphael.hotel.persistence.repositories;

import com.raphael.hotel.persistence.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<PersonEntity, String> {
    @Query("FROM PersonEntity wle WHERE id = :id")
    PersonEntity getPersonEntityById(Long id);
}