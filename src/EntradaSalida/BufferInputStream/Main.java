package EntradaSalida.BufferInputStream;

import java.io.*;
//Trabaja con entradas, en vez que con ficheros. Lee en memoria trocitos y cuando
//nosotros accedemos ahi nos lo va dando poquito a poco.
//No carga todo en memoria y notosotros no accedemos a todo a la vez
public class Main {

    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");
            BufferedInputStream ficheroBuffer = new  BufferedInputStream(fichero);

            try {
                int dato = ficheroBuffer.read();
                while (dato != -1) {
                    System.out.println((char) dato);
                    dato = ficheroBuffer.read();
                }


            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}

