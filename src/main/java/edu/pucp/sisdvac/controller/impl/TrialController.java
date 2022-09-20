package edu.pucp.sisdvac.controller.impl;

import edu.pucp.sisdvac.controller.ITrialController;
import edu.pucp.sisdvac.controller.dto.TrialDto;
import edu.pucp.sisdvac.service.ITrialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v0.1/sisdvac/trial")
public class TrialController implements ITrialController {
    private final ITrialService trialService;

    public TrialController(ITrialService trialService) {
        this.trialService = trialService;
    }

    @Override
    public ResponseEntity<Object> getPreclinicalTrials() {
        return null;
    }

    @Override
    public ResponseEntity<Object> getClinicalTrials() {
        return null;
    }

    @Override
    public ResponseEntity<Object> getTrial(Long id) {
        return null;
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<Object> saveTrial(@RequestBody final TrialDto trialDto) {
        return ResponseEntity.ok().body(trialService.save(trialDto));
    }

    @Override
    @PutMapping("/save")
    public ResponseEntity<Object> updateTrial(TrialDto trialDto) {
        return null;
    }

    @Override
    @GetMapping("/{trialCode}/{advanceCode}")
    public ResponseEntity<Object> getAdvance(@PathVariable("trialCode") final String trialCode, @PathVariable("advanceCode") final String advanceCode) {
        return null;
    }
}
