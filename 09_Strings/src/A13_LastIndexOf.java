public class A13_LastIndexOf {
    public static void main(String[] args) {
        
        String text = "Java Kurs Java";

        System.out.println("Erste Vorkommen: " + text.indexOf("Java")); // 0
        System.out.println("Letztes Vorkommen: " + text.lastIndexOf("Java")); // 10
        System.out.println("Letztes Vorkommen ab index: " + text.lastIndexOf("Java", 9)); // 0

        System.out.println("Nicht gefunden: " + text.lastIndexOf("Java")); // -1

        // indexOf() und lastIndexOf() geben den Index des ersten bzw. letzten Vorkommens eines Strings zurück.
        // lastIndexOf() kann auch einen zweiten Parameter annehmen, der angibt, ab welchem Index gesucht wird.
    }
}
