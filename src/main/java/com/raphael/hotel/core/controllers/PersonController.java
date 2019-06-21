package com.raphael.hotel.core.controllers;

import com.raphael.hotel.core.bos.PersonBO;
import com.raphael.hotel.persistence.dto.PersonDTO;
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
@RequestMapping(path = "/pax", produces = "application/json")
public class PersonController {

    private final PersonBO personBO;

    @Autowired
    public PersonController(final PersonBO personBO) {
        this.personBO = personBO;
    }

    /*
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<PersonDTO>> getAllPax() {
        List<PersonEntity> pax;
        pax = personBO.findAll();
       List<PersonDTO> response = pax
            .stream()
            .map(person ->  modelMapper.map(person, PersonDTO.class))
            .collect(Collectors.toList());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
     */

    @RequestMapping(value = "/single/{id}", method = RequestMethod.GET)
    public PersonEntity getPersonEntityById(@PathVariable("id") Long id) {
        PersonEntity entity = personBO.getPersonEntityById(id);
        entity.setName(entity.getName());
        return entity;
    }

}
