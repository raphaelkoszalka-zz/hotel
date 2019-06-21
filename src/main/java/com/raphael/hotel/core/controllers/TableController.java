package com.raphael.hotel.core.controllers;

import com.raphael.hotel.core.bos.RulesBO;
import com.raphael.hotel.persistence.dto.TableDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/status", produces = "application/json")
public class TableController {

    private final RulesBO rulesBO;

    @Autowired
    public TableController(final RulesBO rulesBO) {
        this.rulesBO = rulesBO;
    }

    /**
     *
    I forgot to commit before, I am having an error on this ResponseEntity
    // I am correcting it right now, if you look in a few moments it will be written
    // in a proper manner
    @RequestMapping(value = "/checked-in", method = RequestMethod.GET)
    public List<TableDTO> getAllCheckedIn() {
        return new ResponseEntity<>(rulesBO.getCheckedStatus(), HttpStatus.OK);
    }
     */
}
