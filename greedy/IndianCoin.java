import java.util.*;
public class IndianCion{
    public static void main(String args[])
    {
        int coinGiven = 121;
        int[] coin = {2000,500,100,50,20,10,5,2,1};
        ArrayList<Integer> collectCion = new ArrayList<>();
        int count = 0;
        for(int i=0;i<coin.length;i++)
        {
            if(coin[i] <= coinGiven)
            {
                while(coin[i] <= coinGiven)
                {
                    collectCion.add(coin[i]);
                    count++;
                    coinGiven -= coin[i];
                }
            }
        }
        System.out.print("money Given to: "+count+" and that are { ");
        for(int i=0;i<collectCion.size();i++)
        {
            System.out.print(collectCion.get(i)+" ");
        }
        System.out.print("}");
    }
}