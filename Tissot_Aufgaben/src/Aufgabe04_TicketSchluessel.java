import java.util.Scanner;

public class Aufgabe04_TicketSchluessel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ticket;
        System.out.println("Bitte geben sie Ihren Ticketschluessel ein: ");
        ticket = scanner.nextLine();


        System.out.println(ticket.substring(7, 9));

        scanner.close();
        
    }
}
