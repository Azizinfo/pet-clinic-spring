package com.springframework.petclinicspring.repositories;

import com.springframework.petclinicspring.model.Owner;
import org.springframework.data.repository.CrudRepository;



public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
