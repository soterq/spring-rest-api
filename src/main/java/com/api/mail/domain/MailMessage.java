package com.api.mail.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MailMessage {
    private String sendFrom;
    private String title;
    private String message;
//    @Value("${spring.mail.username}")
//    private String sendTo;
}
