package com.github.bgora;

public class AmericanCar {

    private Integer horsePower;
    private Integer maxSpeed;

    public AmericanCar(final Integer horsePower, final Integer maxSpeed) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
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
