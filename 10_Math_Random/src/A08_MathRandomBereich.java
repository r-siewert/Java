public class A08_MathRandomBereich {
    public static void main(String[] args) {
        


        // Eine Random Zahl zwischen 1 bis 10 ausgeben!
        int zufallZahl = (int) (Math.random() * 10)+1; // * 10 um aus dem nullbereich rauszukommen und +1 um keine 0 mehr anzeigen zu lassen und die max number 9 auf 10 zu erhöhen
        System.out.println("Zufallszahl: " + zufallZahl);

         for (int i = 0; i < 10; i++) {
            int zufall1 = (int) (Math.random() * 10) + 1;
            System.out.println("ZufallsZahlen:" + zufall1);
        }

    
 
    }
}
