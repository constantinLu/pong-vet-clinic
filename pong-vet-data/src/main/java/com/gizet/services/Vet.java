package com.gizet.services;

import com.gizet.model.Owner;

import java.util.Set;

public interface Vet {

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
