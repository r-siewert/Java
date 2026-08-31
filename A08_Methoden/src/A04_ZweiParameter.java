public class A04_ZweiParameter {

    public static int addiere(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int ergebnis = addiere(10, 20);

        System.out.println("Summe: " + ergebnis);

        System.out.println("Das Ergebnis ist " + addiere(10, 20));

        System.out.println("Das Ergebnis ist " + (addiere(10, 20) + addiere(10, 20)));

    }
}
