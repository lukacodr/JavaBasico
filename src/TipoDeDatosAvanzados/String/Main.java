package TipoDeDatosAvanzados.String;

public class Main {

    public static void main(String[] args) {
        String cadena = "MENSAJE DE texto";

        int cadenaLen = cadena.length();
        System.out.println("La longitud de la cadena es: " + cadenaLen);

        String cadenaMinus = cadena.toLowerCase();
        System.out.println("La cadena ahora es: " + cadenaMinus);

        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena ahora es: " + cadenaMayus);
    }
}
