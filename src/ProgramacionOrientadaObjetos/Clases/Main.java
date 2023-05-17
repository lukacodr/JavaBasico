package ProgramacionOrientadaObjetos.clases;

public class Main {

    public static void main(String[] args) {

        // Clase identificador = new Clase();

        // Crear un objeto utilizando el constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        // Crear un objeto utilizando el contructor con parametros
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

        Vehiculo fordMondeo = new Vehiculo("Ford","Mondeo", 2.2, 2010, false, 0, motorGTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed); // 0
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed); // 50

        // 2. herencia
        Motocicleta


        // 3. polimorfismo
        Vehiculo vehiculo;

        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante =         ""
    }
}
