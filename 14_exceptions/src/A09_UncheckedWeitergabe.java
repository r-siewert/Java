public class A09_UncheckedWeitergabe {

    public static int wertLesen(int[] werte, int index) {

        return werte[index];
    }

    public static void main(String[] args) {

        try {
            int[] werte = { 7, 9 };
            System.out.println("Wert: " + wertLesen(werte, 2)); // 0 gültig 2 IndexOutOfBound
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ungültiger Index!");
        }

    }
}
// Normal wäre das Programm abgestürzt, nicht aber mit der unchecked Exception!