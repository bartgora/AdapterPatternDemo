package com.github.bgora.american

import java.util.stream.Collectors

object AmericanCarFactory {

    fun createCar(name: String, horsePower: Int, maxSpeed: Int): AmericanCar {
        return AmericanCar(name, horsePower, maxSpeed)
    }

    fun produce(cars: List<String>): List<AmericanCar> {
        return cars.stream().map { car: String ->
            val attributes = car.split(";".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            createCar(attributes[0], attributes[1].toInt(), attributes[2].toInt())
        }.collect(Collectors.toList())
    }
}