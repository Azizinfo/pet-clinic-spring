package com.springframework.petclinicspring.services;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID object);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
