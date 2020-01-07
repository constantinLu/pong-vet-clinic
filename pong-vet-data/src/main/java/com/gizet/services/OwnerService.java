package com.gizet.services;

import com.gizet.model.OwnerEntity;
import java.util.Set;

/**
 * CUSTOM CRUD OPERATIONS
 */
public interface OwnerService {

    OwnerEntity findByLastName(String lastName);

    OwnerEntity findById(Long id);

    OwnerEntity save(OwnerEntity ownerEntity);

    Set<OwnerEntity> findAll();



}
