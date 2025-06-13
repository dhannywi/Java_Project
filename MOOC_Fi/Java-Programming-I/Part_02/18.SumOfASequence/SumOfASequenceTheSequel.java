import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("First number?");
        int num1 = scan.nextInt();
        System.out.println("Second number?");
        int num2 = scan.nextInt();
        
        int sum = 0;
        
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
