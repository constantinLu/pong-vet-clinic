package com.gizet.services;

import com.gizet.model.Owner;
import com.gizet.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
