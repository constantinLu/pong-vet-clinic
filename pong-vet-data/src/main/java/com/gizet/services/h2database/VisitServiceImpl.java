package com.gizet.services.h2database;

import com.gizet.model.VisitEntity;
import com.gizet.services.interfaces.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
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
