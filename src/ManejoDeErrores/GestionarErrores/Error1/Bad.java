package ManejoDeErrores.GestionarErrores.Error1;
//Cuando se produce un error de runtime, un error en tiempo de ejecución
//se dispara una exepcion,
import java.util.Scanner;

public class Bad {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce dos numeros: ");

    int numeroA = scanner.nextInt();
    int numeroB = scanner.nextInt();

    int resultado = numeroA / numeroB;
    System.out.println("Resultado es: " + resultado);
    }

    public static void demoMapa(){

    }
}
