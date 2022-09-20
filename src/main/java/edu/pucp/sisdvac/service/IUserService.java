package edu.pucp.sisdvac.service;

import edu.pucp.sisdvac.controller.dto.UserDto;
import edu.pucp.sisdvac.domain.Role;
import edu.pucp.sisdvac.domain.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

    List<UserDto> getUsers2();
}
