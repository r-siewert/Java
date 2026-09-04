public class WarenEingangUeberKommandoZeile {

    public static void main(String[] args) {
        
        System.out.println("Artikelname: " + args[0]);

      try{int zahl1 = Integer.parseInt(args[1]);
        System.out.println("Gelieferte Zahl: " + zahl1);
       

        int zahl2 = Integer.parseInt(args[2]);
        System.out.println("Mindestbestand: " + zahl2);

        if (zahl1 < zahl2){
            System.out.println("Warnung: Menge liegt unter dem Mindestbestand!");
        }else{
            System.out.println("Bestellung wurde bestätigt!");
        }
        } catch (NumberFormatException e){
        System.out.println("Bitte gib eine ganze Zahl ein!");
        }

    }
    
}
