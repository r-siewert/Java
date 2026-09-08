public class A03_MethodeMitRueckgabe {

    public static int quadrieren(int zahl) {
        return zahl * zahl;
    }

    public static void main(String[] args) {
        int ergebnis = quadrieren(5);
        System.out.println("Ergebnis: " + ergebnis);
    }
}
