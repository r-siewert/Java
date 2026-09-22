import java.util.*;

public class A04_Werkzeugliste {
    public static void main(String[] args) {
        List<String> werkzeuge = new ArrayList<>();
        Set<Integer> nummern = new HashSet<>();

        werkzeuge.add("Hammer");
        werkzeuge.add("Zange");

        nummern.add(1);
        nummern.add(1);
        nummern.add(2);

        System.out.println("Werkzeuge: " + werkzeuge.size());
        System.out.println("Nummern: " + nummern.size());
    }
}
