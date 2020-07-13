package com.github.gustavovitor.maker_example.service;

import com.github.gustavovitor.maker.service.ServiceMaker;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.repository.CarRepository;
import com.github.gustavovitor.maker_example.repository.specification.CarSpecification;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CarService extends ServiceMaker<CarRepository, Car, Long, Car, CarSpecification> {

    @Override
    public void beforeInsert(Car object) {
        businessLogic(object);
    }

    @Override
    public void beforePatch(Car savedObject, Map<String, Object> object) {
        if (object.containsKey("model")) {
            Car patchCar = new Car();
            patchCar.setModel(object.get("model").toString());
            businessLogic(patchCar);
        }
    }

    @Override
    public void beforeUpdate(Car savedObject, Car object) {
        businessLogic(object);
    }

    @Override
    public void beforeDelete(Car object) {
        if ("Tesla".toLowerCase().equals(object.getModel().trim().toLowerCase())) {
            throw new RuntimeException("Cannot remove Tesla's!");
        }
    }

    private void businessLogic(Car object) {
        this.cannotInsertToyotaModel(object);
    }

    private void cannotInsertToyotaModel(Car object) {
        if ("Toyota".toLowerCase().equals(object.getModel().trim().toLowerCase())) {
            throw new RuntimeException("Cannot insert toyota's.");
        }
    }

}
