package com.gizet.services.map;

import com.gizet.model.SpecialityEntity;
import com.gizet.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialityServiceImpl extends AbstractServiceImpl<SpecialityEntity, Long> implements SpecialityService {

    @Override
    public Set<SpecialityEntity> findAll() {
        return super.findAll();
    }

    @Override
    public SpecialityEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public SpecialityEntity save(SpecialityEntity object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(SpecialityEntity object) {
        super.delete(object);
    }
}
