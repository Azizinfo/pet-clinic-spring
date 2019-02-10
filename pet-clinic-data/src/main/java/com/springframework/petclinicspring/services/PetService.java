package com.springframework.petclinicspring.services;

import com.springframework.petclinicspring.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
