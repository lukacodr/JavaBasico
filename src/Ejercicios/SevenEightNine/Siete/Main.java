//Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante
//(desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
package Ejercicios.SevenEightNine.Siete;

public class Main {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static void divideByZero() throws ArithmeticException {
        int result = 10 / 0;
    }
}