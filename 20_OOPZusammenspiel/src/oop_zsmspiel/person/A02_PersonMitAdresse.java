package oop_zsmspiel.person;

import oop_zsmspiel.adresse.Adresse;

public class A02_PersonMitAdresse {
    public static void main(String[] args) {

        Adresse adresse = new Adresse("Musterstrasse 26 a", "Berlin");
        Person person = new Person("Reinhard", adresse);

        System.out.println("Name: " + person.getName());
        System.out.println("Adresse: " + person.getAdresse().getStadt());
    }
}
