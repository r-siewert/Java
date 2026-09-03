import java.util.Arrays;

public class A012_ArraySort {
    public static void main(String[] args) {
        String wort = "Bernd";

        char[] buchstabe = wort.toCharArray();

        Arrays.sort(buchstabe);

        System.out.println("Buchstaben: " + Arrays.toString(buchstabe));

        
    }
}
