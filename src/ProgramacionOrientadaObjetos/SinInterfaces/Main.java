package ProgramacionOrientadaObjetos.SinInterfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();

        Empleado juanito = new Empleado("Juancito", 30, 50000, true);
        Empleado patricia = new Empleado("Juancito", 30, 50000, true);
        Empleado roberto = new Empleado("Juancito", 30, 50000, true);

        System.out.println(juanito);

        // guardar empleados

        empleadoCRUDV1.save(juanito);
        empleadoCRUDV1.save(patricia);
        empleadoCRUDV1.save(roberto);

        // consultar empleados\
        List<Empleado> empleados = empleadoCRUDV1.findAll();
        System.out.println(empleados);

    }
}
