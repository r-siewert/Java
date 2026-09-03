import java.util.Arrays;

public class A013_ArrayEquals {
    public static void main(String[] args) {
        int[] zahlen1 = {1, 2, 3};
        int[] zahlen2 = {1, 2, 3};



        System.out.println("Zahlen1 " + Arrays.toString(zahlen1));
        System.out.println("Zahlen1 " + Arrays.toString(zahlen2));

        System.out.println("Zahlen1 == Zahlen2 " + (zahlen1 == zahlen2)); // false
        System.out.println("Inhalt Zahlen1 und Zahlen2 " + Arrays.equals(zahlen1, zahlen2)); // true auch die Reihenfolge wird geprüft und ist entscheidend

        System.out.println();
         System.out.println("############################################################");
          System.out.println();

        String[] stadt1 = {"Mölln", "Hamburg", "Bremen"};
        String[] stadt2 = {"Mölln", "Hamburg", "Bremen"};
        String[] stadt3 = {"Mölln", "Bremen", "Hamburg" };

        System.out.println("Stadt1 " + Arrays.toString(stadt1));
        System.out.println("Stadt2 " + Arrays.toString(stadt2));
        System.out.println("Stadt1 == Stadt2 " + (stadt1 == stadt2)); // false
        System.out.println("Inhalt Stadt1 und Stadt2 " + Arrays.equals(stadt1, stadt2)); // true
        System.out.println("Inhalt Stadt1 und Stadt3 " + Arrays.equals(stadt1, stadt3)); // false


    }
}
