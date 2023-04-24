package edu.pucp.sisdvac.controller;

import edu.pucp.sisdvac.controller.dto.VolunteerDto;
import org.springframework.http.ResponseEntity;

public interface IVolunteerController {
    ResponseEntity<?> findAll();
    ResponseEntity<?> save(VolunteerDto volunteerDto);
    ResponseEntity<?> update(VolunteerDto volunteerDto);
}
