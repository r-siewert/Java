class Drucker18 {
    public static void drucken(int zahl) {
        System.out.println("Ganzzahl: " + zahl);
    }

    public static void drucken(double zahl1) {
        System.out.println("Kommazahl: " + zahl1);
    }

    public static void drucken(String text) {
        System.out.println("Text: " + text);
    }

    public void drucken(boolean bol) {
        System.out.println("Boolean: " + bol);
    }

}

public class A05_StaticOverloading {
    public static void main(String[] args) {

        Drucker18 dr = new Drucker18();

        Drucker18.drucken(10);
        Drucker18.drucken(12.5);
        Drucker18.drucken("Hallo Welt");

        dr.drucken(true);
    }
}
