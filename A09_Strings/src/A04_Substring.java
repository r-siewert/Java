public class A04_Substring {
    public static void main(String[] args) {
        //             01234567
        String text = "javaKurs";

        System.out.println("kurs = " + text.substring(4));//Kurs
        System.out.println("kurs = " + text.substring(4, 8));//Kurs

        System.out.println("java = " + text.substring(0, 4));//java
        System.out.println("vaKu = " + text.substring(2, 6));//vaKu

        System.out.println("K = " + text.substring(4, 5));//K

        System.out.println("letztes Zeichen " + text.substring(text.length() - 1));

        System.out.println("letztes Zeichen " + text.substring(text.length() - 4));

    }
}
