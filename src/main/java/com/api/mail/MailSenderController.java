package com.api.mail;

import com.api.mail.domain.MailMessage;
import com.api.mail.domain.dto.MailMessageDto;
import com.api.mail.domain.dto.MailMessageMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(MailSenderController.BASE_URL)
public class MailSenderController {
    public static final String BASE_URL = "/api/v1/sendmail";
    private final JavaMailSender emailSender;
    @Value("${spring.mail.username}")
    String sendTo;
    public MailSenderController(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void sendSimpleMessage(@RequestBody MailMessageDto mailMessageDto) {
        SimpleMailMessage message = new SimpleMailMessage();
        MailMessage mailMessage = MailMessageMapper.INSTANCE.fromDto(mailMessageDto);
        message.setFrom(mailMessage.getSendFrom());
        message.setTo(sendTo);
        message.setSubject(mailMessage.getTitle());
        message.setText(mailMessage.getMessage());
        emailSender.send(message);
    }


}
