import java.util.*;
public class ActivitySelection{
    public static void main(String[] args)
    {
        int[] start = {10,12,20};
        int[] end = {20,25,30};
        int maxAct = 0;
        ArrayList<Integer> result = new ArrayList<>();
        // add first activity
        maxAct = 1;
        result.add(0);
        int LastElement = end[0];
        for(int i=1;i<start.length;i++)
        {
            if(start[i] >= LastElement)
            {
                maxAct++;
                result.add(i);
                LastElement = end[i];
            }
        }
        for(int i=0;i<result.size();i++)
        {
            System.out.print("A"+result.get(i)+" ");
        }
    }
}