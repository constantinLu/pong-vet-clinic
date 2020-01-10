package com.gizet.services.springdata;

import com.gizet.model.VetEntity;
import com.gizet.repositories.interfaces.VetRepository;
import com.gizet.services.interfaces.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDService implements VetService {

    private final VetRepository vetRepository;

    public VetSDService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public Set<VetEntity> findAll() {
        Set<VetEntity> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public VetEntity findById(Long aLong) {
        return null;
    }

    @Override
    public VetEntity save(VetEntity object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(VetEntity object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
