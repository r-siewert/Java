class Ticket {

    String typ;

    Ticket() {
        typ = "Standard";
        System.out.println("Ticket erzeugt!");
    }
}

public class A02_KonstruktorAufruf {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        System.out.println("Typ: " + ticket.typ);
    }
}
