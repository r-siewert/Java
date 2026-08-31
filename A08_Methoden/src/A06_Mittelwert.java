public class A06_Mittelwert {

    public static double mittelwert(double a, double b) {
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        double wert = mittelwert(4.3, 7.0);

        System.out.println("Mittelwert: " + wert);

    }
}
