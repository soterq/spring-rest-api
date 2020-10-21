package com.api.mail.domain.dto;

import com.api.mail.domain.MailMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MailMessageMapper {
    MailMessageMapper INSTANCE = Mappers.getMapper(MailMessageMapper.class);
    @Mappings({
            @Mapping(source = "sendFrom", target = "sendFrom"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "message", target = "message")
    })
    MailMessage fromDto(MailMessageDto place);
}
