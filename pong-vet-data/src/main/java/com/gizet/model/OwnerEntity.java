package com.gizet.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "OWNER")
public class OwnerEntity extends PersonEntity {

    public OwnerEntity(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private String address;

    private String city;

    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<PetEntity> pets = new HashSet<>();


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<PetEntity> getPets() {
        return pets;
    }

    public void setPets(Set<PetEntity> pets) {
        this.pets = pets;
    }
}
