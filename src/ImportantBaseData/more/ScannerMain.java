package ImportantBaseData.more;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero:");
        String numero = scanner.nextLine();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El numero introducido es: " + numero);

        System.out.println("Hola mundo");

    }
}
