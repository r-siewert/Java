public class A02_multiCatch {
    public static void main(String[] args) {
        int[] werte = { 4, 8 };

        int index = 3; // ArrayIndexOutOfBoundsException

        // auf ein null-Array kann nicht zugegriffen werden!
        // werte = null; // um die 2. exception auszulösen

        try {
            System.out.println(werte[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index liegt außerhalb des Arrays!");
        } catch (Exception e) {
            System.out.println("Anderer Fehler: " + e.getClass().getSimpleName());
        }

        try {
            System.out.println(werte[index]);
        } catch (Exception e) {
            System.out.println("Anderer Fehler: " + e.getClass().getSimpleName());
        }

    }
}
