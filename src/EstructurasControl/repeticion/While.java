package EstructurasControl.repeticion;

public class While {

    public static void main(String[] args) {


        int contador = 0;

        while (contador < 19) {
            System.out.println("Hi world");
            contador++;
            if (contador == 5){
                //break;
                continue;
            }
            // Variable nombre sta fuera del ambito del que se creo
            System.out.println("Valor de contador  " + contador);
        }
    }
}
