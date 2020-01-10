package com.gizet.repositories.interfacee;

import com.gizet.model.OwnerEntity;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<OwnerEntity, Long> {


}
