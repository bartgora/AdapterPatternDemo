package com.github.bgora;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        var americanCar = new AmericanCar(100, 100);
        
        var car = Optional.of(americanCar).map(amcar -> new Car(amcar.getHorsePower(), amcar.getHorsePower()));
        
    }
}
