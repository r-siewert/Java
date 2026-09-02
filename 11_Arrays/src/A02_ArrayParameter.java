public class A02_ArrayParameter {
    public static void main(String[] args) {
        
        // System.out.println("Daten1 von Außen: " + args[0]);
        // System.out.println("Daten2 von Außen: " + args[1]);

        //diese datei über das terminal ausführen und hinter A02_ArrayParameter.java 2 eingaben vornehmen, um von außen die arrays zu füttern!

        try{
            System.out.println("Daten von Außen: " + args[0] + " und " + args[1]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Es gibt keine Daten");

        }

        for (String namen : args){
            System.out.println("Namen: " + namen);
        }

    }
}
