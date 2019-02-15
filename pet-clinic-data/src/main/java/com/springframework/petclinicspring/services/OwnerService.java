package com.springframework.petclinicspring.services;

import com.springframework.petclinicspring.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
