package com.gizet.services.h2database;

import com.gizet.model.BaseEntity;
import com.gizet.model.OwnerEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceImplTest {

    private final String ownerId = "Iasi";

    OwnerServiceImpl ownerService;

    @BeforeEach
    void setUp() {
        ownerService = new OwnerServiceImpl(new PetTypeServiceImpl(), new PetServiceImpl());
        ownerService.save(OwnerEntity.builder().city(ownerId).build());
    }

    @Test
    void findAll() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void findByLastName() {
    }
}