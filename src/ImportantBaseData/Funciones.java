package ImportantBaseData;

public class Funciones {


    public static void main(String[] args) {

        //holaMundo();
        //holaMundo();

        //holaMundo("Alan");
        //holaMundo("Roberto");

        //String hola = devolverHola();
        //System.out.println(hola);
    }

    public static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");

    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static String devolverHola() {
        return "Hola";
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
}
}