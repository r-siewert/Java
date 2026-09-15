package uebungen.src;

class Anzeige {
    String text;

    public void verhalten() {
        System.out.println("Anzeige: " + text);
    }
}

public class A03_Anzeige {
    public static void main(String[] args) {
        Anzeige anzeige = new Anzeige();
        anzeige.text = "Bereit";
        anzeige.verhalten();
    }
}