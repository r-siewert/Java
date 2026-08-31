public class A04_TypUmwandlung {
    public static void main(String[] args) {
        double preis = 9.99;

        // explicit casting (Narrowing)

        // double->float->long->int->char->short->byte
        int zahl = (int) preis;

        int zahl2 = 10;

        // implicit casting (Widening)

        // byte->short->char->int->long->float->double
        double zahl3 = zahl2;

        System.out.println(zahl3);

        System.out.println(zahl);

    }

}
