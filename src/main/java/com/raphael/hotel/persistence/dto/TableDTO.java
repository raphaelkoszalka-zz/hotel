package com.raphael.hotel.persistence.dto;

public class TableDTO {

    private Long bill;
    private String name;
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

    public Long getBill() { return bill; }
    public void setBill(Long bill) { this.bill = bill; }
}
