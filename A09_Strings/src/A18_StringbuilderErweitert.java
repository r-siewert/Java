public class A18_StringbuilderErweitert {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("java Kurs");

        System.out.println("Start: " + text); // java Kurs

        text.deleteCharAt(4);
        System.out.println("Nach deleteCharAt: " + text); // javaKurs

        text.delete(0, 4);
         System.out.println("Nach delete: " + text); // Kurs

         text.reverse();
         System.out.println("reverse: " + text); // sruK

         text.setCharAt(0, 'X');
         System.out.println("reverse: " + text); // XruK

    }
}
