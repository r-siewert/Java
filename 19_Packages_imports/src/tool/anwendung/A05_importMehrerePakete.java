package tool.anwendung;

import java.util.ArrayList;

import tool.modell.A03_Person;

public class A05_importMehrerePakete {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();
        namen.add("java");
        namen.add("Package");

        A03_Person person = new A03_Person("Stefan");

        System.out.println("Anzahl: " + namen.size());
        System.out.println("Pernson: " + person.getName());
    }
}
