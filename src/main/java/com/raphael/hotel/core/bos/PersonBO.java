package com.raphael.hotel.core.bos;

import com.raphael.hotel.persistence.entities.PersonEntity;
import com.raphael.hotel.persistence.repositories.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonBO {

    private final PersonRepository personRepository;

    @Autowired
    public PersonBO(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<PersonEntity> findAll() {
        return personRepository.findAll();
    }

    public PersonEntity getPersonEntityById(Long id) {
        return personRepository.getPersonEntityById(id);
    }

}
