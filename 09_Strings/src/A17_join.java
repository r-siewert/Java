public class A17_join {
    public static void main(String[] args) {
        //String farben = String.join( "-", "Rot", "Blau", "Gruen");
        String farben = String.join( "*", "Rot", "Blau", "Gruen").toUpperCase();

        System.out.println("verbunden: " + farben);
    }
}
