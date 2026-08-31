public class A08_SichtBereiche {
    public static void main(String[] args) {

        int aussen = 3;

        {
            int innen = 4;
            System.out.println("innen: " + (aussen + innen));
        }
        System.out.println("Aussen: " + aussen);
    }
}
