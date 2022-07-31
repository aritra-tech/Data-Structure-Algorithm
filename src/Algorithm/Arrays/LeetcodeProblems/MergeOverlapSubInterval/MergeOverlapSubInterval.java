package Algorithm.Arrays.LeetcodeProblems.MergeOverlapSubInterval;

import java.util.Arrays;

class Interval
{
    int start,end;

    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}
public class MergeOverlapSubInterval {

    public static void main(String[] args){
        int[][] intervals = {{1,3},
                            {2,6},
                            {8,10},
                            {15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
   
    public static int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int prev = 0;
        for (int cur = 1; cur < intervals.length; cur++) {
            if (intervals[cur][0] <= intervals[prev][1]) {
                intervals[prev][1] = Math.max(intervals[prev][1], intervals[cur][1]);
            } else {
                prev++;
                intervals[prev][0] = intervals[cur][0];
                intervals[prev][1] = intervals[cur][1];
            }
        }
        return Arrays.copyOfRange(intervals, 0, prev + 1);
       
    }
}
    