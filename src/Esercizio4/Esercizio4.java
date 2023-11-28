package Esercizio4;

import java.util.Scanner;

public class Esercizio4 {
    public static void esercizio4() {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int num = Integer.parseInt(input.nextLine());
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
