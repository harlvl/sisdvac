package edu.pucp.sisdvac.service.impl;

import edu.pucp.sisdvac.controller.dto.TrialDto;
import edu.pucp.sisdvac.dao.TrialDao;
import edu.pucp.sisdvac.dao.parser.TrialParser;
import edu.pucp.sisdvac.domain.Trial;
import edu.pucp.sisdvac.service.ITrialService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrialService implements ITrialService {
    private final TrialDao trialDao;

    public TrialService(TrialDao trialDao) {
        this.trialDao = trialDao;
    }

    @Override
    public List<Trial> findALl() {
        return trialDao.findAll();
    }

    @Override
    public Trial save(TrialDto trialDto) {
        Trial trial = new Trial();
        try {
            trial = TrialParser.fromDto(trialDto);
        } catch (Exception e) {
        }

        return trialDao.save(trial);
    }
}
