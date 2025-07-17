package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void printEmrah() {
        System.out.println("emrah hoca" + batterySize);
    }


    @Override
    public String drive() {
        return "run from Electric car";
    }
    @Override
    public String startEngine() {

        runEngine(this);
        return getName() + " car starting...";
    }


}