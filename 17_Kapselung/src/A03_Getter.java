class Profil {
    private String name;

    Profil(String pname) {
        this.name = pname;
    }

    public String getName() {
        return name;
    }
}

public class A03_Getter {
    public static void main(String[] args) {
        Profil profil = new Profil("Stefan");

        System.out.println("Name: " + profil.getName());
    }
}
