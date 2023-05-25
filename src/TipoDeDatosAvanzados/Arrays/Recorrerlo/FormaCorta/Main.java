package TipoDeDatosAvanzados.Arrays.Recorrerlo.FormaCorta;
// En la forma corta solo vemos el contenido, sin ningun contador
public class Main {

    public static void main(String[] args) {
        String nombres[] = {
                "Pepe",
                "Juan",
                "Pedro",
        };
        for (String nombre : nombres) {
            System.out.println("Nombre actual: " + nombre);
        }
    }
}
