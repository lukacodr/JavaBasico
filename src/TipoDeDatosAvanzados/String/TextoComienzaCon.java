package TipoDeDatosAvanzados.String;

public class TextoComienzaCon {

    public static void main(String[] args) {
        String cadena = "Mensaje de Texto";

        boolean resultado = cadena.startsWith("Men");
        if (resultado) {
            System.out.println("Empieza por lo que estoy buscando");
        }
        else {
            System.out.println("No empieza por lo que quiero");
        }
    }
}
