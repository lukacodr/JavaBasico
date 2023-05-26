package TipoDeDatosAvanzados.ArrayList.ArrayListVsLinkedList;
//La primera diferencia es que una arrayList utiliza un array utiliza un array de
//forma subyacente y una LinkedList utiliza una estructura de datos que se llama
//lista doblemente enlazada.
//El arrayList es mucho mas rapido para almacenar y buscar datos. Sin embargo la
//linkedList es mas rapida cuando queremos modificar datos. Ni almacenar, ni buscar
//sino modificar
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");

      LinkedList<String> listaEnlazada = new LinkedList<String>(lista);

    }
}
