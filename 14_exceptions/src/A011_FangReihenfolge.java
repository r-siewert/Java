public class A011_FangReihenfolge {

    public static void main(String[] args) {

        String text = "null";

        try {
            System.out.println(text.length());
            // int zahl = 10 / 0;

            int[] werte = { 2, 4 };
            System.out.println(werte[2]);

        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
