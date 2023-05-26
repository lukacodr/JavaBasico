package TipoDeDatosAvanzados.ArrayList.ComoSeDeclara;
//Diferencias con los vectores es que no tienen capacidad, tiene la propiedad pero
//en automatico. Entonces cuando hay saturacion como se aumenta? Aumenta su
//capacidad un 50%, no el doble como los vectores

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //CapacityVector = CapacityVector * 2
        //
        // CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList + (CapacidadArrayList * 0.5);
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        lista.remove(1);


        for (String nombre : lista) {
            System.out.println(nombre);

            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }
}



