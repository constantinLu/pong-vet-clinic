package com.gizet.model;

public class PetTypeEntity extends BaseEntity {

    private String name;

    public PetTypeEntity(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
