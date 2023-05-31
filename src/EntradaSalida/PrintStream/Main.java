// PrintStream, imprime
package EntradaSalida.PrintStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("/etc/passwd");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();

        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

