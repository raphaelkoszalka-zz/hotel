package com.raphael.hotel.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class PersonDTO {

    private String name;
    private String phone;
    private String document;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.name = phone;
    }

}
