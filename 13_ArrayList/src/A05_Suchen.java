import java.util.ArrayList;

public class A05_Suchen {
    public static void main(String[] args) {
        ArrayList<String> werkzeuge = new ArrayList<String>();

        werkzeuge.add("Editor");
        werkzeuge.add("Compiler");
        werkzeuge.add("Debugger".toLowerCase());
        werkzeuge.add("Compiler");

        System.out.println("Vorhanden: " + werkzeuge.contains("debugger")); // true
        System.out.println("Vorhanden: " + werkzeuge.contains("CPU")); // false

        System.out.println("Erste Position: " + werkzeuge.indexOf("Compiler"));

    }
}
