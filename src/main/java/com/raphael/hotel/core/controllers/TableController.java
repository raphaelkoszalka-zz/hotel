package com.raphael.hotel.core.controllers;

import com.raphael.hotel.core.bos.RulesBO;
import com.raphael.hotel.persistence.dto.TableDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

    // Refactoring this method in business rule object now
    @RequestMapping(value = "/checked-in", method = RequestMethod.GET)
    public List<TableDTO> getAllCheckedIn() {
        return rulesBO.getCheckedStatus();
    }

    // Refactoring this method in business rule object now
    @RequestMapping(value = "/checked-in", method = RequestMethod.GET)
    public List<TableDTO> getlAll() {
        return rulesBO.getCheckedStatus();
    }
}
