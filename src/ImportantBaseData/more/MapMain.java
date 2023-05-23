package ImportantBaseData.more;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {


        Map<String, String> personas = new HashMap<>();

        personas.put("Llave maestra", "Diego Ameglio");
        personas.put("Universo paralelo", "Alcaraz Ortiz");
        personas.put("Psicologia del exito", "Grandes Proceres");

        System.out.println(personas);

        for(String key : personas.keySet()){
            System.out.println(key);
        }
        for(String value : personas.values()){
            System.out.println(value);
        }
        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() +  " ; " + pair.getValue());
        }
    }

}