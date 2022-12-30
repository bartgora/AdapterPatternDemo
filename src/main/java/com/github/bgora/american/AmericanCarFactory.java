package com.github.bgora.american;

import java.util.List;
import java.util.stream.Collectors;

public class AmericanCarFactory {

    public static AmericanCar createCar(final String name, final Integer horsePower, final Integer maxSpeed) {
        return new AmericanCar(name, horsePower, maxSpeed);
    }

    public static List<AmericanCar> produce(List<String> cars) {
        return cars.stream().map(car -> {
            var attributes = car.split(";");
            return createCar(attributes[0], Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]));
        }).collect(Collectors.toList());
    }
}


