package com.gizet.services.springdata;

import com.gizet.model.PetTypeEntity;
import com.gizet.model.VetEntity;
import com.gizet.repositories.interfaces.PetTypeRepository;
import com.gizet.services.interfaces.PetTypeService;
import com.gizet.services.interfaces.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetTypeEntity> findAll() {
        Set<PetTypeEntity> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetTypeEntity findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetTypeEntity save(PetTypeEntity object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetTypeEntity object) {
        petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
