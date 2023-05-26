package TipoDeDatosAvanzados.ArrayList.ListaEnArray;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

       String array[] = new String[lista.size()];
       for (int i = 0; i < lista.size(); i++) {
           array[i] = lista.get(i);

       }
       for (String elemento : array) {
           System.out.println("Elemento es: " + elemento);
       }
       }
    }
