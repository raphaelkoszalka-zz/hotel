package com.raphael.hotel.core.controllers;


import com.raphael.hotel.core.bos.CheckInBO;
import com.raphael.hotel.core.bos.PersonBO;
import com.raphael.hotel.persistence.dto.CheckInDTO;
import com.raphael.hotel.persistence.entities.CheckInEntity;
import com.raphael.hotel.persistence.entities.PersonEntity;
import java.util.List;
import java.util.stream.Collectors;
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
    private final PersonBO personBO;

    @Autowired
    public CheckInController(final CheckInBO checkInBO, final PersonBO personBO) {
        this.checkInBO = checkInBO;
        this.personBO = personBO;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getConfigurationsByDomain(@PathVariable("id") String id) {
        return "Hello " + id;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<CheckInDTO>> getAllCheckIn() {
        List<CheckInEntity> checkInEntity = checkInBO.getAllCheckIn();
        List<CheckInDTO> response = checkInEntity
            .stream()
            .map(entity -> {
                CheckInDTO dto =  new CheckInDTO();
                dto.setVehicle(entity.getVehicle());
                dto.setEnterDate(entity.getEnterDate());
                dto.setLeaveDate(entity.getLeaveDate());
                dto.setBill(entity.getBill());
                return dto;
            })
            .collect(Collectors.toList());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public ResponseEntity requestAdditionalCopyReason(@RequestBody CheckInDTO postData) {

        CheckInEntity checkInEntity = new CheckInEntity();

        checkInEntity.setEnterDate(postData.getEnterDate());
        checkInEntity.setLeaveDate(postData.getLeaveDate());
        checkInEntity.setVehicle(postData.getVehicle());
        checkInEntity.setPersonId(postData.getPersonId());
        checkInEntity.setBill(postData.getBill());

        checkInBO.save(checkInEntity);

        return new ResponseEntity(HttpStatus.CREATED);
    }

}
