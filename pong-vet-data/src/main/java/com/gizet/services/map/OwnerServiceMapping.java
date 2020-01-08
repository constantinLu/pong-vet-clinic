package com.gizet.services.map;

import com.gizet.model.OwnerEntity;
import com.gizet.services.CrudService;

import java.util.AbstractMap;
import java.util.Set;

public class OwnerServiceMapping extends AbastractMapService<OwnerEntity, Long> {

    @Override
    public Set<OwnerEntity> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(OwnerEntity object) {
        super.delete(object);
    }

    @Override
    public OwnerEntity save(OwnerEntity object) {
        return super.save(object.getId(), object);
    }

    @Override
    public OwnerEntity findById(Long id) {
        return super.findById(id);
    }

}
