public class A01_TryCatch {
    public static void main(String[] args) {

        try {

            int divisor = 0;

            int ergebnis = 12 / divisor;

            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Division durch 0 erkannt");
        }
    }
}
