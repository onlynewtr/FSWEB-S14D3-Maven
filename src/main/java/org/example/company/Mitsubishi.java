package org.example.company;

public class Mitsubishi extends Car{
    public Mitsubishi( int cylinder,String name) {
        super( cylinder,name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting!";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " is accelerating!";
    }

    @Override
    public String brake() {

        super.brake();
        return getName() + " is braking!";
    }
}