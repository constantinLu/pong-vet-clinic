package com.gizet.services.map;

import com.gizet.model.PetEntity;
import com.gizet.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceImpl extends AbstractServiceDao<PetEntity, Long> implements PetService {

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
