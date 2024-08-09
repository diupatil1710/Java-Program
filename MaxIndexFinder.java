import java.util.Arrays;

public class MaxIndexFinder {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 5, 0};
        int[] result = findMaxAndIndex(arr);
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] findMaxAndIndex(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                index = i;
            }
        }
        return new int[]{maxVal, index};
    }
}