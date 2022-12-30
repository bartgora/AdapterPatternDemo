package com.github.bgora;

import com.github.bgora.american.AmericanCar;

import java.util.*;
import java.util.stream.Collectors;

public class CarDealerFacade {

    private final Map<String, AmericanCar> americanCarMap;
    private final Map<String, Car> carMap;

    public CarDealerFacade() {
        americanCarMap = new HashMap<>();
        carMap = new HashMap<>();
    }

    public void importFromUSA(final AmericanCar americanCar) {
        this.americanCarMap.put(americanCar.name(), americanCar);
    }

    public void importFromUSA(final List<AmericanCar> americanCars) {
        americanCars.stream().map(americanCar -> this.americanCarMap.putIfAbsent(americanCar.name(), americanCar));
    }

    public Car sellCar(final String name) {
        var oldCar = americanCarMap.get(name);
        var newSpeed = oldCar.maxSpeed() * 1.609344;
        var newCar = new Car(oldCar.name(), oldCar.horsePower(), (int) newSpeed);
        return newCar;
    }

    public List<Car> sellCars(final List<String> names) {
        return carMap.entrySet()
                     .stream()
                     .filter(stringCarEntry -> names.contains(stringCarEntry.getKey()))
                     .map(stringCarEntry -> stringCarEntry.getValue())
                     .collect(
                             Collectors.toList());
    }
}
