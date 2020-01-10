package com.gizet.services.springdata;

import com.gizet.model.PetTypeEntity;
import com.gizet.model.VetEntity;
import com.gizet.services.interfaces.PetTypeService;
import com.gizet.services.interfaces.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDService implements PetTypeService {

    private final PetTypeSDService petTypeSDService;

    public PetTypeSDService(PetTypeSDService petTypeSDService) {
        this.petTypeSDService = petTypeSDService;
    }


    @Override
    public Set<PetTypeEntity> findAll() {
        Set<PetTypeEntity> petTypes = new HashSet<>();
        petTypeSDService.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetTypeEntity findById(Long aLong) {
        return petTypeSDService.findById(aLong);
    }

    @Override
    public PetTypeEntity save(PetTypeEntity object) {
        return petTypeSDService.save(object);
    }

    @Override
    public void delete(PetTypeEntity object) {
        petTypeSDService.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeSDService.deleteById(aLong);
    }
}
