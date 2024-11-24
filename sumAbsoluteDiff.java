import java.util.Arrays;
public class sumAbsoluteDiff{
    public static void main(String[] args){
        int[] A = {1,2,4};
        int[] B = {1,5,3};
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i=0;i<A.length;i++)
        {
            sum += (Math.abs(A[i]-B[i])); 
        }
        System.out.print("Minimum sum absolute difference "+sum);
    }
}