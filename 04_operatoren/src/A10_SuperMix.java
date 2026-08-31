public class A10_SuperMix {
    public static void main(String[] args) {

        int guthaben = 40;

        guthaben += 15;

        guthaben /= 2;

        guthaben -= 3;

        System.out.println("Der Endstand beträgt: " + guthaben);

        int Besucher = 9;

        System.out.println(Besucher++);
        System.out.println(Besucher);
        System.out.println(--Besucher);

        int dateiA = 120;
        int dateiB = 95;

        System.out.println("ist gleich: " + (dateiA == dateiB));
        System.out.println("ist ungleich: " + (dateiA != dateiB));
        System.out.println("ist größer: " + (dateiA > dateiB));
        System.out.println("ist kleiner gleich: " + (dateiA <= dateiB));

    }

}
