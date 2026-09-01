public class A04_MathPow {
    public static void main(String[] args) {
        

        // 2 x 2 x 2 x 2  = 16
        // basis exponent
        int ergebnis1 = (int) Math.pow(2, 4); // Casting nötig, weil Math.pow mit double arbeitet!

        System.out.println("Ergebnis: " + ergebnis1);

        double ergebnis2 = Math.pow(2, 4);        // kein explizites Casting nötig, da Math.pow mit double arbeitet!
        System.out.println("Ergebnis: " + ergebnis2);


        int ergebnis3 = (int) Math.pow(3, 4); // Casting nötig, weil Math.pow mit double arbeitet!
        System.out.println("Ergebnis: " + ergebnis3);
    }
    
}
