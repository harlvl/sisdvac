package edu.pucp.sisdvac.dao;

import edu.pucp.sisdvac.domain.Trial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrialDao extends JpaRepository<Trial, Long> {
    List<Trial> findAll();

    Trial save(Trial trial);
}
