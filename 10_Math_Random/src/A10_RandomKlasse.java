import java.util.Random;

public class A10_RandomKlasse {
    public static void main(String[] args) {

    Random zufall = new Random();

    int randZahl = zufall.nextInt();
    System.out.println("RandZahl: " + randZahl);

    int wuerfel = zufall.nextInt(6) +1; // man kann auch einen zweiten parameter z.b. , 12 mit in die klammer setzen, um eine Range festzulegen!
    System.out.println("RandZahl: " + wuerfel);

        double anteil = zufall.nextDouble();
        System.out.println("Anteil: " + anteil);

        boolean kopfOderZahl = zufall.nextBoolean();
       
        if( kopfOderZahl == true){
            System.out.println("Kopf oder Zahl: Kopf");
        } else {
            System.out.println("Kopf oder Zahl: Zahl");
        }

    

    }
}
