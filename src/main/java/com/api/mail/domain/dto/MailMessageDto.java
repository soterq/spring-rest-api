package com.api.mail.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailMessageDto {
    private String sendFrom;
    private String title;
    private String message;
}
