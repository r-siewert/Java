import java.util.Arrays;

public class A02_TabelleAusgeben {
    public static void main(String[] args) {
        
        int[][] werte = {
            {2,4,6},
            {1,3,5}
        };
        System.out.println("Aussen: " + werte.length + " Zeilen");
        System.out.println("Spalten: " + werte[0].length + " Spalten");

        // Ausgabe des arrays als String (auch bei multidimensionalen Strings!)
        System.out.println("Ausgabe Array: " + Arrays.deepToString(werte));

            for(int zeile = 0; zeile < werte.length; zeile++){
                for(int spalte = 0; spalte < werte[zeile].length; spalte++){
                    System.out.println("Zelle: " + werte[zeile][spalte]);
                }
            }


    }
}
