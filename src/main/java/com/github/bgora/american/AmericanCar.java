package com.github.bgora.american;

public class AmericanCar {

    private final String name;
    private final Integer horsePower;
    private final Integer maxSpeed;

    public AmericanCar(final String name, final Integer horsePower, final Integer maxSpeed) {
        this.name = name;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed + "MPH" +
                '}';
    }
}
