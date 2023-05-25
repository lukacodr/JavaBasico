package TipoDeDatosAvanzados.Vectores.ComoSeUtiliza;

import java.util.Vector;

//Se utilizan en lugar de los arrays en muchos casos. A diferencia
//de estos, no les vamos a dar un tamaño inicial si no queremos,
//tampoco le vamos a dar un tamaño final si no queremos.Ya que se
// ajustan automaticamente al tipo de datos  que tengamos
//
public class Main {

    public static void main(String[] args) {
//Como utilizar un vector en Java:
        Vector <Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("datos del vector: " + vector);


    }
}
