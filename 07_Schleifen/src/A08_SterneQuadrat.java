/* 

**********
**********
**********
**********
**********

*/

public class A08_SterneQuadrat {
    public static void main(String[] args) {

        System.out.println();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("***********");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // umgekehrter Tannenbaum
        System.out.println();

        for (int i = 5; i <= 1; i--) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
