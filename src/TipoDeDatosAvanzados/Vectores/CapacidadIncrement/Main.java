package TipoDeDatosAvanzados.Vectores.CapacidadIncrement;
//Cuando llegue a 50 no se va a duplicar, va a incrementar su capacidad actual en 15
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector(1,16);
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("datos del vector: " + vector);

        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());

    }
}


