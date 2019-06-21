package com.raphael.hotel.persistence.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.time.LocalDateTime;

@JsonInclude(Include.NON_NULL)
public class CheckInDTO {

    private LocalDateTime enterDate;
    private LocalDateTime leaveDate;
    private Long bill;
    private Long personId;
    private boolean vehicle;

    public LocalDateTime getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(LocalDateTime enterDate) {
        this.enterDate = enterDate;
    }

    public LocalDateTime getLeaveDate() {
        return enterDate;
    }

    public void setLeaveDate(LocalDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Long getBill(Long bill) {
        return bill;
    }

    public void setBill(Long bill) {
        this.bill = bill;
    }

    public Long getPersonId() {
        return personId;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public boolean getVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean status) {
        this.vehicle = status;
    }

}
