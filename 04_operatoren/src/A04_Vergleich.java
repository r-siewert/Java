public class A04_Vergleich {
    public static void main(String[] args) {

        int alter = 20;
        int mindestalter = 18;

        System.out.println("gleich: " + (alter == mindestalter));
        System.out.println("nichtGleich: " + (alter != mindestalter));
        System.out.println("gößer als: " + (alter > mindestalter));
        System.out.println("kleiner als: " + (alter < mindestalter));
        System.out.println("MindestAlter: " + (alter >= mindestalter));
        System.out.println("Hoechstalter: " + (alter <= mindestalter));

    }
}
