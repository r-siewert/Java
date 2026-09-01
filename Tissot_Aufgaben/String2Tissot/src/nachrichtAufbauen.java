import java.util.Scanner;

public class nachrichtAufbauen {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bitte gib ein Wort ein ");

    String text = scanner.nextLine();


    StringBuilder newtext = new StringBuilder(text);


    newtext.insert(0, "Mein ");
    newtext.append(" Kurs");
    System.out.println(newtext);



        scanner.close();



}
    




}
