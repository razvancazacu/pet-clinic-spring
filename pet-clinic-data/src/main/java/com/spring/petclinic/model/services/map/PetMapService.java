package com.spring.petclinic.model.services.map;

import com.spring.petclinic.model.Pet;
import com.spring.petclinic.model.services.CrudService;
import com.spring.petclinic.model.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
