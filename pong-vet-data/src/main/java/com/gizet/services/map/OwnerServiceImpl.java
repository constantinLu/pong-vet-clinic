package com.gizet.services.map;

import com.gizet.model.OwnerEntity;
import com.gizet.model.PetEntity;
import com.gizet.services.OwnerService;
import com.gizet.services.PetService;
import com.gizet.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class OwnerServiceImpl extends AbstractServiceDao<OwnerEntity, Long> implements OwnerService {

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
//                            if (pet.getPetTypeEntity() != null) {
//                                if (pet.getPetTypeEntity().getId() == null) {
//                                    pet.setPetTypeEntity(petTypeService.save(pet.getPetTypeEntity()));
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
