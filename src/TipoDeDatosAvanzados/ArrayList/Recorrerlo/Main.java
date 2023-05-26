package TipoDeDatosAvanzados.ArrayList.Recorrerlo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

        for (Object arrayObjeto : lista.toArray()) {
            System.out.println(arrayObjeto.toString());

        }
    }
}
