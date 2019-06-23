package com.raphael.hotel.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "check_in", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CheckInEntity {

    @Id
    @Column(name = "check_in_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int check_in_id;

    @Column(name = "enter_date", nullable = false)
    private LocalDateTime enterDate;

    @Column(name = "leave_date", nullable = false)
    private LocalDateTime leaveDate;

    @Column(name = "vehicle", nullable = false)
    private boolean vehicle;

    @Column(name = "bill")
    private Long bill;

    @JoinColumn(name = "person_fk_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private PersonEntity person_fk_id;

    public LocalDateTime getEnterDate() {
        return enterDate;
    }
    public void setEnterDate(LocalDateTime enterDate) {
        this.enterDate = enterDate;
    }

    public LocalDateTime getLeaveDate() {
        return leaveDate;
    }
    public void setLeaveDate(LocalDateTime leaveDate) { this.leaveDate = leaveDate; }

    public boolean getVehicle() {
        return vehicle;
    }
    public void setVehicle(boolean status) {
        this.vehicle = status;
    }

    public PersonEntity getPerson_fk_id() { return person_fk_id; }
    public void setPerson_fk_id(PersonEntity person_fk_id) { this.person_fk_id = person_fk_id; }

    public Long getBill() { return bill; }
    public void setBill(Long bill) { this.bill = bill; }
}
