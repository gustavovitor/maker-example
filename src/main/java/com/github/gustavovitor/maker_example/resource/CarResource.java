package com.github.gustavovitor.maker_example.resource;

import com.github.gustavovitor.maker.resource.ResourceMaker;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.service.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarResource extends ResourceMaker<CarService, Car, Long, Car> {}
