//Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
package Ejercicios.SevenEightNine.Tres;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for (int i = 1; i <= 1000; i++) {
            vector.add(i);
        }
        System.out.println("Tamaño del vector: " + vector.size());
    }
}