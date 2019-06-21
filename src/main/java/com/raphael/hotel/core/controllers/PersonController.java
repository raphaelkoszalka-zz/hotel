package com.raphael.hotel.core.controllers;

import com.raphael.hotel.core.bos.PersonBO;
import com.raphael.hotel.persistence.entities.PersonEntity;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping(path = "/person", produces = "application/json")
public class PersonController {

    private final PersonBO personBO;

    @Autowired
    public PersonController(final PersonBO personBO) {
        this.personBO = personBO;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<PersonEntity>> getAllPax() {
        List<PersonEntity> persons = personBO.findAll();
        List<PersonEntity> response = persons
            .stream()
            .map(person ->  {
                PersonEntity dto = new PersonEntity();
                dto.setPersonPhone(person.getPersonPhone());
                dto.setPersonDocument(person.getPersonDocument());
                dto.setPersonName(person.getPersonName());
                return dto;
            })
            .collect(Collectors.toList());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(value = "/single/{id}", method = RequestMethod.GET)
    public PersonEntity getPersonEntityById(@PathVariable("id") Long id) {
        PersonEntity entity = personBO.getPersonEntityById(id);
        entity.setPersonName(entity.getPersonName());
        entity.setPersonDocument(entity.getPersonDocument());
        entity.setPersonPhone(entity.getPersonPhone());
        return entity;
    }

}
