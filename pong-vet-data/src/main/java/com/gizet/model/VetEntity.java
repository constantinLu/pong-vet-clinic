package com.gizet.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name ="Veterinary")
public class VetEntity extends PersonEntity {

    public VetEntity(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<SpecialityEntity> specialities = new HashSet<>();

    public Set<SpecialityEntity> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<SpecialityEntity> specialities) {
        this.specialities = specialities;
    }
}
