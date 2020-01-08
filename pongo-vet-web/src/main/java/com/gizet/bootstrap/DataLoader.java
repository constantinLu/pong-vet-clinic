package com.gizet.bootstrap;

import com.gizet.model.OwnerEntity;
import com.gizet.model.VetEntity;
import com.gizet.services.OwnerService;
import com.gizet.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Load data on startUp
 * Spring Boot Specific way.
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    // initialized from the ServiceConfigurationClass
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting loading the data. .  .");
        OwnerEntity owner1 = new OwnerEntity("Michael", "Wetson");
        OwnerEntity owner2 = new OwnerEntity("George", "Jetson");
        OwnerEntity owner3 = new OwnerEntity("Bob", "Dylan");
        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        System.out.println("Loaded Owners...");

        VetEntity vet1 = new VetEntity("Andrew", "Lungu");
        VetEntity vet2 = new VetEntity("Constantine", "Desp");
        vetService.save(vet1);
        vetService.save(vet2);
        System.out.println("Loaded Vets...");
    }
}
