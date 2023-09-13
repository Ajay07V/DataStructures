package com.java8.patterns;

class Vehicle {
    private final String engine;
    private final int wheel;
    private final int airbags;

    private Vehicle(VehicleBuilder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.airbags = builder.airbags;
    }

    public String getEngine() {
        return this.engine;
    }

    public int getWheel() {
        return this.wheel;
    }

    public int getAirbags() {

        return this.airbags;
    }

    public static class VehicleBuilder {
        private final String engine;
        private final int wheel;
        private int airbags;

        //for vehicle engine and wheel are the mandatory items
        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        //Airbags are optional for the vehicle
        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;

        }

        public Vehicle build() {
            return new Vehicle(this);
        }

    }

}

public class BuilderPattern {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder("Diesel engine", 4).setAirbags(2).build();
        Vehicle bike = new Vehicle.VehicleBuilder("petrol engine", 2).build();
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());
        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());
    }

}
