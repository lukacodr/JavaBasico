package ProgramacionOrientadaObjetos.Interfaces;

public class Main {

    public static void main(String[] args) {


        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juancito", 30, 50000, true );
        Empleado patricia = new Empleado("Juancito", 30, 50000, true );
        Empleado roberto = new Empleado("Juancito", 30, 50000, true );

        empleadoCRUD.guardar(juanito);
        empleadoCRUD.guardar(patricia);
        empleadoCRUD.guardar(roberto);

       //-22min que son las interfaces
    }
}
