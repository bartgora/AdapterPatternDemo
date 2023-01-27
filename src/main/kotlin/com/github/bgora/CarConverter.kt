package com.github.bgora

import com.github.bgora.american.AmericanCar

class CarConverter {

    fun convert(americanCar: AmericanCar): Car {
        with(americanCar){
            val converted = maxSpeed * 1.609344
            return Car(name, horsePower, converted.toInt())
        }
    }
}