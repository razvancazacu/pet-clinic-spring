package com.spring.petclinic.model.services;


import com.spring.petclinic.model.Vet;

import java.util.Set;

public interface PetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();

}
