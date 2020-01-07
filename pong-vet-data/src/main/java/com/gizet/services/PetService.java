package com.gizet.services;

import com.gizet.model.OwnerEntity;
import com.gizet.model.PetEntity;

import java.util.Set;

public interface PetService {

    PetEntity findById(Long id);

    PetEntity save(OwnerEntity ownerEntity);

    Set<PetEntity> findAll();
}
