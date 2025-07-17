package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car( int cylinder,String name) {
        this.name = name;
        this.cylinders = cylinder;
        this.engine = Boolean.TRUE;
        this.wheels = 4;
    }

    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }


    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }

    public String brake() {
        printSimpleName();
        return "the car is braking";
    }

    private void printSimpleName() {
        System.out.println("Class name: " + getClass().getSimpleName());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Car car = (Car) object;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cylinder=" + cylinders +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}