class Adresse {
    String ort;
    String land;

    Adresse(String ort, String land) {

        this.ort = ort;
        this.land = land;

    }

    Adresse(String ort) {
        this(ort, "Deutschland");
    }
}

public class A06_ThisVerkettung {
    public static void main(String[] args) {
        Adresse adresse1 = new Adresse("Berlin", "Germany");
        Adresse adresse2 = new Adresse("Hamburg");

        System.out.println("Adresse 1: " + adresse1.land + " - " + adresse1.ort);
        System.out.println("Adresse 2: " + adresse2.land + " - " + adresse2.ort);
    }
}
