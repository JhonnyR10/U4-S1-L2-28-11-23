package Esercizio2;

import java.util.Scanner;

public class Esercizio2 {
    public static void esercizio2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int num = Integer.parseInt(input.nextLine());

        switch (num) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("Uno");
                break;

            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore inserisci un numero tra 0 e 3");
        }
   
    }
}
