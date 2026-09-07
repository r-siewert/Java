public class A06_StandardWerte {
    public static void main(String[] args) {
        
        
        // Bei der Deklarierung default 0
        int[][] zaehler = new int[2][3];



        for(int zeile = 0; zeile < zaehler.length; zeile++){
            for(int spalte = 0; spalte < zaehler[zeile].length; spalte++){
                System.out.println("Werte: " + zaehler[zeile][spalte]);
            }
        }



    }
}
