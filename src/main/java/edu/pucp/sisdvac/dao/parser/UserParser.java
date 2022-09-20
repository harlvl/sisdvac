package edu.pucp.sisdvac.dao.parser;

import edu.pucp.sisdvac.controller.dto.UserDto;
import edu.pucp.sisdvac.domain.User;

public class UserParser {
    public static UserDto toDto(User user) throws InstantiationException, IllegalAccessException  {
        return BaseParser.parse(user, UserDto.class);
    }
}
