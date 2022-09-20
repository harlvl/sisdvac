package edu.pucp.sisdvac.service;

import edu.pucp.sisdvac.controller.dto.TrialDto;
import edu.pucp.sisdvac.domain.Trial;

import java.util.List;

public interface ITrialService {
    List<Trial> findALl();
    Trial save(TrialDto trialDto);
}
