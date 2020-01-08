package com.gizet.services;

import com.gizet.model.OwnerEntity;
import org.springframework.data.repository.CrudRepository;

import java.security.acl.Owner;
import java.util.Set;

/**
 * CUSTOM CRUD OPERATIONS
 */
public interface OwnerService extends CrudService<OwnerEntity, Long> {

    OwnerEntity findByLastName(String lastName);

}
