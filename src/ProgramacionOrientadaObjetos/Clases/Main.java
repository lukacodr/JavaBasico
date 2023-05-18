package ProgramacionOrientadaObjetos.Clases;

import ProgramacionOrientadaObjetos.Clases.Vehiculo;
import ProgramacionOrientadaObjetos.Herencia.Camion;
import ProgramacionOrientadaObjetos.Herencia.Coche;
import ProgramacionOrientadaObjetos.Herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        // 1. Clases y Objetos
        // Clase identificador = new Clase();

        Vehiculo toyotaPrius = new Vehiculo();

       // Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo", 2.2, 2010, false, 0, "lzj");
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed); // 0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed); // 50

        // 2. Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "kawasaki";


        System.out.println("fin del programa");

        // 3. Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        // 4. Clases Abstractas: No se pueden instanciar, solo instancian las clases hijas


    }
}
