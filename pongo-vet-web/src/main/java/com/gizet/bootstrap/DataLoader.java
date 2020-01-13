package com.gizet.bootstrap;

import com.gizet.model.OwnerEntity;
import com.gizet.model.PetEntity;
import com.gizet.model.PetTypeEntity;
import com.gizet.model.SpecialityEntity;
import com.gizet.model.VetEntity;
import com.gizet.model.VisitEntity;
import com.gizet.services.interfaces.OwnerService;
import com.gizet.services.interfaces.PetTypeService;
import com.gizet.services.interfaces.SpecialityService;
import com.gizet.services.interfaces.VetService;
import com.gizet.services.interfaces.VisitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService PetTypeEntityService;
    private final SpecialityService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService PetTypeEntityService,
                      SpecialityService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.PetTypeEntityService = PetTypeEntityService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();

    }

    private void loadData() {
        PetTypeEntity dog = new PetTypeEntity();
        dog.setName("Dog");
        PetTypeEntity savedDogPetTypeEntity = PetTypeEntityService.save(dog);

        PetTypeEntity cat = new PetTypeEntity();
        cat.setName("Cat");
        PetTypeEntity savedCatPetTypeEntity = PetTypeEntityService.save(cat);

        SpecialityEntity radiology = new SpecialityEntity();
        radiology.setDescription("Radiology");
        SpecialityEntity savedRadiology = specialtyService.save(radiology);

        SpecialityEntity surgery = new SpecialityEntity();
        surgery.setDescription("Surgery");
        SpecialityEntity savedSurgery = specialtyService.save(surgery);

        SpecialityEntity dentistry = new SpecialityEntity();
        dentistry.setDescription("dentistry");
        SpecialityEntity savedDentistry = specialtyService.save(dentistry);

        OwnerEntity owner1 = new OwnerEntity();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("1231231234");

        PetEntity mikesPet = new PetEntity();
        mikesPet.setPetType(savedDogPetTypeEntity);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        OwnerEntity owner2 = new OwnerEntity();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        PetEntity fionasCat = new PetEntity();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetTypeEntity);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        VisitEntity catVisit = new VisitEntity();
        catVisit.setPet(fionasCat);
        catVisit.setDate(LocalDateTime.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loaded Owners....");

        VetEntity vet1 = new VetEntity();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        VetEntity vet2 = new VetEntity();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}