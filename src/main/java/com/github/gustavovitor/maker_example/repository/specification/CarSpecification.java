package com.github.gustavovitor.maker_example.repository.specification;

import com.github.gustavovitor.maker.repository.MongoSpecificationBase;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.domain.QCar;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.*;

import javax.management.ReflectionException;

import static java.util.Objects.nonNull;

public class CarSpecification extends MongoSpecificationBase<Car> {

    public CarSpecification(Car car) throws ReflectionException {
        super(car);
    }

    public CarSpecification() { }

    @Override
    public Predicate toPredicate() {
        BooleanBuilder builder = new BooleanBuilder();
        if (nonNull(getObject().getModel())) {
            builder.and(QCar.car.model.containsIgnoreCase(getObject().getModel()));
        }
        return builder;
    }
}
