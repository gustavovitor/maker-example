package com.github.gustavovitor.maker_example.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Car {

    @Id
    private String id;

    private String model;

}
