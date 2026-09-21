class Rechner18 {
    public static int verdoppeln(int x) {
        return x * 2;
    }

    public static int addieren(int a, int b) {
        return a + b;
    }
}

public class A02_StatischeMethoden {
    public static void main(String[] args) {
        int ergebnis1 = Rechner18.verdoppeln(12);
        int ergebnis2 = Rechner18.addieren(22, 23);

        System.out.println("Verdoppeln: " + ergebnis1);
        System.out.println("Summe: " + ergebnis2);
    }
}
