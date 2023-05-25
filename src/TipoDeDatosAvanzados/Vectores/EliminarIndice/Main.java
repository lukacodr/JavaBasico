package TipoDeDatosAvanzados.Vectores.EliminarIndice;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("datos del vector: " + vector);

        vector.remove(2);
        System.out.println("datos del vector: " + vector);


    }
}

