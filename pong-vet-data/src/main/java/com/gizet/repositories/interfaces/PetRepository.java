package com.gizet.repositories.interfaces;

import com.gizet.model.OwnerEntity;
import com.gizet.model.PetEntity;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<PetEntity, Long> {


}
