class Datei {
    String name;
    String format;

    Datei(String pname, String pformat) {
        this.name = pname;
        this.format = pformat;
    }

    Datei(String pname) {
        this(pname, "TXT");
    }
}

public class praccA05_Datei {
    public static void main(String[] args) {
        Datei notizen = new Datei("notizen");

        System.out.println("Datei: " + notizen.name + ", " + notizen.format);

        Datei berlin = new Datei("Berlin");

        System.out.println("Datei: " + berlin.name + ", " + berlin.format);
    }
}
