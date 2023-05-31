//Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
package Ejercicios.SevenEightNine.Uno;

public class Main {

    public static void main(String[] args) {
        String[] array = {"Hola", "Mundo"};
        printArrayValues(array);
    }

    public static void printArrayValues(String[] array) {
        for (String value : array) {
            System.out.println(value);
        }
    }
}
