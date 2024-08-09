import java.util.Scanner;

public class AddandReverse {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        while(true)
        {
            n = n + reverse(n);
            count++;
            if(ispalindrome(n))
            {
                System.out.println(count+ " " +n);
                break;
            }
           
        }
    }
    static boolean ispalindrome(long n)
    {
        String str = String.valueOf(n);
        int i=0,j=str.length()-1;
        while (i<j) {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
            
        }
        return true;
    }
    static long reverse(long n)
    {
        long reverse=0;
        while(n != 0)
        {
            long p = n % 10;
            reverse = reverse * 10 + p;
            n/=10;

        }
        return reverse;
    }
}
