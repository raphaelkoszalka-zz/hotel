package com.raphael.hotel.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TableEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;

    @Column(name = "bill")
    private Long bill;

    public String getPersonName()  {
        return name;
    }
    public void setPersonName(String name) {
        this.name = name;
    }

    public String getDocument()  {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }

    public String getName()  {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getBill()  {
        return bill;
    }
    public void setName(Long bill) {
        this.bill = bill;
    }


}
