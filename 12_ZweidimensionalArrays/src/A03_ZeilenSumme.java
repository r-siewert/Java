import java.util.Arrays;

public class A03_ZeilenSumme {
    public static void main(String[] args) {
        
int[][] werte = {
                { 2, 4, 6 },
                { 1, 3, 5 },
                { 123, 33, 52 }
        };
 
        System.out.println("Aussen: " + werte.length + " Zeilen");
        System.out.println("Spalten: " + werte[0].length + " Spalten");
 
        //Ausgabe des arrays als String
        System.out.println("Ausgabe Array:" + Arrays.deepToString(werte));
 
        System.out.println("**********************************************");
 
        for (int zeile = 0; zeile < werte.length; zeile++) {
            int summe = 0;
            for (int spalte = 0; spalte < werte[zeile].length; spalte++) {
                summe += werte[zeile][spalte];
            }
            System.out.println("Zeilensumme: " + summe);
        }
    }
}