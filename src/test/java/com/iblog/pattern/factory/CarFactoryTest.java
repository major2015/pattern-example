package com.iblog.pattern.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarFactoryTest {

    @Test
    public void buildCar() {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}