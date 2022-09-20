package edu.pucp.sisdvac;

import edu.pucp.sisdvac.domain.Role;
import edu.pucp.sisdvac.domain.User;
import edu.pucp.sisdvac.service.impl.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication ## enable security
@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class SisdvacApplication {

    public static void main(String[] args) {
        SpringApplication.run(SisdvacApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "John", "john", "1234"));
            userService.saveUser(new User(null, "Will", "will", "1234"));
            userService.saveUser(new User(null, "Jim", "jim", "1234"));
            userService.saveUser(new User(null, "Arnold", "arnold", "1234"));

            userService.addRoleToUser("john", "ROLE_USER");
            userService.addRoleToUser("will", "ROLE_MANAGER");
            userService.addRoleToUser("jim", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_USER");
            userService.addRoleToUser("arnold", "ROLE_ADMIN");
            userService.addRoleToUser("arnold", "ROLE_SUPER_ADMIN");
        };
    }
}
