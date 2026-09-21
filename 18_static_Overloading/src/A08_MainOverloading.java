
public class A08_MainOverloading {
    public static void main(String[] args) {

        System.out.println("Standard main (String[] args");
        main(44);
        main("Stefan", 1970);
    }

    public static void main(int zahl) {
        System.out.println("Überladen der main(int): " + zahl);

    }

    public static void main(String name, int jahr) {
        System.out.println("Überladen man(sting, int): " + name + " / " + jahr);

    }
}
