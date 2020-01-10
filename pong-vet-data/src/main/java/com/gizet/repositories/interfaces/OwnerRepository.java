package com.gizet.repositories.interfaces;

import com.gizet.model.OwnerEntity;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<OwnerEntity, Long> {

    OwnerEntity findByLastName(String lastName);
}
