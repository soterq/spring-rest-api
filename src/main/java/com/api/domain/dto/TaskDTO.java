package com.api.domain.dto;

import com.api.enums.Severity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class TaskDTO {
    Long id;
    String title;
    String description;
    LocalDateTime creationDate;
    Severity severity;
}
