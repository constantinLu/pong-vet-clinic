package com.gizet.services.map;

import com.gizet.model.PetTypeEntity;
import com.gizet.services.PetTypeService;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public abstract class PetTypeServiceImpl extends AbstractServiceDao<PetTypeEntity, Long> implements PetTypeService {

    @Override
    public Set<PetTypeEntity> findAll() {
        return super.findAll();
    }

    @Override
    public PetTypeEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetTypeEntity save(PetTypeEntity object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetTypeEntity object) {
        super.delete(object);
    }
}
