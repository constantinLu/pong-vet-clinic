package com.gizet.repositories.interfaces;

import com.gizet.model.OwnerEntity;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<OwnerEntity, Long> {


}
