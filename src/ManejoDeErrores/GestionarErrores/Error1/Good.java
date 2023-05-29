package ManejoDeErrores.GestionarErrores.Error1;
//Utilizamos try, Y dentro de la construccion try, voy a meter voy a meter el
//codigo que quiero proteger
//

import java.util.HashMap;
import java.util.Scanner;

public class Good {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {

            int resultado = numeroA / numeroB;
            System.out.println("Resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("b00m!, exception es: " + e.getClass());
        } catch (Exception e) {
            System.out.println("Estoy en una exepcion que no es aritmetica");
        } finally {
            System.out.println("finally");
        }
        int resultado = numeroA;
    }

    public static void demoMapa() {

        HashMap<String, Integer> mapa = new HashMap<>();

    }
}
