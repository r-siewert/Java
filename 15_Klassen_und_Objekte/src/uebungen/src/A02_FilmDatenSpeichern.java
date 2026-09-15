package uebungen.src;

class Film {

    String titel;
    int minuten;
}

public class A02_FilmDatenSpeichern {
    public static void main(String[] args) {
        Film film = new Film();

        System.out.println("Standardtitel: " + film.titel);
        System.out.println("Standardminuten: " + film.minuten);

        film.titel = "Kurzfilm";
        film.minuten = 12;

        System.out.println("Film: " + film.titel + ", " + film.minuten + " Minuten");
    }
}
