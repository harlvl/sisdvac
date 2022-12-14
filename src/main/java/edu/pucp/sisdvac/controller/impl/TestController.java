package edu.pucp.sisdvac.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/")
    public String home() {
        LOGGER.info("Homing");
        return "Home";
    }
}
