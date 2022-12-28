package com.github.bgora;

public class DefaultCarConverter implements CarConverter{
    @Override
    public Car apply(final AmericanCar americanCar) {
        return new Car(americanCar.getHorsePower(), americanCar.getMaxSpeed());
    }
}
