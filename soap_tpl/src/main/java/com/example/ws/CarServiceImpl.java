package com.example.ws;

import javax.jws.WebService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

@WebService(endpointInterface = "com.example.ws.CarService")
public class CarServiceImpl implements CarService {

    
      private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car("11AA22","ferrari",200,false),
            new Car("AA11BB","twizi",70,false)));
     
    @Override
    public Car getCar(String plateNumber) {
    	return cars.stream().filter(car->Objects.nonNull(car.getPlateNumber()) && car.getPlateNumber().equalsIgnoreCase(plateNumber)).findFirst().orElse(null);
    }

    @Override
    public boolean rentCar(String plateNumber) {
    	Optional<Car> found = cars.stream() // permet d’encapsuler un objet dont la valeur peut être null
    			.filter(car -> car.getPlateNumber().equalsIgnoreCase(plateNumber)) // This method compares this String to another String, ignoring case considerations.
    			.findFirst(); // findFirst() returns the first element found
    	   return found.isPresent() && found.get().rentCar();
    }

    @Override
    public boolean getBackCar(String plateNumber) {
    	Optional<Car> found = cars.stream()
    			.filter(car -> car.getPlateNumber().equalsIgnoreCase(plateNumber))
    			.findFirst();
    	return found.isPresent() && found.get().getBackCar();
    }
}

