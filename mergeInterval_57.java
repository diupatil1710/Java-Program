import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class mergeInterval_57 {
    public static void main(String[] args) {
        int[][] arr = {[1,3],[2,6],[8,10],[15,18]};
        System.out.println(merge(arr));

    }
    public int[][] merge(int[][] interval)
    {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(interval,Comparator.comparingInt(a-> a[0]));
        int i=0;
        for(;i<interval.length;i++)
        {
            int start = interval[i][0];
            int end = interval[i][1];
            while(i< interval.length-1 && interval[i][1] >= interval[i+1][0])
            {
                end=Math.max(interval[i][1],interval[i+1][1]);
            }
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(start);
            arr.add(end);
            list.add(arr);
        }
        int[][] merge = new int[list.size()][2];
        for(int p=0;p<list.size();p++)
        {
                merge[p][0] = list.get(p).get(0);
                merge[p][1] = list.get(p).get(1);
        }
        return merge;

    }
}
