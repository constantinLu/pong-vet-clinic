package com.gizet.services.springdata;

import com.gizet.model.SpecialityEntity;
import com.gizet.repositories.interfaces.SpecialityRepository;
import com.gizet.services.interfaces.SpecialityService;

import java.util.HashSet;
import java.util.Set;

public class SpecialitySDService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialitySDService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<SpecialityEntity> findAll() {
        Set<SpecialityEntity> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return null;
    }

    @Override
    public SpecialityEntity findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public SpecialityEntity save(SpecialityEntity object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(SpecialityEntity object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
