package com.github.gustavovitor.maker_example.repository.specification;

import com.github.gustavovitor.maker.repository.MongoSpecificationBase;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.domain.QCar;
import com.querydsl.core.types.*;

import javax.management.ReflectionException;

public class CarSpecification extends MongoSpecificationBase<Car> {

    public CarSpecification(Car car) throws ReflectionException {
        super(car);
    }

    @Override
    public Predicate toPredicate() {
        return QCar.car.model.containsIgnoreCase(getObject().getModel());
    }
}
