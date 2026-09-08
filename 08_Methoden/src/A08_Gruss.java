public class A08_Gruss {
    public static String gruss(String name, int alter) {
        return "Hallo " + name + ", du bist " + alter + " Jahre alt.";
    }

    public static void main(String[] args) {
        String text = gruss("Stefan", 56);
        System.out.println(text);
    }
}
