public class A01_Tabelle {
    public static void main(String[] args) {
        
        int[][] tabelle = {
            {1, 2, 3},
            {4, 5, 6},
            {4, 5, 6}
        };

        tabelle[1][1] = 10;

        System.out.println("Zeilen: " + tabelle.length);
        System.out.println("Spalten: " + tabelle[0].length);
        System.out.println("Oben Rechts: " + tabelle[0][2]);
        System.out.println("Unten Rechts: " + tabelle[2][2]);
        System.out.println("Mitte: " + tabelle[1][1]);
         
        int[][][] tabelle1 = {
            {
                { 4, 5 },
                { 7, 8 } 
            },
            {   
                { 3 },
                { 3 }

            }      
        };


        System.out.println("Ausgabe: " + tabelle1[0][1][0]);



    }
    
}
