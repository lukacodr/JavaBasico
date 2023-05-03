package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Car car1 = new ElectricCar();

        ElectricCar car2 = new ElectricCar();

        HibridCar car3 = new HibridCar();

        // polimorfismo

        Car car4 = new ElectricCar();

        Car car5 = new HibridCar();

        if (car4 instanceof Car) {
            System.out.println("car");
        }

        if (car4 instanceof ElectricCar) {
            System.out.println("electric car");
        }
        if (car4 instanceof HibridCar) {
            System.out.println("hibrid car");
        }

    }
}
