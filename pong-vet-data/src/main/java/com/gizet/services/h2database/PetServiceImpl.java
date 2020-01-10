package com.gizet.services.h2database;

import com.gizet.model.PetEntity;
import com.gizet.services.interfaces.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceImpl extends AbstractServiceImpl<PetEntity, Long> implements PetService {

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
        return super.save(object);
    }

    @Override
    public PetEntity findById(Long id) {
        return super.findById(id);
    }
}
