import java.util.Scanner;

public class multiplication_game {
    public static void main(String[] args) {
        int a = 2, b = 9, p = 1;
        Scanner input = new Scanner(System.in);
        int target=1;
        while (true) {
           
            int n = input.nextInt();
            while (true) {
                if(target==1)
                {
                    p*=9;
                }
                else{
                    p*=2;
                }
                if (n <= p) {
                    break;
                }
                target = target==1 ? 0 :1;
            }
            if(target==1)
            {
                System.out.println("stan wins");
            }
            else
            {
                System.out.println("ollie wins");
            }

        }
    }
}
