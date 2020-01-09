package com.gizet.bootstrap;

import com.gizet.model.OwnerEntity;
import com.gizet.model.PetEntity;
import com.gizet.model.PetTypeEntity;
import com.gizet.model.VetEntity;
import com.gizet.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Load data on startUp
 * Spring Boot Specific way.
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;


    // initialized from the ServiceConfigurationClass
    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Starting loading the data. .  .");

        //petTypes
        PetTypeEntity dog = new PetTypeEntity("Dog");
        PetTypeEntity cat = new PetTypeEntity("Cat");
        PetTypeEntity parrot = new PetTypeEntity("Parrot");
//        petTypeService.save(dog);
//        petTypeService.save(cat);
//        petTypeService.save(parrot);

        //owners
        OwnerEntity owner1 = new OwnerEntity("Michael", "Wetson");
        owner1.setAddress("Stefan cel Mare");
        owner1.setCity("Iasi");
        owner1.setTelephone("07534343112");
        OwnerEntity owner2 = new OwnerEntity("George", "Jetson");
        owner2.setAddress("Nicu Balcescu");
        owner2.setCity("Roman");
        owner2.setTelephone("0721554789");
        OwnerEntity owner3 = new OwnerEntity("Bob", "Dylan");
        owner2.setAddress("Eminescu");
        owner2.setCity("iasi");
        owner2.setTelephone("0711125478");

        ownerService.save(owner3);
        System.out.println("Loaded Owners...");

        //pets
        PetEntity pet1 = new PetEntity("Rascal", dog, owner1, LocalDate.of(1999, 12, 23));
        pet1.setOwnerEntity(owner1);
        petService.save(pet1);
        owner1.getPets().add(pet1);
        ownerService.save(owner1);

        PetEntity pet2 = new PetEntity("Kitty", cat, owner2, LocalDate.of(2010, 5, 2));
        pet2.setOwnerEntity(owner2);
        petService.save(pet2);
        owner2.getPets().add(pet2);
        ownerService.save(owner2);

        //vets
        VetEntity vet1 = new VetEntity("Andrew", "Lungu");
        VetEntity vet2 = new VetEntity("Constantine", "Desp");
        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded Vets...");


    }
}
