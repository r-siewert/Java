import java.util.ArrayList;

public class A04_ListeDurchlaufen {
    public static void main(String[] args) {
        ArrayList<String> farben = new ArrayList<String>();

        farben.add("Rot");
        farben.add("Gruen");
        farben.add("Blau");

        for (int index = 0; index < farben.size(); index++) {
            System.out.println("Farben: " + farben.get(index));
        }
    }
}
