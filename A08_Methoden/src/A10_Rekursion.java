public class A10_Rekursion {

    public static void countDown(int zahl) {
        if (zahl == 0) {
            System.out.println("Rakete1 startet!");
            // return;
        } else {
            System.out.println(zahl);
            countDown(zahl - 1);
        }

    }

    public static void countDown2(int zahl) {
        if (zahl == 0) {
            System.out.println("Rakete2 startet!");
            return;
        }
        System.out.println(zahl);
        countDown(zahl - 1);
    }

    public static void main(String[] args) {
        countDown(5);
        countDown2(5);
    }
}
