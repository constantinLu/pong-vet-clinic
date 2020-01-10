package com.gizet.repositories.interfacee;

import com.gizet.model.OwnerEntity;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<OwnerEntity, Long> {

    OwnerEntity findByLastName(String lastName);
}
