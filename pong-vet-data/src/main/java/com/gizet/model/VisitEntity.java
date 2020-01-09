package com.gizet.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VisitEntity extends BaseEntity {

    public VisitEntity(LocalDateTime date, String description, PetEntity petId) {
        this.date = date;
        this.description = description;
        this.petId = petId;
    }

    private LocalDateTime date;

    private String description;

    private PetEntity petId;


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

    public PetEntity getPetId() {
        return petId;
    }

    public void setPetId(PetEntity petId) {
        this.petId = petId;
    }
}
