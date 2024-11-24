import java.util.*;
public class jobSequence{
    static class Job{
        int idx;
        int deadline;
        int profit;
        public Job(int i,int d,int p)
        {
            idx = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args)
    {
        int job[][] = {{4,20},{1,10},{1,40},{1,30}};
        // int jobs[][] = new int[job.length][3];
        ArrayList<Integer> jobFinal = new ArrayList<>();
        // Collection.sort(jobs,(o1,o2)->o1[])
        // for(int i=0;i<jobs.length;i++)
        // {
        //     jobs[i][0] = i;
        //     jobs[i][1] = job[i][0];
        //     jobs[i][2] = job[i][1];
        // }
        // int time = 0;
        // for(int i=0;i<jobs.length;i++)
        // {
        //     if(jobs[i][1] > time)
        //     {
        //         jobFinal.add(jobs[i][0]);
        //         System.out.print("A"+jobs[i][0]+" ");
        //     }
        // }
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<job.length;i++)
        {
            jobs.add(new Job(i,job[i][0],job[i][1]));
        }
        Collections.sort(jobs,(ob1,ob2)->ob2.profit - ob1.profit);
        int time = 0;
        for(int i=0;i<jobs.size();i++)
        {
            Job curr = jobs.get(i);
            if(curr.deadline > time)
            {
                jobFinal.add(curr.idx);
                time++;
                System.out.print("A"+curr.idx+" ");
            }
        }

    }
}