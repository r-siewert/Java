public class A06_FiltermMitContinue {
    public static void main(String[] args) {

        for (int nummer = 0; nummer <= 10; nummer++) {

            if (nummer % 2 == 0) {
                continue;
            }

            /*
             * if (nummer % 2 != 0) { - für gerade Zahlen ausgeben.
             * continue;
             * }
             */

            System.out.println("Ungerade: " + nummer);

        }
    }

}
