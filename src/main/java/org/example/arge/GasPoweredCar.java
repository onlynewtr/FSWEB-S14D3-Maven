package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double averageKmPerLiter;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting...";
    }

    @Override
    public String drive() {
        return "run from gaspowered car";
    }

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public void setAverageKmPerLiter(double averageKmPerLiter) {
        this.averageKmPerLiter = averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}