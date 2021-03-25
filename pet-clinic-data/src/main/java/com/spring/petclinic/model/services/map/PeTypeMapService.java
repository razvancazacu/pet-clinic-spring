package com.spring.petclinic.model.services.map;


import com.spring.petclinic.model.PetType;
import com.spring.petclinic.model.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class PeTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
}
