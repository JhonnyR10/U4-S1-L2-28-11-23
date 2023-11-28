package Esercizio3;

import java.util.Scanner;

public class Esercizio3 {
    public static void esercizio3() {
        System.out.println("Inserisci una stringa (:q per uscire)");
        Scanner input = new Scanner(System.in);
        String stringa = input.nextLine();
        while (!stringa.equals(":q")) {
            char[] caratteri = stringa.toCharArray();
//            String risultato = String.join(",", Arrays.toString(caratteri));
//            System.out.println(risultato);
            for (int i = 0; i < caratteri.length; i++) {
                System.out.print(caratteri[i]);
                if (i < caratteri.length - 1) {
                    System.out.print(",");
                }


            }
            System.out.println();
            System.out.println("Inserisci una stringa (:q per uscire)");
            stringa = input.nextLine();
        }
        
//        String stringa;
//        do {
//            System.out.println("Inserisci una stringa (:q per uscire)");
//            stringa = input.nextLine();
//
//            if (!stringa.equals(":q")) {
//                char[] caratteri = stringa.toCharArray();
//                for (int i = 0; i < caratteri.length; i++) {
//                    System.out.print(caratteri[i]);
//                    if (i < caratteri.length - 1) {
//                        System.out.print(",");
//                    }
//                }
//                System.out.println();
//            }
//
//        } while (!stringa.equals(":q"));

    }
}
