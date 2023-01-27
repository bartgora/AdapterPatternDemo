package com.github.bgora

import com.github.bgora.american.AmericanCar
import com.github.bgora.american.AmericanCarFactory
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class CarDealerFacadeTest {

    private val tested: CarDealerFacade = CarDealerFacade()

    @Test
    fun shouldSellCar() {
        //given
        val givenCarName = "Ford"
        val giveCarHorse = 200
        val givenCarMaxSpeed = 120
        val americanCar: AmericanCar = AmericanCarFactory.createCar(givenCarName, giveCarHorse, givenCarMaxSpeed)

        //when
        tested.importFromUSA(americanCar)
        val car = tested.sellCar(givenCarName)
        val expectedSpeed = 193
        val exceptedString = "Car{" +
                "name='" + givenCarName + '\'' +
                ", horsePower=" + giveCarHorse +
                ", maxSpeed=" + expectedSpeed + "km/h" +
                '}'

        //then
        car.toString() shouldBe exceptedString
        car?.maxSpeed shouldBe  expectedSpeed

    }

    @Test
    fun shouldSellManyCars() {
        //given
        val givenCarNames: List<String> = listOf("Ford", "Pontiac", "Chevrolet", "Dodge Viper")
        val givenCars = listOf("Ford;200;120", "Pontiac;360;130", "Chevrolet;100;100", "Dodge Viper;500;150")
        val americanCars: List<AmericanCar> = AmericanCarFactory.produce(givenCars)

        //when
        tested.importFromUSA(americanCars)
        val cars = tested.sellCars(givenCarNames)
        val expectedSpeed = listOf(193, 209, 160, 241)

        //then
        var index = 0
        for ((_, _, maxSpeed) in cars!!) {
            maxSpeed shouldBe expectedSpeed[index++]
        }
    }
}