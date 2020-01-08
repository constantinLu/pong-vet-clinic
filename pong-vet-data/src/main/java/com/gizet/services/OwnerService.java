package com.gizet.services;

import com.gizet.model.OwnerEntity;

/**
 * CUSTOM CRUD OPERATIONS
 */
public interface OwnerService extends CrudService<OwnerEntity, Long> {

    OwnerEntity findByLastName(String lastName);

}
