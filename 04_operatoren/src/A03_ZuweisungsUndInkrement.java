public class A03_ZuweisungsUndInkrement {
    public static void main(String[] args) {

        int punkte = 10;

        // punkte + 5
        punkte += 5;
        // punkte * 2
        punkte *= 2;

        System.out.println("Punkzahl ist: " + punkte);

        int zahl1 = 3;

        // hier wird die zahl1 mit ++ versehen, um bei der nächsten Ausgabe um 1 zu
        // erhöhen
        System.out.println("PostInkrement: " + zahl1++);

        // erst hier wird die Zahl1 = 4
        System.out.println("Danach : " + zahl1);

        // PreInkrement - zahl1 wird sofort um 1 erhöht.
        System.out.println("PreInkrement: " + ++zahl1); // 5

        int zahl2 = 12;
        zahl2 /= 3;
        System.out.println("zahl2: " + zahl2); // 4

        int zahl3 = 14;
        zahl3 %= 3;
        System.out.println("Zahl3: " + zahl3); // 2

    }
}
