package com.gizet.repositories.interfacee;

import com.gizet.model.OwnerEntity;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<OwnerEntity, Long> {


}
