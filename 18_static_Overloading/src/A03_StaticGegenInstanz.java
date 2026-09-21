class Konto18 {

    // Instanzvariable
    private double guthaben;

    // Klassenvariable
    private static double zinssatz = 0.02;

    public Konto18(double startGuthaben) {
        this.guthaben = startGuthaben;
    }

    public double zinsenBerechnen() {
        return this.guthaben * zinssatz;
    }

    public static void setZinssatz(double neuerZinssatz) {
        zinssatz = neuerZinssatz;
    }

    public double getGuthaben() {
        return guthaben;
    }

}

public class A03_StaticGegenInstanz {
    public static void main(String[] args) {
        Konto18 k1 = new Konto18(1000.0);

        System.out.println("Zinsen k1 (2%): " + k1.zinsenBerechnen());

        Konto18.setZinssatz(0.05);

        System.out.println("Zinsen k1 (5%): " + k1.zinsenBerechnen());
    }
}
