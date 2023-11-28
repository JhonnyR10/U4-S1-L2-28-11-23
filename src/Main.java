import Esercizio1.Esercizio1;
import Esercizio2.Esercizio2;
import Esercizio3.Esercizio3;
import Esercizio4.Esercizio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String stringa = input.nextLine();
        System.out.println(Esercizio1.stringaPariDispari(stringa));
        System.out.println("Inserisci un anno: ");
        int anno = Integer.parseInt(input.nextLine());
        System.out.println(Esercizio1.annoBisestile(anno));
        Esercizio2.esercizio2();
        Esercizio3.esercizio3();
        Esercizio4.esercizio4();
    }
}