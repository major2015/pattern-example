package com.iblog.pattern.factory;

public class LuxuryCar extends Car {

    LuxuryCar(Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        // add accessories
    }
}
