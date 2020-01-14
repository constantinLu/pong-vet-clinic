package com.gizet.services.springdata;

import com.gizet.model.OwnerEntity;
import com.gizet.repositories.interfaces.OwnerRepository;
import com.gizet.repositories.interfaces.PetRepository;
import com.gizet.repositories.interfaces.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class OwnerSDServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDService ownerSDService;


    OwnerEntity returnOwner;

    private final String LAST_NAME = "Weston";

    @BeforeEach
    void setUp() {
        returnOwner = OwnerEntity.builder().id(1L).lastName(LAST_NAME).build();
    }


    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        OwnerEntity smith = ownerSDService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());

        verify(ownerRepository).findByLastName(any());

    }

    @Test
    void findAll() {
        Set<OwnerEntity> owners = new HashSet<>();
        owners.add(OwnerEntity.builder().build());
        owners.add(OwnerEntity.builder().build());

        when(ownerRepository.findAll()).thenReturn(owners);

        Set<OwnerEntity> ownerEntities = ownerSDService.findAll();
        assertNotNull(ownerEntities);
        assertEquals(2, owners.size());

    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));

        OwnerEntity owner = ownerSDService.findById(1L);
        assertNotNull(owner);
    }


    @Test
    void save() {
        OwnerEntity ownertoSave = OwnerEntity.builder().id(1L).build();
        when(ownerRepository.save(any())).thenReturn(returnOwner);

        OwnerEntity owner = ownerSDService.save(ownertoSave);

        assertNotNull(ownertoSave);

        verify(ownerRepository).save(any());

    }

    @Test
    void delete() {

        ownerSDService.delete(returnOwner);

        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        ownerSDService.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }


}