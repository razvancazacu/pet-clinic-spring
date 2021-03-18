package com.spring.petclinic.model.services;


import com.spring.petclinic.model.Pet;

import java.util.Set;

public interface VetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();

}
