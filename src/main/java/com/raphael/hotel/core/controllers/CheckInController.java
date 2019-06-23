package com.raphael.hotel.core.controllers;


import com.raphael.hotel.core.bos.CheckInBO;
import com.raphael.hotel.persistence.dto.CheckInDTO;
import com.raphael.hotel.persistence.entities.CheckInEntity;
import com.raphael.hotel.persistence.entities.PersonEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/check-in", produces = "application/json")
public class CheckInController {

    private final CheckInBO checkInBO;

    @Autowired
    public CheckInController(final CheckInBO checkInBO) {
        this.checkInBO = checkInBO;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public CheckInEntity getCheckInById(@PathVariable("id") Long id) {
        CheckInEntity entity = checkInBO.getCheckInById(id);

        entity.setBill(entity.getBill());
        entity.setVehicle(entity.getVehicle());
        entity.setLeaveDate(entity.getLeaveDate());
        entity.setEnterDate(entity.getEnterDate());
        entity.setPerson(entity.getPerson());

        return entity;
    }

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<CheckInEntity> findAll() {
        return checkInBO.findAll();
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity newCheckIn(@RequestBody CheckInDTO postData) {

        PersonEntity personEntity = new PersonEntity();
        personEntity.setPersonName(postData.getName());
        personEntity.setPersonDocument(postData.getDocument());
        personEntity.setPersonPhone(postData.getPhone());
        checkInBO.savePerson(personEntity);

        CheckInEntity checkInEntity = new CheckInEntity();
        checkInEntity.setEnterDate(postData.getLeave_date());
        checkInEntity.setLeaveDate(postData.getEnter_date());
        checkInEntity.setVehicle(postData.getVehicle());
        checkInEntity.setPerson(personEntity);
        checkInEntity.setBill(postData.getBill());
        checkInBO.saveCheckIn(checkInEntity);

        return new ResponseEntity(HttpStatus.CREATED);
    }



}
