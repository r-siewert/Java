public class A010_Contains {
public static void main(String[] args) {
    
    String text = "Java";

    System.out.println("Gefunden: " + text.contains("va")); // true
    System.out.println("Gefunden: " + text.contains("ja")); // true
    System.out.println("Gefunden: " + text.toLowerCase().contains("jav")); // true

    // ergibt true, weil der leere String "" in java als String gilt
    System.out.println("Gefunden: " + text.contains("")); // true

}
}
