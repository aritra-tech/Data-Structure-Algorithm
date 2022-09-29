package Companywise_Questions.Flipkart.Merge_Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals);
        List<int[]> out_arr = new ArrayList();
        int[] curr_interval = intervals[0];
        out_arr.add(curr_interval);

        for (int[] i : intervals) {
            int curr_begin = curr_interval[0];
            int curr_end = curr_interval[1];
            int next_begin = i[0];
            int next_end = i[1];
            if (curr_end >= next_begin) {
                curr_interval[1] = Math.max(curr_end, next_end);
            } else {
                curr_interval = i;
                out_arr.add(curr_interval);
            }
        }
        return out_arr.toArray(out_arr);
    }
}
