package com.gizet.model;

import java.util.Set;

public class OwnerEntity extends PersonEntity {

    public OwnerEntity(String firstName, String lastName, Set<PetEntity> pets) {
        super(firstName, lastName);
        this.pets = pets;
    }

    private Set<PetEntity> pets;

    public Set<PetEntity> getPets() {
        return pets;
    }

    public void setPets(Set<PetEntity> pets) {
        this.pets = pets;
    }
}
