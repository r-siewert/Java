class Teilnehmer {
    String name;
    String nname;
}

public class ObjektArray {
    public static void main(String[] args) {
        Teilnehmer[] teilnehmer = new Teilnehmer[2];

        System.out.println("Vorher: " + teilnehmer[0]); // null.. da noch keine Namen enthalten sind im Array

        teilnehmer[0] = new Teilnehmer();
        teilnehmer[1] = new Teilnehmer();

        teilnehmer[0].name = "Stefan";
        teilnehmer[0].nname = "Tissot";
        teilnehmer[1].name = "Reik";
        teilnehmer[1].nname = "Perner";

        System.out.println("Teilnehmer: " + teilnehmer[0].name + " - " + teilnehmer[0].nname);
        System.out.println("Teilnehmer: " + teilnehmer[1].name + " - " + teilnehmer[1].nname);

        for (int i = 0; i < teilnehmer.length; i++) {
            System.out.println("Teilnehmer: " + teilnehmer[i].name + " - " + teilnehmer[1].name);
        }
    }
}
