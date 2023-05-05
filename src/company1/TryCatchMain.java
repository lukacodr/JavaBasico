package company1;

public class TryCatchMain {

    public static void main(String[] args) {
        //Java nos proporciona estos mecanismos de try, catch y finally para hacer
        //nuestro codigo mas robusto. Capturando los errrores y gestionandolos nosotros
        try {
            int result = 5 / 5;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally{
            System.out.println("Cierre de recursos");
        }


        System.out.println("fin");
    }
}
