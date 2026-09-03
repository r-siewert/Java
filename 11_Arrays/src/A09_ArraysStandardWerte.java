public class A09_ArraysStandardWerte {
    public static void main(String[] args) {
        int[] primitiveZahlen = new int[3];

        // es wird 0 zugewiesen als default wert
        for(int i = 0; i < primitiveZahlen.length ; i++){
            System.out.println("Primitive Standardwerte: " + primitiveZahlen[i] );
        }



        // Primitiver Datentyp verpackt in einem OBJEKT
        Integer[] referenzZahlen = new Integer[3];
        for(int i = 0; i < referenzZahlen.length ; i++){
            System.out.println("Primitive Standardwerte: " + referenzZahlen[i] );
        }

        int zahl1 = 8;
        System.out.println(zahl1);

        // WEnn ein Objekt leer ist, ist es kein Objekt
        Integer zahl2 = null;
        System.out.println(zahl2);
    }
}
