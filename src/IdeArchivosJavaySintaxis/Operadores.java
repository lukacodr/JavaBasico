package IdeArchivosJavaySintaxis;

public class Operadores {

    public static void main(String[] args) {

        // aritmeticos:
        int numero1 = 10;
        int numero2 = 20;
        int resultadoSuma = numero1 + numero2;


        System.out.println(resultadoSuma);
        System.out.println(resultadoSuma + numero2 + 8.90);
        System.out.println(resultadoSuma + 89.90);

        int resultadoResta = numero1 - numero2;

        //comparacion
        /*
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
         */

        boolean resultado1 = numero1 < numero2;
        System.out.println(resultado1);

        boolean resultado2 = numero1 > numero2;
        System.out.println(resultado2);

        /*
        Logicos
        and && "si esto y ademas, esto otro" -> concatenacion
        or ||
         */


        boolean resultado3 = numero1 > 5 && numero2 < 30;

        int edad = 17;
        boolean carnetJoven = numero1 > 15 && edad <= 21;
        System.out.println(carnetJoven);

        // Operadores
        // incremento ++ sumer un numero a la variable que le apliquemos el ++9
        // decremento -- resta un numero a la variable que le apliquemos el --

    }
}
