package com.github.gustavovitor.maker_example.service;

import com.github.gustavovitor.maker.service.ServiceMaker;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.repository.CarRepository;
import com.github.gustavovitor.maker_example.repository.specification.CarSpecification;
import org.springframework.stereotype.Service;

@Service
public class CarService extends ServiceMaker<CarRepository, Car, Long, Car, CarSpecification> {}
