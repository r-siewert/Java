public class A01_ArraysErzeugen {
    public static void main(String[] args) {
        int[] werte = { 12, 23, 55 };

        String[] namen = { "Stefan", "Marcus", "Janina", "Christian" };

        System.out.println("erster Wert: " + werte[0]);
        System.out.println("erster Wert: " + namen[2]);

        int[] nummern = new int[4];
        nummern[0] = 1;
        nummern[1] = 2;
        nummern[2] = 55555;
        nummern[3] = 5;


        System.out.println(nummern[3]);
        System.out.println(nummern.length);
    }
    
}
