package TipoDeDatosAvanzados.Vectores.TamañoYCapacidad;
//Son dinamicos, se amplian automaticamente.
//Cuando creamos un vector, por debajo creamos un array de una capacidad determinada
//por el propio runtime. Cuando le damos valores estoy rellenando ese array que
//tenemos por debajo, en este caso tiene 10 elementos
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector <Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("datos del vector: " + vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

    }
}
