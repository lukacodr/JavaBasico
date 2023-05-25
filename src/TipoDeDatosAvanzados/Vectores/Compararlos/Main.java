package TipoDeDatosAvanzados.Vectores.Compararlos;
//Como saber si un vector es igual a otro vecot r
//Como se compara un vector con otro vector?
//Tomamos el vector original e invocamos al metodo equals y entre () como
//parametro le pasamos el vector con el que queremos compararlo
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector <Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);

        Vector <Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);
    }
}
