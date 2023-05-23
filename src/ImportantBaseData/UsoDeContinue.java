package ImportantBaseData;

public class UsoDeContinue {

    public static void main(String[] args) {

        //continue

        int count = 0;
        while (count < 10) {
            count++; // condicion
            if (count == 4)
                continue;
            System.out.println("Hola mundo " + count);

        }

    }

}