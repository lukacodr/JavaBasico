package EstructurasControl.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Domingo";

        // ejemplos comprar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        //if else if

        if (dia.equals("Lunes")) {
            System.out.println("Si sabes lo que vales, ve a buscar lo que mereces");

        } else if (dia.equals("Martes")) {
            System.out.println("mi arte");

        } else if (dia.equals("Miercoles")) {
            System.out.println("coles por doquier");

        } else if (dia.equals("Jueves")) {
            System.out.println("ves lo que no ves");

        } else if (dia.equals("Viernes")) {
            System.out.println("voy saltando por doquier");

        } else if (dia.equals("Sabado")) {
            System.out.println("Adolfo hace alto asado");

        } else if (dia.equals("Domingo")) {
            System.out.println("Ayer me puse hasta el pingo");
        } else {
            System.out.println("El dia introducido no es un dia valido");
        }
    }

}
