package com.gizet.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/*
Object
 */
@Entity(name = "PET")
public class PetEntity extends BaseEntity {

    public PetEntity(String name, PetTypeEntity petType, OwnerEntity owner, LocalDate birthDate) {
        this.name = name;
        this.petType = petType;
        this.owner = owner;
        this.birthDate = birthDate;
    }

    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetTypeEntity petType;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private OwnerEntity owner;

    private LocalDate birthDate;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<VisitEntity> visits = new HashSet<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetTypeEntity getPetType() {
        return petType;
    }

    public void setPetType(PetTypeEntity petType) {
        this.petType = petType;
    }

    public OwnerEntity getOwner() {
        return owner;
    }

    public void setOwner(OwnerEntity owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<VisitEntity> getVisits() {
        return visits;
    }

    public void setVisits(Set<VisitEntity> visits) {
        this.visits = visits;
    }
}
