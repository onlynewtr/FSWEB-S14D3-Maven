package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla", "electrical car", 100, 4);
        CarSkeleton hybridCar = new HybridCar("toyota", "tt", 0.8, 100, 4);
        CarSkeleton gasCar = new GasPoweredCar("honda", "honda dummy desc", 10, 4);


        // cast yaparak child objenin kendine ait parent objede olmayan metoduna erişim.
        ElectricCar castedElectricCar = (ElectricCar) electricCar;

        printResult(castedElectricCar);
        castedElectricCar.printEmrah();

        System.out.println("----------------");
        printResult(electricCar);
        printResult(hybridCar);
        printResult(gasCar);
    }

    private static void printResult(CarSkeleton car) {
        System.out.println(car.drive());
    }
}