import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myChoice;

do{
        System.out.println("-----------------------------");
        System.out.println("0 = Spiel beenden");
        System.out.println("1 = Stein");
        System.out.println("2 = Schere");
        System.out.println("3 = Papier");
        System.out.println("-----------------------------");

        
        System.out.print("Deine Auswahl: ");
        myChoice = sc.nextInt();
        System.out.println();


       

        int opponentChoice = (int) (Math.random() * 3) +1;


        
            
       
        if (myChoice == 1){
            System.out.println("Du hast Stein gewählt!");
        }else if (myChoice == 2) {
            System.out.println("Du hast Schere gewählt!");
        }else if (myChoice == 3){
            System.out.println("Du hast Papier gewählt!");
        }


        if (opponentChoice == 1){
            System.out.println("Dein Gegner hat Stein gewählt!");
        }else if (opponentChoice == 2) {
            System.out.println("Dein Gegner hat Schere gewählt!");
        }else if (opponentChoice == 3){
            System.out.println("Dein Gegner hat Papier gewählt!1");
        }


        if(myChoice == opponentChoice){
            System.out.println("Unentschieden!");
        }else if ((myChoice == 1 && opponentChoice == 2)||
                  (myChoice == 2 && opponentChoice == 3)||
                  (myChoice == 3 && opponentChoice == 1)) {
                    System.out.println("Du hast gewonnen!");

        }else{
            System.out.println("Du hast verloren!");
        }

    } while (myChoice != 0);

        System.out.println("Spiel beendet. Auf Wiedersehen!");

        sc.close();
        
    }



}
