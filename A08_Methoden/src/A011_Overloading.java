public class A011_Overloading {

    public static int summe(int a) {
        return a + a;
    }

    public static double summe(double a) {
        return a + a;
    }

    public static int summe(int a, int b) {
        return a + b;
    }

    public static int summe(int a, double b, float c) {
        return (int) (a + b + c);

    }

    public static void main(String[] args) {
        System.out.println("Summe(3) " + summe(3));
        System.out.println("Summe(3,5) " + summe(3, 5));
        System.out.println("Summe(3.0) " + summe(3.0));
        System.out.println("Summe(3,5.0,7.0) " + summe(3, 5.0, 8.0f));
    }
}
