package EntradaSalida.Scanner;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodForm {

    public static void main(String[] args) {

        try {

            boolean ok = false;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mete dos numeros: ");

                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e) {
                    System.out.println("Numeros invalidos");

                }
            } while (!ok);
        }finally {

        }
    }
}