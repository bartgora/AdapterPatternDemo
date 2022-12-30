package com.github.bgora;

import com.github.bgora.american.AmericanCarFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CarDealerFacadeTest {

    private final CarDealerFacade tested;

    CarDealerFacadeTest() {
        tested = new CarDealerFacade();
    }

    @Test
    void shouldSellCar() {
        //given
        var givenCarName = "Ford";
        var giveCarHorse = 200;
        var givenCarMaxSpeed = 120;

        var americanCar = AmericanCarFactory.createCar(givenCarName, giveCarHorse, givenCarMaxSpeed);

        //when
        tested.importFromUSA(americanCar);
        var car = tested.sellCar(givenCarName);

        var expectedSpeed = 193;
        var exceptedString = "Car{" +
                "name='" + givenCarName + '\'' +
                ", horsePower=" + giveCarHorse +
                ", maxSpeed=" + expectedSpeed + "km/h"+
                '}';

        //then
        assertThat(car.toString()).isEqualTo(exceptedString);
        assertThat(car.maxSpeed()).isEqualTo(expectedSpeed);
    }

    @Test
    void shouldSellManyCars() {
        //given
        var givenCarNames = List.of("Ford", "Pontiac", "Chevrolet", "Dodge Viper");
        var givenCars = List.of("Ford;200;120", "Pontiac;360;130", "Chevrolet;100;100", "Dodge Viper;500;150");


        var americanCars = AmericanCarFactory.produce(givenCars);

        //when
        tested.importFromUSA(americanCars);
        var cars = tested.sellCars(givenCarNames);

        var expectedSpeed = List.of(193, 209, 160, 241);

        //then
        var index = 0;
        for (Car car : cars){
            assertThat(car.maxSpeed()).isEqualTo(expectedSpeed.get(index++));
        }
    }
}