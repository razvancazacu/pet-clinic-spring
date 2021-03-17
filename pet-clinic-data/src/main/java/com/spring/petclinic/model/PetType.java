package com.spring.petclinic.model;


import org.springframework.stereotype.Component;

@Component
public class PetType {


    private Long id;

    private String name;

    public String getNames() {
        return name;
    }

    public void setNames(String name) {
        this.name = name;
    }
}
