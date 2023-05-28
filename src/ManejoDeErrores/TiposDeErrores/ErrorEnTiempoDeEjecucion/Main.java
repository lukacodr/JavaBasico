package ManejoDeErrores.TiposDeErrores.ErrorEnTiempoDeEjecucion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos numeros :");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA - numeroB;
        System.out.println("Resultado es: " + resultado);
    }
}

