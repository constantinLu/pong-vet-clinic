package com.gizet.model;

import java.time.LocalDate;

/*
Object
 */
public class PetEntity extends BaseEntity {

    public PetEntity(String name, PetTypeEntity petTypeEntity, OwnerEntity ownerEntity, LocalDate birthDate) {
        this.name = name;
        this.petTypeEntity = petTypeEntity;
        this.ownerEntity = ownerEntity;
        this.birthDate = birthDate;
    }

    private String name;
    private PetTypeEntity petTypeEntity;
    private OwnerEntity ownerEntity;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
