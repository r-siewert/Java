import java.util.ArrayList;

public class A010_ArrayListErweitert {
    public static void main(String[] args) {
        ArrayList<String> werte = new ArrayList<>();

        werte.add("A");
        werte.add("C");
        // A, C

        werte.add(1, "B");
        // [A, B, C]

        werte.remove("B");
        // [A, C]

        System.out.println("Liste: " + werte);

        System.out.println("Leer vor dem Clear: " + werte.isEmpty()); // false
        werte.clear(); // liste wird geleert

        System.out.println("Leer nach dem Clear: " + werte.isEmpty()); // true
    }
}
