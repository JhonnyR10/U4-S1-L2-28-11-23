package Esercizio1;

public class Esercizio1 {
    public static boolean stringaPariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
//        return anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0);
//        con if
        if (anno % 4 == 0) {
            if (anno % 100 != 0 || anno % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}