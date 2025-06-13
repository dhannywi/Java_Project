
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        
        System.out.println("Give numbers:");
        while (num != -1){
            sum += num;
            num = scanner.nextInt();
            if (num != -1){
                count++;
                if (num%2 != 0) {
                    odd++;
                } else {
                    even++;
                }
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double) sum / count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
