package com.springframework.petclinicspring.repositories;

import com.springframework.petclinicspring.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
