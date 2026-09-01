public class A05_MathSqrt {
    public static void main(String[] args) {
        

        
        double wurzel1 = Math.sqrt(25); // arbeitet mit double, wenn int asgegeben werden soll, casting nötig!
        System.out.println("Die Wurzel: " + wurzel1);

        int wurzel2 = (int) Math.sqrt(36);      // Selbe Situation wie bei Pow - funktion arbeitet mit double - deshalb int casten!
          System.out.println("Die Wurzel: " + wurzel2);


    }
    
}
