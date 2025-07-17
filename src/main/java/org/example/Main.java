package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car( 8,"base car");
        printStartEngine(car);

        Car mitsubishi = new Mitsubishi( 6,"Outlander VRX 4wd");
        printStartEngine(mitsubishi);

        Car ford = new Ford( 6,"Ford Falcon");
        printStartEngine(ford);

        Car holden = new Holden( 6,"Holden Commodore");
        printStartEngine(holden);
    }

    private static void printStartEngine(Car car) {

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }

}