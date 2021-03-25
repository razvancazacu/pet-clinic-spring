package com.spring.petclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.util.NestedServletException;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class CrashControllerTest {
    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new ErrorController()).build();
    }

    @Test
    void triggerExceptionTest() {
        assertThrows(NestedServletException.class, () -> mockMvc.perform(get(ErrorController.URL_ERROR)));
    }
}