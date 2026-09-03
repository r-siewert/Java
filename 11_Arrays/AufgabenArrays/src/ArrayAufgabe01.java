public class ArrayAufgabe01 {
    public static void main(String[] args) {


       try {System.out.println("Produkt: " + args[0]);
       } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Es gibt keine Daten");
     }



        int zahl = Integer.parseInt(args[1]);
        System.out.println("Anzahl: " + zahl);


        float zahl1 = Float.parseFloat(args[2]);
        System.out.println("Preis pro Stück: " + zahl1 + " Euro");

        
        System.out.println("Gesamtpreis: " + (zahl1* 2) + " Euro");
    }
}
