package com.springframework.petclinicspring.repositories;

import com.springframework.petclinicspring.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
