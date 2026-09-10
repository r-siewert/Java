import java.io.IOException;

public class A05_CheckedException {

    public static String leseDatei(boolean dateiVerfügbar) throws IOException {

        if (!dateiVerfügbar) {
            throw new IOException("Datei kann nicht gelesen werden!");
        }

        return "dateiinhalt";

    }

    public static void main(String[] args) {

        try {
            String inhalt = leseDatei(true);

            System.out.println("Ich lesen den: " + inhalt);

        } catch (IOException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        }
    }
}
