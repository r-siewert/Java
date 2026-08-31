public class A15_ToCharArray {
    public static void main(String[] args) {
        
        String wort = "Java";


        // wandelt jeden Buchstaben in Array um
        char[] zeichen = wort.toCharArray();

        System.out.println("einZeichen: " + zeichen[2]);

        for (char c : zeichen) {

            System.out.println("Zeichen: " + c);
            
        }

    }
}
