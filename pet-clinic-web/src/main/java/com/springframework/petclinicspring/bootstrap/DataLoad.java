package com.springframework.petclinicspring.bootstrap;

import com.springframework.petclinicspring.model.Owner;
import com.springframework.petclinicspring.model.Vet;
import com.springframework.petclinicspring.services.OwnerService;
import com.springframework.petclinicspring.services.VetService;
import com.springframework.petclinicspring.services.map.OwnerServiceMap;
import com.springframework.petclinicspring.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoad implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoad() {
       ownerService = new OwnerServiceMap();
       vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}
