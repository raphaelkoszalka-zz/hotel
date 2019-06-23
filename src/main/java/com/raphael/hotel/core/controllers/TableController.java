package com.raphael.hotel.core.controllers;

import com.raphael.hotel.core.bos.RulesBO;
import com.raphael.hotel.core.bos.TableBO;
import com.raphael.hotel.persistence.dto.TableDTO;
import com.raphael.hotel.persistence.entities.TableEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/table", produces = "application/json")
public class TableController {

    private final RulesBO rulesBO;
    private final TableBO tableBO;

    @Autowired
    public TableController(final RulesBO rulesBO, final TableBO tableBO) {
        this.rulesBO = rulesBO;
        this.tableBO = tableBO;
    }

    // Refactoring this method in business rule object now
    @RequestMapping(value = "/checked-in", method = RequestMethod.GET)
    public List<TableDTO> getAllCheckedIn() {
        return rulesBO.getCheckedStatus();
    }

    // Refactoring this method in business rule object now
    @RequestMapping(value = "/all-guests", method = RequestMethod.GET)
    public List<TableEntity> findAll() {
        return tableBO.findAll();
    }
}
