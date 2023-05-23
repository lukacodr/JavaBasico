package ImportantBaseData;

public class ElectricCar extends Car{

    String motorelectrico;

    public ElectricCar(){

    }
    public ElectricCar(String motorelectrico){
        this.motorelectrico = motorelectrico;
    }

    public ElectricCar(String color, String fabricante, String modelo, Double peso, Double largo, String motorelectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorelectrico = motorelectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "motorelectrico='" + motorelectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
        




    }
}
