package com.raphael.hotel.core.bos;

import com.raphael.hotel.persistence.entities.TableEntity;
import com.raphael.hotel.persistence.repositories.TableRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableBO {

    private final TableRepository tableRepository;

    @Autowired
    public TableBO(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    public List<TableEntity> findAll() {
        return tableRepository.getTableList();
    }

}
