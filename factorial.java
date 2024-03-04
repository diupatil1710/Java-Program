public class factorial {
    public static void main(String[] args){
        int n=calcfactorial(5);
        System.out.println(n);
    }
    public static int calcfactorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*calcfactorial(n-1);
    }
}
