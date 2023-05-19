package Ejercicios.Four;

class SmartPhone extends SmartDevice {

    private String operatingSystem;

    public SmartPhone() {
    }

    public SmartPhone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
}

