package com.api.domain;

import com.api.enums.Severity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
public class Task {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String title;
    String description;
    String creationDate;
    Severity severity;


    public Task( String title, String description, Severity severity) {
        this.title = title;
        this.description = description;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        this.creationDate = dtf.format(now);
        this.severity = severity;
    }

    public Task() {
    }
}
