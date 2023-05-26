package TipoDeDatosAvanzados.ArrayList.Mapas.EliminarValoresMapas;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.remove("clave2");
        System.out.println(mapa);

    }

}
