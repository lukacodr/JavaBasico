package TipoDeDatosAvanzados.String;

public class TextoTerminaCon {

    public static void main(String[] args) {
        String cadena = "Mensaje de Texto";

        boolean resultado = cadena.endsWith("xto");
        if (resultado) {
            System.out.println("Termina por lo que estoy buscando");
        }
        else {
            System.out.println("No termina por lo que quiero");
        }
    }
}
