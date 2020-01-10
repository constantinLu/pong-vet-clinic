package com.gizet.services.h2database;

import com.gizet.model.VisitEntity;
import com.gizet.services.interfaces.VisitService;

import java.util.Set;

public class VisitServiceImpl extends AbstractServiceImpl<VisitEntity, Long> implements VisitService {

    @Override
    public Set<VisitEntity> findAll() {
        return super.findAll();
    }

    @Override
    public VisitEntity findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public VisitEntity save(VisitEntity object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(VisitEntity object) {
        super.delete(object);
    }
}
