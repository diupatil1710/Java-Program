
import java.util.Scanner;

public class ones_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int ans = 1;
            int n = input.nextInt();
            // int remainder=0;
            int x = 0;
            if (n == 1 || n % 2 == 0 || n % 5 == 0) {
                System.out.println("Number is 1 or divisible by 2 and 5");
                continue;
            } else {
                int remainder = 1;

                while (remainder != 0) {
                    x = remainder * 10 + 1;
                    remainder = x % n;
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }

}
