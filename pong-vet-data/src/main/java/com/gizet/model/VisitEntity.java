package com.gizet.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;

@Entity
public class VisitEntity extends BaseEntity {

    public VisitEntity(LocalDateTime date, String description, PetEntity pet) {
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private PetEntity pet;


    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PetEntity getPet() {
        return pet;
    }

    public void setPet(PetEntity pet) {
        this.pet = pet;
    }
}
