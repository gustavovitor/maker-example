package com.github.gustavovitor.maker_example.repository;

import br.com.gustavomiranda.maker.repository.RepositoryMaker;
import com.github.gustavovitor.maker_example.domain.Car;

public interface CarRepository extends RepositoryMaker<Car, Long> {}
