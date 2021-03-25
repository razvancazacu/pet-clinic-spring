package com.spring.petclinic.model.services.map;

import com.spring.petclinic.model.Speciality;
import com.spring.petclinic.model.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {
}
