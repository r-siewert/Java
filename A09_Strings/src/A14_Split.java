public class A14_Split {
    public static void main(String[] args) {

        String namen = "Anna,Bernd,Klaus,Kara";

        String[] namenArray = namen.split(",");


        System.out.println(namenArray.length);

        System.out.println(namenArray[1]);

        for (int i = 0; i < namenArray.length; i++) {
            System.out.println("Name: " + namenArray[i].toUpperCase());
        }

        String versiNummer = "1.9.0";

        String[] vn = versiNummer.split("\\.");

        System.out.println("Hauptversion: " + vn[1]);



    }
}
