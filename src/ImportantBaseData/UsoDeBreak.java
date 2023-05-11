package ImportantBaseData;

public class UsoDeBreak{

    public static void main(String[] args) {

        //break

        int count = 0;
        while(count < 10){
            count++; //condicion
            if(count == 6)
                break; // rompe el flujo de ejecucion
                //continue; // satla el valor 6 y continua a la siguiente iteracion

            System.out.println("Hola mundo " + count);
        }
        System.out.println("fin");
    }
}
