package com.springframework.petclinicspring.repositories;

import com.springframework.petclinicspring.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
