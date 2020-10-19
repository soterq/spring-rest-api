package com.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class ExistingPlace {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @NotBlank
        private String name;

        public ExistingPlace(String name) {
                this.name = name;
        }
}
