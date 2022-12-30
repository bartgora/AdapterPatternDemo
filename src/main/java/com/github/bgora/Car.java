package com.github.bgora;

public record Car(String name, Integer horsePower, Integer maxSpeed) {

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed + "km/h"+
                '}';
    }
}
