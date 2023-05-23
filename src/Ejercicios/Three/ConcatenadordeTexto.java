package Ejercicios.Three;

public class ConcatenadordeTexto {

    public static void main(String[] args) {
        String[] textos = {"A quien madruga, ", "Dios le ayuda, ", "si se levanta ", "con buen fín","!"};

        String resultado = "";

        for (String texto : textos) {

            resultado += texto;
        }
        System.out.println(resultado);


    }
}
