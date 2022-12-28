package com.github.bgora;

import java.util.function.Function;

public interface CarConverter extends Function<AmericanCar, Car> {

    @Override
    Car apply(AmericanCar americanCar);
}
