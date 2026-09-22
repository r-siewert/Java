package oop_zsmspiel.adresse;

public class Adresse {
    private String strasse;
    private String stadt;

    public Adresse(String strasse, String stadt) {

        this.strasse = strasse;
        this.stadt = stadt;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }
}
