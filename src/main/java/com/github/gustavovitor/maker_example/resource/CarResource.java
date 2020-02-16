package com.github.gustavovitor.maker_example.resource;

import br.com.gustavomiranda.maker.resource.ResourceMaker;
import com.github.gustavovitor.maker_example.domain.Car;
import com.github.gustavovitor.maker_example.service.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarResource extends ResourceMaker<CarService, Car, Long> {}

/*
* This resource are made using ResourceMaker, using this maker, you can
* made a simple padronized API including:
*
* Find by id method!
* GET on {your_server_url}:{your_server_port}/{your_context}/car/{carId}
* One findById method.
*
* Find All method!
* PUT on {your_server_url}:{your_server_port}/{your_context}/car/search
* findAll method call with Specification object body. Example:
*   body: {
*       {
*           "model": "S"
*       }
*   }
* The Maker returns for you all cars with "S" on Model because your specification have a like predicate on Car model.
*
* Pageable method!
* PUT on {your_server_url}:{your_server_port}/{your_context}/car/search/page
* findAll method call with ObjectPageableRequest<SpecificationObject> object body. Example (using car):
*   body: {
*       {
*           object: {
*               "model": "S"
*           }
*           pageable: {
*               "page": 0,
*               "size": 10,
*               "sort": {spring sort logic}
*           }
*       }
*   }
*
* Insert method!
* POST on {your_server_url}:{your_server_port}/{your_context}/car
* insert method call with Car object.
*
* Update method!
* PUT on {your_server_url}:{your_server_port}/{your_context}/car/{objectId}
* update method call with Car object.
*
* Patch method!
* PATCH on {your_server_url}:{your_server_port}/{your_context}/car/{objectId}
* patch method call with Car object.
*
* Delete method!
* DELETE on {your_server_url}:{your_server_port}/{your_context}/car/{objectId}
* delete method call.
*
* */
