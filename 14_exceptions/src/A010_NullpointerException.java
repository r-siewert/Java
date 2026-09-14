public class A010_NullpointerException {
    public static void main(String[] args) {

        String name = "null"; // eingabe null löst die NullPonterException aus!

        try {
            System.out.println("Länge: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("Name darf nicht leer sein!");
        }
    }
}
