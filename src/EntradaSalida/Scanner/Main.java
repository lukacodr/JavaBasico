package EntradaSalida.Scanner;

import java.io.*;
import java.util.Scanner;

//Buena para solicitar datos de un usuario.
public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mete dos numero: ");
            String a = scanner.next();
            String b = scanner.next();
            System.out.println("Enteros son: " + a + " " + b);

            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new  BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.println((char) dato);
                    dato = ficheroBuffer.read();
                }


            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

