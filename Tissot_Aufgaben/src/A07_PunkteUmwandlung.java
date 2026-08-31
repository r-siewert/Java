public class A07_PunkteUmwandlung {
    public static void main(String[] args) {
        int punkte = 13;

        double ergebnis1 = (double) punkte;

        double anteil = 8.75; // die Nachkommastellen verschwinden, weil nicht gerundet wird, sondern ab dem
                              // Komma ein CUT kommt
        int ergebnis2 = (int) anteil;

        System.out.println(ergebnis1 + " " + ergebnis2);
    }
}
