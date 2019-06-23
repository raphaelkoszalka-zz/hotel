package com.raphael.hotel.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDateTime;

@JsonInclude(Include.NON_NULL)
public class CheckInDTO {

    private int person_id;
    private boolean vehicle;
    private LocalDateTime enter_date;
    private LocalDateTime leave_date;
    private Long bill;
    private String name;
    private String document;
    private String phone;


    public int getPerson_id() { return person_id; }
    public void setPerson_id(int person_id) { this.person_id = person_id; }

    public LocalDateTime getLeave_date() { return leave_date; }
    public void setLeave_date(LocalDateTime leave_date) { this.leave_date = leave_date; }

    public LocalDateTime getEnter_date() { return leave_date; }
    public void setEnter_date(LocalDateTime enter_date) { this.enter_date = enter_date; }

    public Long getBill() { return bill; }
    public void setBill(Long bill) { this.bill = bill; }

    public boolean getVehicle() { return vehicle; }
    public void setVehicle(boolean status) { this.vehicle = status; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }


}
