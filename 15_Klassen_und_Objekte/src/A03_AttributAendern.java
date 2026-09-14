class Temperatur {
    double wert;
}

public class A03_AttributAendern {
    public static void main(String[] args) {
        Temperatur messung = new Temperatur();

        messung.wert = 18.5;

        System.out.println("Gemessen: " + messung.wert);

        messung.wert = messung.wert + 2.5;

        System.out.println("Messung korregiert: " + messung.wert);
    }
}
