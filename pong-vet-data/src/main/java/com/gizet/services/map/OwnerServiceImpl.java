package com.gizet.services.map;

import com.gizet.model.OwnerEntity;
import com.gizet.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class OwnerServiceImpl extends AbstractServiceImpl<OwnerEntity, Long> implements OwnerService {

    @Override
    public Set<OwnerEntity> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(OwnerEntity object) {
        super.delete(object);
    }

    @Override
    public OwnerEntity save(OwnerEntity object) {

        if (object != null) {
//            if(object.getPets() != null) {
//                        object.getPets().forEach(pet -> {
//                            if (pet.getPetType() != null) {
//                                if (pet.getPetType().getId() == null) {
//                                    pet.setPetType(petTypeService.save(pet.getPetType()));
//                                }
//                            } else {
//                                throw new RuntimeException("Pet Type is required");
//                            }
//
//                    if (pet.getId() == null) {
//                        PetEntity savedPet = petService.save(pet);
//                        pet.setId(savedPet.getId());
//                    }
//                });
//            }
            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public OwnerEntity findById(Long id) {
        return super.findById(id);
    }

    @Override
    public OwnerEntity findByLastName(String lastName) {
        return null;
    }
}
