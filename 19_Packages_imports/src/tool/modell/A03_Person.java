package tool.modell;

public class A03_Person {
    private String name;

    public A03_Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Diese Methode ist Packgage-Private: diese Methode ist nur in tool.modell
    // sichtbar, weil kein Zugriffsmodifikator angegeben ist.
    void interneNotiz() {
        System.out.println("interne Modelldaten!");
    }

    public void vorstellen() {
        System.out.println("Hallo, ich bin " + name);
    }

}
