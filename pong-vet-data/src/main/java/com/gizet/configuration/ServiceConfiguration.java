package com.gizet.configuration;

import com.gizet.services.OwnerService;
import com.gizet.services.VetService;
import com.gizet.services.map.OwnerServiceMapping;
import com.gizet.services.map.VetServiceMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public OwnerService initializeOwnerService() {
        return new OwnerServiceMapping();
    }

    @Bean
    public VetService initializeVetService() {
        return new VetServiceMapping();
    }
}
