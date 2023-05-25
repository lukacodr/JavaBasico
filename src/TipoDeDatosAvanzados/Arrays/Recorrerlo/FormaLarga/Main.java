package TipoDeDatosAvanzados.Arrays.Recorrerlo.FormaLarga;
// Porque usaria la forma larga en vez de la corta?
// Con la forma larga obtenemos la posicion del array, el indice
// La variable i utilizada en los for viene de index
public class Main {

    public static void main(String[] args) {
        String nombres[] = {
                "Pepe",
                "Juan",
                "Pedro",
        };
    for (int i = 0; i < nombres.length; i++) {
        System.out.println("Nombre actual: " + nombres[i] + " en posicion: " + i);

        }
    }
}
