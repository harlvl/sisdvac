package edu.pucp.sisdvac.controller;

import org.springframework.http.ResponseEntity;

public interface IUserController {
    ResponseEntity<Object> getUser(String username);
}
