class Profil {
    String name;
    int alter;

    Profil(String para_name, int para_alter) {
        name = para_name;
        alter = para_alter;
    }
}

public class A03_ParametisierterKonstruktor {
    public static void main(String[] args) {
        Profil profil1 = new Profil("Stefan", 56);
        System.out.println("Profil: " + profil1.name + ", " + profil1.alter);

        Profil profil2 = new Profil("Yasmina", 30);
        System.out.println("Profil: " + profil2.name + ", " + profil2.alter);
    }
}
