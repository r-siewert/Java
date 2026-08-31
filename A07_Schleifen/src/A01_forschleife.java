public class A01_forschleife {
    public static void main(String[] args) {
        int summe = 0;

        for (int x = 0; x <= 7; x++) {
            summe += x;
            System.out.println("Ausgabe" + x);

        }

        System.out.println("Summe: " + summe);
    }

}
