package Ejercicios.Four;

class SmartWatch extends SmartDevice {

    private String displayType;

    public SmartWatch() {
    }

    public SmartWatch(String brand, String model, double price, String displayType) {
        super(brand, model, price);
        this.displayType = displayType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Display Type: " + displayType);
    }
}