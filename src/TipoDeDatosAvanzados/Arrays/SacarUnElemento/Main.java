package TipoDeDatosAvanzados.Arrays.SacarUnElemento;
// Ejemplo de una forma de sacar un elemton del array de una variable
// Que no este delimitada por el for
public class Main {

    public static void main(String[] args) {
        String[] nombres = {
                "Pepe",
                "Juan",
                "Pedro",
                "Lucas"

        };
        String ultimoNombre = "";
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);
            ultimoNombre = nombres[i];
        }

        System.out.println(ultimoNombre);
    }
}