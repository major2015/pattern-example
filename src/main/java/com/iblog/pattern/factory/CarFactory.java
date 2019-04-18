package com.iblog.pattern.factory;

public class CarFactory {
    private CarFactory() {
        //Prevent instantiation
    }

    public static Car buildCar(CarType model) {
        Car car = null;
        Location location = Location.USA; //Read location property somewhere from configuration

        //Use location specific car factory
        switch (location) {
            case USA:
                car = USACarFactory.buildCar(model);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(model);
                break;
            case DEFAULT:
                car = DefaultCarFactory.buildCar(model);
                break;
            default:
                // throw some exception
                break;
        }
        return car;
    }
}
