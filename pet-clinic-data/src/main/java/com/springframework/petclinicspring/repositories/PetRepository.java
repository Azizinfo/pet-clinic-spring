package com.springframework.petclinicspring.repositories;

import com.springframework.petclinicspring.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
