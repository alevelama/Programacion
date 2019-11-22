package com.company;

import java.util.Scanner;

public class ej4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Diga ¿Cuantos comenzales son?");
        int x= teclado.nextInt();
        if (x<5) {
         System.out.print("tenemos mesa para ustedes");
         }
         else{
        System.out.print("Lo siento, no admitimos grupos superiores a 4 personas, forme grupos de 4, intentalo de nuevo");

         }
    }

}








