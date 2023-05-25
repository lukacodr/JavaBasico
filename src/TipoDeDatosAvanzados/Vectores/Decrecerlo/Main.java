package TipoDeDatosAvanzados.Vectores.Decrecerlo;
//Crecer y decrecer un array tiene un costo computacional
//Si un vector esta creciendo constantemente, podemos realentizar la ejecucion
//de nuestro programa
//Para evitar esto vamos a intentar que tenga una capacidad lo mas proxima a lo
//Que nosotros estimamos que necesitemos,
//Intentemos no tener ni un tamaño muy grande ni muy pequeño
//Cuanto mas resize haya a nivel interno mas lento vamos a ir
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println("Capacidad: " + vector.capacity() + " Tamaño: " + vector.size());
        vector.trimToSize();
        System.out.println("Capacidad: " + vector.capacity() + " Tamaño: " + vector.size());

    }
}