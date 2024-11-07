
import java.util.Arrays;

class Job {
    int id, deadline, profit;
    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class jobScheduling {
    public static void jobSequencing(Job [] jobs){
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxDeadline=0;
        for(Job job:jobs){
            maxDeadline=Math.max(maxDeadline,job.deadline);
        }
        int[] slots = new int[maxDeadline + 1];
        int totalProfit = 0;
        for(Job job:jobs){
            for(int j=job.deadline;j>0;j--){
                if(slots[j]==0){
                    slots[j]=job.id;
                    totalProfit+=job.profit;
                    break;
                }
            }
        }
        System.out.println(totalProfit);
        System.out.println(Arrays.toString(slots));
    }

    public static void main(String args[]){
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        jobSequencing(jobs);
    }
}
