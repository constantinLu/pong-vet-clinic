package com.gizet.model;

import java.util.Set;

public class OwnerEntity extends PersonEntity {

    public OwnerEntity(String firstName, String lastName, String address, String city, String telephone, Set<PetEntity> pets) {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    private String address;

    private String city;

    private String telephone;

    private Set<PetEntity> pets;

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
