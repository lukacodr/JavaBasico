package company1;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }
    /**
     * Metodo que lee nombre de consola y verifica que tengan longitud igual o mayot que 8
     * caracteres
     * @throws NameFormatException es la asignatura del metodo para indicar que lanza una exception
     * throw para crear la exception y lanzarla
     *
     */
    private static void leerNombres() throws NameFormatException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona: ");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }
        }
        teclado.close();
    }

}
