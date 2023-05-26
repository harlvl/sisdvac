package edu.pucp.sisdvac.controller.impl;

import edu.pucp.sisdvac.controller.ITrialController;
import edu.pucp.sisdvac.controller.dto.FormulationDto;
import edu.pucp.sisdvac.controller.dto.FormulationEvaluationDto;
import edu.pucp.sisdvac.controller.dto.TrialDto;
import edu.pucp.sisdvac.controller.response.PayloadObjectBuilder;
import edu.pucp.sisdvac.controller.response.RestResponse;
import edu.pucp.sisdvac.service.ITrialService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trial")
@RequiredArgsConstructor
public class TrialControllerImpl implements ITrialController {
    private final ITrialService service;
    @Override
    @GetMapping
    public ResponseEntity<?> findAll() {
        List<TrialDto> dtos = service.findAll();
        return ResponseEntity.ok().body(
                RestResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .payload(dtos)
                        .hits(dtos.size())
                        .build()
        );
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id") final Integer id) {
        return ResponseEntity.ok().body(
                RestResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .payload(service.findById(id))
                        .hits(1)
                        .build()
        );
    }

    @Override
    @GetMapping("/ins_number/{ins_number}")
    public ResponseEntity<?> findByInsNumber(@PathVariable(name = "ins_number") final String key) {
        return ResponseEntity.ok().body(
                RestResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .payload(service.findByInsNumber(key))
                        .hits(1)
                        .build()
        );
    }

    @Override
    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody TrialDto dto) {
        return ResponseEntity.ok().body(
                RestResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .payload(service.save(dto))
                        .status(HttpStatus.OK)
                        .build()
        );
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") final Integer id, @Valid @RequestBody TrialDto dto) {
        return ResponseEntity.ok().body(
                RestResponse.builder()
                        .timestamp(LocalDateTime.now())
                        .payload(service.update(id, dto))
                        .status(HttpStatus.OK)
                        .build()
        );
    }

    @Override
    @PatchMapping("/{id}/formulation/{key}")
    public ResponseEntity<?> updateFormulation(@PathVariable(name = "id") final Integer id, @PathVariable(name = "key") final Integer key, @RequestBody FormulationDto dto) {
        return null;
    }

    @Override
    @PostMapping("/{id}/formulation")
    public ResponseEntity<?> addFormulation(@PathVariable(name = "id") final Integer id, @Valid @RequestBody FormulationDto dto) {
        return ResponseEntity.ok().body(
                PayloadObjectBuilder.buildPayloadObject(service.addFormulation(id, dto))
        );
    }

    @Override
    @PostMapping("/{id}/formulation/{fid}/evaluate")
    public ResponseEntity<?> evaluateFormulation(@PathVariable(name = "id") final Integer id, @PathVariable(name = "fid") final Integer formulationId, @RequestBody FormulationEvaluationDto dto) {
        return ResponseEntity.ok().body(
                PayloadObjectBuilder.buildPayloadObject(service.evaluateFormulation(id, formulationId, dto))
        );
    }

    @Override
    @GetMapping("/{tid}/formulation/{fid}")
    public ResponseEntity<?> findFormulationEvaluation(@PathVariable(name = "tid") final Integer trialId, @PathVariable(name = "fid") final Integer formulationId) {
        return ResponseEntity.ok().body(
                PayloadObjectBuilder.buildPayloadObject(service.findFormulationEvaluation(trialId, formulationId))
        );
    }
}
