package com.example.spring.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Data
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;


    @NonNull
    private short direction;

    @NonNull
    @ManyToOne
    private Link link;

    // user
    // link
}
