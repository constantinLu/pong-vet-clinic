package com.gizet.model;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name ="PET_TYPE_IS")
public class PetTypeEntity extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "petType")
    private Set<PetEntity> pets;

    public PetTypeEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PetEntity> getPets() {
        return pets;
    }

    public void setPets(Set<PetEntity> pets) {
        this.pets = pets;
    }


}
