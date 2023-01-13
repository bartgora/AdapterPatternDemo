package com.github.bgora;

import com.github.bgora.american.AmericanCar;

public class CarConverter {


    public Car convert(AmericanCar americanCar){
        Integer speed = (int) (americanCar.maxSpeed() * 1.609344);
        return new Car(americanCar.name(),americanCar.horsePower(),speed);
    }
}
