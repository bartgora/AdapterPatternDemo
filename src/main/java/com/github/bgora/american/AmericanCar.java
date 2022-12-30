package com.github.bgora.american;

public record AmericanCar(String name, Integer horsePower, Integer maxSpeed) {

    @Override
    public String toString() {
        return "AmericanCar{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed + "MPH" +
                '}';
    }
}
