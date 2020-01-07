package com.gizet.model;

import java.time.LocalDate;

/*
Object
 */
public class PetEntity extends BaseEntity {

    private PetTypeEntity petTypeEntity;
    private OwnerEntity ownerEntity;
    private LocalDate birthDate;


    public PetTypeEntity getPetTypeEntity() {
        return petTypeEntity;
    }

    public void setPetTypeEntity(PetTypeEntity petTypeEntity) {
        this.petTypeEntity = petTypeEntity;
    }

    public OwnerEntity getOwnerEntity() {
        return ownerEntity;
    }

    public void setOwnerEntity(OwnerEntity ownerEntity) {
        this.ownerEntity = ownerEntity;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
