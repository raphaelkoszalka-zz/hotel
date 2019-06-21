package com.raphael.hotel.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonEntity {

    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;

    @Column(name = "phone")
    private String phone;

    public String getPersonName()  {
        return name;
    }
    public void setPersonName(String name) {
        this.name = name;
    }

    public String getPersonDocument()  {
        return document;
    }
    public void setPersonDocument(String document) {
        this.document = document;
    }

    public String getPersonPhone()  {
        return phone;
    }
    public void setPersonPhone(String phone) {
        this.phone = phone;
    }


}
