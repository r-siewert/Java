class Temperatur {
    private double wert;

    public boolean setWert(double pwert) {
        if (pwert < -100.00) {
            return false; // wirft die Temperatur auf 0.0
        }

        this.wert = pwert;
        return true;
    }

    public double getWert() {
        return wert;
    }
}

public class A05_SetterValidierung {
    public static void main(String[] args) {

        Temperatur messung = new Temperatur();

        boolean temp = messung.setWert(+120);

        if (temp) {
            System.out.println("Temp ist io: " + messung.getWert());
        } else {
            System.out.println("Temp ist nicht io: " + messung.getWert());
        }
    }
}
