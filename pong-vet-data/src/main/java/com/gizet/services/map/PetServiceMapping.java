package com.gizet.services.map;

import com.gizet.model.PetEntity;

import java.util.Set;

public class PetServiceMapping extends AbastractMapService<PetEntity, Long> {

    @Override
    public Set<PetEntity> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }

    @Override
    public void delete(PetEntity object) {
        super.delete(object);
    }

    @Override
    public PetEntity save(PetEntity object) {
        return super.save(object.getId(), object);
    }

    @Override
    public PetEntity findById(Long id) {
        return super.findById(id);
    }
}
