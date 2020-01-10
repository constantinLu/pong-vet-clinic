package com.gizet.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

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

    public VetEntity getVet() {
        return vet;
    }

    public void setVet(VetEntity vet) {
        this.vet = vet;
    }
}
