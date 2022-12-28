package com.github.bgora;

public class Car {

    private Integer horsePower;
    private Integer maxSpeed;

    public Car(final Integer horsePower, final Integer maxSpeed) {
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
        return "Car{" +
                "horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed + "km/h" +
                '}';
    }
}
