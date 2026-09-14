import java.io.IOException;

public class A08_ThrowsWeitergabe {

    public static String leseStatus(boolean erreichbar) throws IOException {

        if (!erreichbar) {

            throw new IOException("Dienst nicht erreichbar!");
        }

        return "Dienst erreichbar";
    }

    public static void main(String[] args) {
        try {
            System.out.println(leseStatus(false));
        } catch (IOException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
// WEitergabe einer checked exception