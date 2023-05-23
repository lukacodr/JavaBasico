package Ejercicios.Four;

public class Main {

    public static void main(String[] args) {

        // Crear un objeto SmartPhone
        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S23Ultra", 1299.99, "Android 13");
        smartPhone.displayInfo();
        System.out.println();


        // Crear un objeto SmartWatch
        SmartWatch smartWatch = new SmartWatch("Apple", "Apple Watch Series 8", 399.99, "OLED");
        smartWatch.displayInfo();
    }
}