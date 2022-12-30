package com.github.bgora;

import java.util.*;

public class CarDealer {

    private final Map<String, Car> cars;

    public CarDealer() {
        cars = new HashMap<>();
    }

    public void addCar(Car car) {
        cars.put( car.getName(), car);
    }

    public Car sellCar(String name) {
        return cars.getOrDefault(name, null);

    }

    public Map<String, Car> showCars() {
        return Map.of();
    }
}
