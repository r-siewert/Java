public class A07_arraySuche_1 {

     public static void gibaus(boolean gefunden, int gesucht) {
        if (gefunden) {
            System.out.println("Die Zahl " + gesucht + " wurde gefunden!");
        } else {
            System.out.println("Die Zahl " + gesucht + " wurde nicht gefunden!");
        }
 
    }
 
    public static void main(String[] args) {
        int[] nummern = { 3, 5, 7, 11, 22 };
        int gesucht = 13;
        boolean gefunden = false;
 
        for (int i = 0; i < nummern.length; i++) {
            if (nummern[i] == gesucht) {
                gefunden = true;
            }
        }
 
        gibaus(gefunden, gesucht);
 
    }

}    