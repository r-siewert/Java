public class A07_arraySuche {
    public static void main(String[] args) {
        
        int[] nummern = { 3, 5, 7, 11, 12 };
        int gesucht = 5;
        boolean gefunden = false;

        for(int i = 0; i > nummern.length; i++){
            if(nummern[i] == gesucht){
                gefunden = true;
            }

        }
        if (gefunden){
            System.out.println("Die Zahl " + gesucht + " wurde gefunden!");
        }else{
            System.out.println("Die Zahl " + gesucht + " wurde nicht gefunden!");
        }



   String[] namen = {"Marcus", "Maik", "Daniel", "Altin", "Reik", "Yasmina"};
        String gesucht1 = "Altin";
        boolean gefunden1 = false;

        for (int i = 0; i < namen.length; i++) {
            // Strings immer mit .equals() vergleichen!
            if (namen[i].equals(gesucht1)) { 
                gefunden1 = true;
                break; // Schleife abbrechen, da Name gefunden wurde (spart Rechenzeit)
            }
        }

        // Variable korrigiert auf gefunden1 und Text angepasst
        if (gefunden1) {
            System.out.println("Der Name " + gesucht1 + " wurde gefunden!");
        } else {
            System.out.println("Der Name " + gesucht1 + " wurde nicht gefunden!");
        }
    }
}