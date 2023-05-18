package ProgramacionOrientadaObjetos.Interfaces;

public class Empleado {

    // 1. Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    // 2. Constructores
    public Empleado(){}

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

// Metodos
}
