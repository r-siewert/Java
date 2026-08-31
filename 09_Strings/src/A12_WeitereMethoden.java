public class A12_WeitereMethoden {
    public static void main(String[] args) {
        
        String text = "JavaKurs";
        String leer = "";




        System.out.println("Vergleich: " + text.compareTo("JavaKurs")); // 0

        // JavaKurs = 8
        // JavaKursX = 9
        // 8-9 = -1

        System.out.println("Vergleich: " + text.compareTo("JavaKursX")); // -1
        System.out.println("Vergleich: " + text.compareTo("JavaKursXYZ")); // -3


        System.out.println("Begunnt: " + text.startsWith("Ja")); // true
        System.out.println("Beginnt: " + text.endsWith("urs")); // true
        System.out.println("Beginnt: " + text.endsWith("")); // true
        System.out.println("Beginnt: " + text.endsWith(" ")); // false

        System.out.println("Leer: " + leer.isEmpty());

        // valueOf() wandelt eine Zahl in einen String
        System.out.println("Zahl als Text: " + String.valueOf(44).length());
    }
}
