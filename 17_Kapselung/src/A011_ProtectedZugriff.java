class Basis {
    protected int wert = 7;

    protected int getWert() {
        return wert;
    }
}

public class A011_ProtectedZugriff {
    public static void main(String[] args) {
        Basis basis = new Basis();
        System.out.println("Protected-Wert: " + basis.getWert());
    }
}
