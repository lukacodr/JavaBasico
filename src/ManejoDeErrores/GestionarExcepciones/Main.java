package ManejoDeErrores.GestionarExcepciones;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            divide(4, 0);
        } catch (Exception e) {
            System.out.println("AAA");
        }
    }

    public static int divide(int A, int B) throws IOException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {
            throw new IOException();
        }
            return resultado;

    }
}



