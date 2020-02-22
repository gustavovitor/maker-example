package com.github.gustavovitor.maker_example.service;

import com.github.gustavovitor.maker.service.MongoServiceMaker;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.repository.CarRepository;
import com.github.gustavovitor.maker_example.repository.specification.CarSpecification;
import org.springframework.stereotype.Service;

@Service
public class CarService extends MongoServiceMaker<CarRepository, Car, Long, Car, CarSpecification> {}
