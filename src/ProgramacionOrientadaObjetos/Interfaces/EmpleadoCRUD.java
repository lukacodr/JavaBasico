package ProgramacionOrientadaObjetos.Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */
public class EmpleadoCRUD {

    List<Empleado> empleados = new ArrayList<>();

    // Create - Guardar un empleado
    public void guardar(Empleado empleado){

        empleados.add(empleado);


    }


}
