package com.gizet.repositories.interfaces;

import com.gizet.model.OwnerEntity;
import com.gizet.model.PetTypeEntity;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetTypeEntity, Long> {


}
