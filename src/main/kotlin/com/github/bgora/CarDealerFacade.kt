package com.github.bgora

import com.github.bgora.american.AmericanCar

class CarDealerFacade {

    private val americanCarMap: MutableMap<String, AmericanCar> = HashMap()
    private val carConverter: CarConverter = CarConverter()

    fun importFromUSA(americanCar: AmericanCar) {
        americanCarMap[americanCar.name] = americanCar
    }

    fun importFromUSA(americanCars: List<AmericanCar>) {
        americanCars.stream()
                .map { americanCar: AmericanCar -> americanCarMap.putIfAbsent(americanCar.name, americanCar) }
    }

    fun sellCar(name: String): Car? {
        return americanCarMap[name]?.let { carConverter.convert(it) }
    }

    fun sellCars(names: List<String>): List<Car>? {
        return americanCarMap.entries
                .stream()
                .filter { names.contains(it.key) }
                .map { carConverter.convert(it.value) }
                .toList()
    }
}