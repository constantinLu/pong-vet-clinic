package com.gizet.services.springdata;

import com.gizet.model.OwnerEntity;
import com.gizet.repositories.interfacee.OwnerRepository;
import com.gizet.repositories.interfacee.PetRepository;
import com.gizet.repositories.interfacee.PetTypeRepository;
import com.gizet.services.interfacee.CrudService;
import com.gizet.services.interfacee.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.security.acl.Owner;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Owner Spring Data Service
 */

@Service
@Profile("springdatajpa")
public class OwnerSDService implements OwnerService {

    private final OwnerRepository ownerRepository;


    public OwnerSDService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public OwnerEntity findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<OwnerEntity> findAll() {
        Set<OwnerEntity> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add); // java8.
        return owners;
    }

    @Override
    public OwnerEntity findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null); // java8.
    }

    @Override
    public OwnerEntity save(OwnerEntity object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(OwnerEntity object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
