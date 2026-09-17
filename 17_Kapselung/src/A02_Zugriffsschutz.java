class Lampe {
    private boolean an;

    public void einschalten() { // setter
        an = true;
    }

    public boolean isAn() { // getter
        return an;
    }

}

public class A02_Zugriffsschutz {
    public static void main(String[] args) {

        Lampe lampe = new Lampe();
        lampe.einschalten();

        System.out.println("Lammpe an: " + lampe.isAn());
    }
}
