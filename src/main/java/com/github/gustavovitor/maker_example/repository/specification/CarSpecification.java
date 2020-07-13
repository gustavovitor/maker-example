package com.github.gustavovitor.maker_example.repository.specification;

import com.github.gustavovitor.maker.repository.SpecificationBase;
import com.github.gustavovitor.maker_example.domain.Car;

import javax.management.ReflectionException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class CarSpecification extends SpecificationBase<Car> {

    public CarSpecification(Car car) throws ReflectionException {
        super(car);
    }

    @Override
    protected List<Predicate> predicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder, Car object) {
        List<Predicate> predicates = new ArrayList<>();

        if (nonNull(object.getModel())) {
            predicates.add(criteriaBuilder.like(root.get("model"), "%" + object.getModel() + "%"));
        }

        return predicates;
    }

}
