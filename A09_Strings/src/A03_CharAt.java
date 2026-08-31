public class A03_CharAt {
    public static void main(String[] args) {
        //             0123
        String text = "Java ist toll";
        System.out.println("Erstes Zeichen " + text.charAt(0));
        System.out.println("Erstes Zeichen " + text.charAt(2));

        System.out.println(text.length());

        for (int i = 0; i < 4; i++) {
            System.out.println(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

    }
}
