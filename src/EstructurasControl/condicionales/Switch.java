package EstructurasControl.condicionales;

public class Switch {
    public static void main(String[] args) {

        String dia = "Jueves";

        switch (dia) {
            case "Lunes":
                System.out.println("Hoy es Lunes!! Letsgoo!!");
                break;
            case "Martes":
                System.out.println("Hoy es Martes!! Hola!!");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles!! Hola!!");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves!! Hola!!");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes!! Hola!!");
                break;
            case "Sabado":
                System.out.println("Hoy es Sabado!! Hola!!");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo!! Hola!!");
                break;
                default:
                    System.out.println("No es un dia valido");
                    break;


        }
    }
}
