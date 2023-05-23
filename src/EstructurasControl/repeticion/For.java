package EstructurasControl.repeticion;

public class For {

//son como las estructuras de control pero de repeticion, van a repetir codigo.
//i++ es

    public static void main(String[] args) {

        for (int i = 0; i < 16; i++) {
            //System.out.println("El numero de repeticiones que haz hecho es: " + i);


        }                   //0         1           2
        String[] nombres = {"Pepe", "Juanito", "Alfonso"}; // length 3
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        int suma = 0;
        int[] numeros = {5, 7, 8}; // length 3
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + (numeros[i]);


        }
    }

}
