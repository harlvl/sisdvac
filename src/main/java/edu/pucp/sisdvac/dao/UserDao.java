package edu.pucp.sisdvac.dao;

import edu.pucp.sisdvac.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
