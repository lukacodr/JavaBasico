package TipoDeDatosAvanzados.ArrayList.BigDecimal.Good;
/**
 valorA.add(valorB);
 valorA.add(valorB);
 valorA.add(valorB);
 valorA.add(valorB);
 valorA.add(valorB);
 valorA.add(valorB);

 System.out.println(valorA);
*/
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal("0.1");
        BigDecimal valorB = new BigDecimal("0.1");

        // Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado.toString());

    }
}




