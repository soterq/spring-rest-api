package com.api.domain;

import com.api.enums.Severity;
import com.api.helpers.DataAndTimeHelper;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Getter
@Setter
public class Task {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @NotBlank(message = "Title can not be empty")
    String title;
    String description;
    LocalDateTime creationDate;
    Severity severity;


    public Task( String title, String description, Severity severity) {
        this.title = title;
        this.description = description;
        this.creationDate = DataAndTimeHelper.getCurrentDataAndTime();
        this.severity = severity;
    }

    public Task() {
    }
}
