package com.company;

public abstract class Car {

    // atributos //caracteristicas que tendria un coche y que varian de un coche a otro.
    //La clase coche actua como una plantilla. Podemos crear tantos ObjCoche como quisieramos
    // ya que por lo general los coches comparten una serias de caracteristicas, propiedades y comportamientos.
    String color;
    String fabricante;
    String modelo
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // constructores // metodos que nos permiten asignar valores a los atributos.

    public Car(){

    }
    public Car(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // comportamiento

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
