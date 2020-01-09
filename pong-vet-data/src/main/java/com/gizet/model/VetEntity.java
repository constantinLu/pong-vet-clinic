package com.gizet.model;

import java.util.HashSet;
import java.util.Set;

public class VetEntity extends PersonEntity {

    public VetEntity(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private Set<SpecialityEntity> specialities = new HashSet<>();

    public Set<SpecialityEntity> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<SpecialityEntity> specialities) {
        this.specialities = specialities;
    }
}
