

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    
    public static void printFromNumberToOne(int num) {
        // print the numbers from the number passed as a parameter down to one
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
