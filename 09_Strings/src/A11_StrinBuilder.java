public class A11_StrinBuilder {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Java");

        text.append(" lernen");
        System.out.println("Text: " + text); // Java lernen

        text.insert(0, "Wir wollen ");
        System.out.println("Text: " + text); // Wir wollen Java lernen

        text.insert(22, ", weil es Spaß macht!");
        System.out.println("Text: " + text); // Wir wollen Java lernen, weil es Spa0 macht!

        System.out.println("Länge: " + text.length());

        // mit toString() -> String
        System.out.println("Grossbuchstaben: " + text.toString().toUpperCase());

        text.replace(0, 3, "Azubis,");
        System.out.println("Text: " + text);

        text.delete(15, 20);
        System.out.println("Text: " + text);
    }   
}
