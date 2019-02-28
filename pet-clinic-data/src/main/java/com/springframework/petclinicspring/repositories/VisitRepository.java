package com.springframework.petclinicspring.repositories;

import com.springframework.petclinicspring.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
