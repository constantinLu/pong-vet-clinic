package com.gizet.services;

import com.gizet.model.Owner;
import java.util.Set;

/**
 * CUSTOM CRUD OPERATIONS
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();



}
