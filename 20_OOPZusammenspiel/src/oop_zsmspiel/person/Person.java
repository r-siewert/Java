package oop_zsmspiel.person;

import oop_zsmspiel.adresse.Adresse;

public class Person {
    private String name;
    private Adresse adresse;

    public Person(String name, Adresse adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}