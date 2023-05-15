package ProgramacionOrientadaObjetos.clases;

public class Vehiculo {


    // 1. Atributos
    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sport;
    int speed;
    Motor motor;


    // 2. Constructores
    public Vehiculo() {


    }

    public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Vehiculo(String fabricante, int year, boolean sport, int speed) {
        this.fabricante = fabricante;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
    }

    // 3. Metodos (Comportamiento)
    public void acelerar(int quantity) {
        this.speed += quantity;

    }
    // getter y setter

    //toString

}
