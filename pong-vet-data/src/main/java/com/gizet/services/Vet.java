package com.gizet.services;

import com.gizet.model.OwnerEntity;

import java.util.Set;

public interface Vet {

    Vet findById(Long id);

    Vet save(OwnerEntity ownerEntity);

    Set<Vet> findAll();
}
