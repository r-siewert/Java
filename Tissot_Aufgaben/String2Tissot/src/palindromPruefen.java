import java.util.Scanner; 


public class palindromPruefen {

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein wort ein: ");
        String text = scanner.nextLine();

        

       String textLower = text.toLowerCase();

       String textUmgedreht = new StringBuilder(textLower).reverse().toString();


        if(textLower.equals(textUmgedreht)){
            System.out.println("Das Wort ist ein gültiges Palindrom: " + text);
        }else {
            System.out.println("Das Wort ist kein Palindrom: " + text);
        }

       scanner.close();     

    }
    
    }
