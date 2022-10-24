package Striver_SDE_Sheet.Recursion.CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Combination_Sum_II {
    public static void main(String[] args){
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        System.out.println(combinationSum2(candidates,target));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }
    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {

        if (remain < 0) {
            return;
        }
        else if (remain == 0) {
            list.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < cand.length; i++) {
                if (i > start && cand[i] == cand[i - 1]) continue;
                tempList.add(cand[i]);
                backtrack(list, tempList, cand, remain - cand[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
