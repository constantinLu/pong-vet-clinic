package com.gizet.services.map;

import com.gizet.model.VetEntity;
import com.gizet.services.VetService;

import java.util.Set;

public class VetServiceMapping extends AbastractMapService<VetEntity, Long> implements VetService {

    @Override
    public Set<VetEntity> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(VetEntity object) {
        super.delete(object);
    }

    @Override
    public VetEntity save(VetEntity object) {
        return super.save(object.getId(), object);
    }

    @Override
    public VetEntity findById(Long id) {
        return super.findById(id);
    }
}
