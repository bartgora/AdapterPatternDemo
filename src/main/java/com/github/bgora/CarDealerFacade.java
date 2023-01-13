package com.github.bgora;

import com.github.bgora.american.AmericanCar;

import java.util.*;
import java.util.stream.Collectors;

public class CarDealerFacade {

    private final Map<String, AmericanCar> americanCarMap;
    private final CarConverter carConverter;

    public CarDealerFacade() {
        americanCarMap = new HashMap<>();
        carConverter = new CarConverter();
    }

    public void importFromUSA(final AmericanCar americanCar) {
        this.americanCarMap.put(americanCar.name(), americanCar);
    }

    public void importFromUSA(final List<AmericanCar> americanCars) {
        americanCars.forEach(americanCar -> this.americanCarMap.putIfAbsent(americanCar.name(), americanCar));
    }

    public Car sellCar(final String name) {

        return Optional.ofNullable(americanCarMap.get(name)).map(carConverter::convert).orElse(null);
    }

    public List<Car> sellCars(final List<String> names) {
        return americanCarMap.entrySet()
                             .stream()
                             .filter((entry) -> names.contains(entry.getKey()))
                             .map(entry -> carConverter.convert(entry.getValue()))
                             .collect(Collectors.toList());
    }
}
