public class FuncionConIva {

    public static void main(String[] args) {

        class CalculadoraIVA {
            public static double precioConIVA(double precio, double porcentajeIVA) {
                double valorIVA = precio * porcentajeIVA / 100;
                double precioConIVA = precio + valorIVA;
                return precioConIVA;
            }
        }
        double precioSinIVA = 180.78;
        double porcentajeIVA = 21.0;
        double precioConIVA = CalculadoraIVA.precioConIVA(precioSinIVA, porcentajeIVA);
        System.out.println("Precio con IVA incluido: " + precioConIVA);


    }


}
