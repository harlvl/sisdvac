package edu.pucp.sisdvac.controller;

import edu.pucp.sisdvac.controller.dto.TrialDto;
import org.springframework.http.ResponseEntity;

public interface ITrialController {

    ResponseEntity<Object> getPreclinicalTrials();
    ResponseEntity<Object> getClinicalTrials();
    ResponseEntity<Object> getTrial(Long id);
    ResponseEntity<Object> saveTrial(TrialDto trialDto);
    ResponseEntity<Object> updateTrial(TrialDto trialDto);

    ResponseEntity<Object> getAdvance(String trialCode, String advanceCode);
}
