package com.springframework.petclinicspring.services.springdatajpa;

import com.springframework.petclinicspring.model.Owner;
import com.springframework.petclinicspring.repositories.OwnerRepository;
import com.springframework.petclinicspring.repositories.PetRepository;
import com.springframework.petclinicspring.services.OwnerService;
import com.springframework.petclinicspring.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeService petTypeService;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeService petTypeService) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long along) {
        return ownerRepository.findById(along).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
       ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
       ownerRepository.deleteById(aLong);
    }
}
