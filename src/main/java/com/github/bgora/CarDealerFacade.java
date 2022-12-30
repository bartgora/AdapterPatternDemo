package com.github.bgora;

import com.github.bgora.american.AmericanCar;

import java.util.*;

public class CarDealerFacade {

    private final Map<String, AmericanCar> americanCarMap;

    public CarDealerFacade() {
        americanCarMap = new HashMap<>();
    }

    public void importFromUSA(final AmericanCar americanCar) {
        this.americanCarMap.put(americanCar.name(), americanCar);
    }

    public void importFromUSA(final List<AmericanCar> americanCars) {
        americanCars.stream().map(americanCar -> this.americanCarMap.putIfAbsent(americanCar.name(), americanCar));
    }

    public Car sellCar(final String name) {
        return null;
    }

    public List<Car> sellCars(final List<String> names) {
        return null;
    }
}
