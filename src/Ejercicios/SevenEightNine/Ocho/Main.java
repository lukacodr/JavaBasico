//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función
// será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut
package Ejercicios.SevenEightNine.Ocho;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        String fileIn = "input.txt"; // Archivo de entrada
        String fileOut = "output.txt"; // Archivo de salida

        try {
            copyFile(fileIn, fileOut);
            System.out.println("Archivo copiado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }

    public static void copyFile(String fileIn, String fileOut) throws IOException {
        try (InputStream inputStream = new FileInputStream(fileIn); // InputStream del archivo de entrada
             OutputStream outputStream = new FileOutputStream(fileOut)) { // OutputStream del archivo de salida
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }
    }
}