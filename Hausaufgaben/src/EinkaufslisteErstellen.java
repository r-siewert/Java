public class EinkaufslisteErstellen {
    public static void main(String[] args) {
       
      String [] einkaufsliste =  new String [5];

      for(int i = 0; i < einkaufsliste.length; i++){
            einkaufsliste[i] = args[i];
      }
      System.out.println("Einkaufsliste:");


      for(int i = 0; i < einkaufsliste.length; i++){
            System.out.println(i + 1 + ". " + einkaufsliste[i]);
      }
    }
}
