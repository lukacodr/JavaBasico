package EntradaSalida.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte datos[] = new byte[5];
                int dato = fichero.read();
                while (dato != -1) {
                    System.out.println((char) dato);
                    dato = fichero.read(datos);
                }


            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}