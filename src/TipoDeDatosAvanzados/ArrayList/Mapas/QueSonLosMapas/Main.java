package TipoDeDatosAvanzados.ArrayList.Mapas.QueSonLosMapas;
//Un mapa es una especie de diccionario donde tenemos una clave y un valor.
//Ese valor, podria ser otro mapa, podria ser un Bigdecimal, podria ser un int,
//podria ser un string, podria ser un array.
//La forma mas primitiva de mapa es el HashMap
//Recibe muchos nombres, los dos mas comunes son: mapas y arrayAsociativo

import java.util.HashMap;

public class Main {
//Nuestro mapa es un diccionario, cuyas claves van a ser cadenas de texto y los
//valores asociados a cada una des esas clavez van a ser un entero
//Peculiaridad de los HashMap: No podemos tener la clave duplicada
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        //añadir un elemento a un mapa
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave3", 40);
        mapa.replace("clave4", 190);

        System.out.println(mapa);
        mapa.replace("clave3",90);
    }

}
