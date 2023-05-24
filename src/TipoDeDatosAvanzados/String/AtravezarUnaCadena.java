package TipoDeDatosAvanzados.String;

public class AtravezarUnaCadena {

    public static void main(String[] args) {
        String cadena = "Mensaje de Texto";
//                       0123456789012345

        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }
    }
}
