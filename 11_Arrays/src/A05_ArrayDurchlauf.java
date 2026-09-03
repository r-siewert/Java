public class A05_ArrayDurchlauf {
    public static void main(String[] args) {
        
        int[] temp = {12, 5, 66666, 89};

        for (int index = 0; index < temp.length; index++){
        System.out.println("Temp: " + temp[index]);
        }

        System.out.println();
        System.out.println("#######################################");
        System.out.println();

        for (int tempa : temp){
            System.out.println("Temp mit foreach: " + tempa);
        }

        System.out.println();
        System.out.println("#######################################");
        System.out.println();

        int counter = 0;
        while(counter < temp.length){
        System.out.println("Temp mit while: " + temp[counter]);
        counter++;
        }

        System.out.println();
        System.out.println("#######################################");
        System.out.println();

        int counter1 = 0;
        do{
        System.out.println("Temp mit do while: " + temp[counter1]);
            counter1++;
    
        } while (counter1 < temp.length);
    }
}
