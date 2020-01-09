package com.gizet.model;

import java.util.Set;

public class VetEntity extends PersonEntity {

    public VetEntity(String firstName, String lastName, Set<SpecialityEntity> specialies) {
        super(firstName, lastName);
        this.specialies = specialies;
    }

    private Set<SpecialityEntity> specialies;

    public Set<SpecialityEntity> getSpecialies() {
        return specialies;
    }

    public void setSpecialies(Set<SpecialityEntity> specialies) {
        this.specialies = specialies;
    }
}
