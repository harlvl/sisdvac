package edu.pucp.sisdvac.service;

import edu.pucp.sisdvac.controller.dto.ResearchDto;
import edu.pucp.sisdvac.controller.dto.TrialDto;

import java.util.List;

public interface IResearchService {
    List<ResearchDto> findAll();
    ResearchDto findById(Integer id);
    ResearchDto findByInsNumber(String key);
    ResearchDto save(ResearchDto dto);
    ResearchDto update(Integer id, ResearchDto dto);
}
