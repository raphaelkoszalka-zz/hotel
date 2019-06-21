package com.raphael.hotel.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "check_in", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CheckInEntity {

    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "enterDate", nullable = false)
    private LocalDateTime enterDate;

    @Column(name = "leaveDate", nullable = false)
    private LocalDateTime leaveDate;

    @Column(name = "vehicle", nullable = false)
    private boolean vehicle;

    @Column(name = "bill", columnDefinition = "0")
    private Long bill;

    @JoinColumn(name = "person")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonEntity person;

    public LocalDateTime getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(LocalDateTime enterDate) {
        this.enterDate = enterDate;
    }

    public LocalDateTime getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDateTime leaveDate) {
        this.leaveDate = leaveDate;
    }

    public boolean getVehicle() {
        return vehicle;
    }

    public void setVehicle(boolean status) {
        this.vehicle = status;
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public Long getBill() {
        return bill;
    }

    public void setBill(Long bill) {
        this.bill = bill;
    }
}
