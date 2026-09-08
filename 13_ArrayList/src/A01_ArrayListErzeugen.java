import java.util.ArrayList;

public class A01_ArrayListErzeugen {
    public static void main(String[] args) {
        ArrayList<String> staedte = new ArrayList<String>();

        staedte.add("Hamburg");
        staedte.add("Berlin");

        System.out.println("Anzahl: " + staedte.size()); // 2
        System.out.println("Zweite Stadt: " + staedte.get(1));// Berlin
    }
}
