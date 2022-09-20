package edu.pucp.sisdvac.dao.parser;

import edu.pucp.sisdvac.controller.dto.TrialDto;
import edu.pucp.sisdvac.domain.Trial;

public class TrialParser {
    public static TrialDto toDto(Trial trial) throws InstantiationException, IllegalAccessException  {
        return BaseParser.parse(trial, TrialDto.class);
    }

    public static Trial fromDto(TrialDto trialDto) throws InstantiationException, IllegalAccessException {
        return BaseParser.parse(trialDto, Trial.class);
    }
}
