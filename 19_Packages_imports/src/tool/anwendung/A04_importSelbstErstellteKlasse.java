package tool.anwendung;

import tool.modell.A03_Person;

public class A04_importSelbstErstellteKlasse {
    public static void main(String[] args) {

        A03_Person person = new A03_Person("Stefan");

        person.vorstellen();

        System.out.println("Name: " + person.getName());
    }
}
