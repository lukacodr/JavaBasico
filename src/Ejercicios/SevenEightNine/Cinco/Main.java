//Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
package Ejercicios.SevenEightNine.Cinco;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elemento 1");
        arrayList.add("Elemento 2");
        arrayList.add("Elemento 3");
        arrayList.add("Elemento 4");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("Elementos del ArrayList:");
        for (String value : arrayList) {
            System.out.println(value);
        }

        System.out.println("Elementos del LinkedList:");
        for (String value : linkedList) {
            System.out.println(value);
        }
    }
}
