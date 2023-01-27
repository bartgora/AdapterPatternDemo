package com.github.bgora.american


data class AmericanCar(val name: String, val horsePower: Int, val maxSpeed: Int) {

    override fun toString(): String {
        return "AmericanCar{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed + "MPH" +
                '}'
    }
}