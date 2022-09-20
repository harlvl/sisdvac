package edu.pucp.sisdvac.dao;

import edu.pucp.sisdvac.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
    Role findByName(String role);
}
