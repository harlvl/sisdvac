package edu.pucp.sisdvac.service.impl;

import edu.pucp.sisdvac.controller.dto.UserDto;
import edu.pucp.sisdvac.dao.RoleDao;
import edu.pucp.sisdvac.dao.UserDao;
import edu.pucp.sisdvac.dao.parser.UserParser;
import edu.pucp.sisdvac.domain.Role;
import edu.pucp.sisdvac.domain.User;
import edu.pucp.sisdvac.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    private final UserDao userDao;
    private final RoleDao roleDao;

    public UserService(UserDao userDao, RoleDao roleDao) {
        this.userDao = userDao;
        this.roleDao = roleDao;
    }

    @Override
    public User saveUser(User user) {
        LOGGER.info("Saving user");
        return userDao.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        LOGGER.info("Saving role");
        return roleDao.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userDao.findByUsername(username);
        Role role = roleDao.findByName(roleName);
        user.getRoles().add(role); // because of the Transactional annotation this already saves the user in DB
    }

    @Override
    public User getUser(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        LOGGER.info("Getting users");
        List<User> users = userDao.findAll();
        if (users.isEmpty()) {
            LOGGER.info("No users");
        } else {
            LOGGER.info("Yes users");
        }
        return users;
    }

    @Override
    public List<UserDto> getUsers2() {
        List<UserDto> userDtos = new ArrayList<>();
        List<User> users = userDao.findAll();
        for (User user : users) {
            try {
                UserDto userDto = UserParser.toDto(user);
                userDtos.add(userDto);
            } catch (Exception e) {
                LOGGER.error(e.getMessage());
            }
        }

        return userDtos;
    }
}
