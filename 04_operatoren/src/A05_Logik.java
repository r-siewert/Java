public class A05_Logik {
    public static void main(String[] args) {

        int alter = 21;
        boolean hatAusweis = true;

        boolean darfTeilNehmen = alter >= 18 && hatAusweis; // true
        boolean brauchtBegleitung = alter < 18 || !hatAusweis; // false

        System.out.println("Darf teilnehmen: " + darfTeilNehmen);
        System.out.println("Braucht Begleitung: " + brauchtBegleitung);

        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("hat Zugriff: " + (isLoggedIn && !isAdmin));
    }

}
