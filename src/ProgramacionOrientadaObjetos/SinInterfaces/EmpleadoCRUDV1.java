package ProgramacionOrientadaObjetos.SinInterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
 */

public class EmpleadoCRUDV1 {

    // Estructura de datos
    List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD

    // Create - Guardar un empleado
    public void save(Empleado empleado) {
        empleados.add(empleado);

    }

    public List<Empleado> findAll() {
        return empleados;
    }
}
