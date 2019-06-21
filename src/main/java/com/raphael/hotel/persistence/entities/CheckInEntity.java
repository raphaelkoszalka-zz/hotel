package com.raphael.hotel.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "check_in", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CheckInEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "enter_date", nullable = false)
    private LocalDateTime enterDate;

    @Column(name = "leave_date", nullable = false)
    private LocalDateTime leaveDate;

    @Column(name = "vehicle", nullable = false)
    private boolean vehicle;

    @Column(name = "bill", columnDefinition = "0")
    private Long bill;

    @Column(name = "person_id")
    private Long personId;

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

    public Long getPersonId() { return personId; }
    public void setPersonId(Long personId) { this.personId = personId; }

    public Long getBill() { return bill; }
    public void setBill(Long bill) { this.bill = bill; }
}
