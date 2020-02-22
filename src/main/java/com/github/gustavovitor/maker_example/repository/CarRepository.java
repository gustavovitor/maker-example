package com.github.gustavovitor.maker_example.repository;

import com.github.gustavovitor.maker.repository.MongoRepositoryMaker;
import com.github.gustavovitor.maker_example.domain.Car;

public interface CarRepository extends MongoRepositoryMaker<Car, String> {}
