package company1;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("nombre 1");
        nombres.add("nombre 2");
        nombres.add("nombre 3");
        nombres.add("nombre 4");

        System.out.println(nombres);

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();

        coches.add( new Coche("honda accord"));
        coches.add(new Coche("Bmw m3"));
        coches.add(new Coche("Bmw m4"));
        coches.add(new Coche("fiat 600"));

        System.out.println(coches);

        for (Coche coche : coches) {
            System.out.println(coche);
        }


    }

}
