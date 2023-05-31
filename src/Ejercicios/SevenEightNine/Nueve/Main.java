//Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
package Ejercicios.SevenEightNine.Nueve;
//HashMap se utiliza para almacenar frutas y sus cantidades
//ArrayList se utiliza para almacenar colores
//LinkedList se utiliza para almacenar números enteros

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            funProgram();
        } catch (CustomException e) {
            System.out.println("¡Ups! Ocurrió un error: " + e.getMessage());
        }
    }

    public static void funProgram() throws CustomException {
        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Manzana", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Naranja", 3);

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Rojo");
        arrayList.add("Verde");
        arrayList.add("Azul");

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            throw new CustomException("El número debe ser mayor a cero.");
        }

        // HashMap
        System.out.println("HashMap:");
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println(key + " - " + value);
        }

        // ArrayList
        System.out.println("ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // LinkedList
        System.out.println("LinkedList:");
        for (int item : linkedList) {
            System.out.println(item);
        }
    }
}