package ImportantBaseData;

public class CarMain {


    public static void main(String[] args) {


        String car = "porsche";
        Car carObj = new HibridCar();


        Car carObj2 = new ElectricCar("rojo", "bmw", "m3",1570.23, 4.5, "motor");

        carObj2.acelerar(119);


        System.out.println(carObj2);

        carObj2.peso = 1500.2;

        System.out.println(carObj2);

        ElectricCar electricCar = new ElectricCar();

        electricCar.motorelectrico = "awd577cv";
        electricCar.color = "azul";
        electricCar.fabricante = "Tesla";
        electricCar.modelo = "ModelS";

        System.out.println(electricCar);

        ElectricCar electricCar2 = new ElectricCar("violeta","Toyota","Prius", 1300.34, 4.39, "TXZ");

        System.out.println(electricCar2);

        electricCar2.acelerar(50);

        System.out.println(electricCar2);


    }
}
