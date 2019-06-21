package com.raphael.hotel.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.FetchType;

@Entity
@Table(name = "person", schema = "public")
public class PersonEntity {

    @Column(name = "id")
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "document")
    private String document;


    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument()  {
        return name;
    }

    public void setDocument(String name) {
        this.name = name;
    }


}
