package com.gizet.services.springdata;

import com.gizet.model.VisitEntity;
import com.gizet.repositories.interfaces.VisitRepository;
import com.gizet.services.interfaces.VisitService;

import java.util.HashSet;
import java.util.Set;

public class VisitSDService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }


    @Override
    public Set<VisitEntity> findAll() {
        Set<VisitEntity> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return null;
    }

    @Override
    public VisitEntity findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public VisitEntity save(VisitEntity object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(VisitEntity object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
