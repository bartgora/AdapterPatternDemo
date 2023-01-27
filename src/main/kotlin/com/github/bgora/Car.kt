package com.github.bgora

@JvmRecord
data class Car(val name: String, val horsePower: Int, val maxSpeed: Int) {

    override fun toString(): String {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed + "km/h" +
                '}'
    }
}