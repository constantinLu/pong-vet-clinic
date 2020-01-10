package com.gizet.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "Speciality")
public class SpecialityEntity extends BaseEntity {

    private String type;

    @ManyToMany
    private VetEntity vet;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
