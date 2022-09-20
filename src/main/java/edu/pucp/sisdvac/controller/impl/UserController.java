package edu.pucp.sisdvac.controller.impl;

import edu.pucp.sisdvac.controller.dto.AddRoleToUserDto;
import edu.pucp.sisdvac.domain.Role;
import edu.pucp.sisdvac.domain.User;
import edu.pucp.sisdvac.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1.0/sisdvac/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<Object> getUsers() {
        LOGGER.info("Retrieving users");
        return ResponseEntity.ok().body(userService.getUsers2());
    }

    @PostMapping("/save")
    public ResponseEntity<Object> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/v1.0/sisdvac/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Object> saveRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/v1.0/sisdvac/user/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    @PostMapping("/role/add")
    public ResponseEntity<Object> saveRoleToUser(@RequestBody AddRoleToUserDto dto) {
        userService.addRoleToUser(dto.getUsername(), dto.getRoleName());
        return ResponseEntity.ok().build();
    }
}
