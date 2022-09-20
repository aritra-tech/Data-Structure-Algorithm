package Striver_SDE_Sheet.Recursion.Palindrome_Partitioning;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aabb";
        List <List<String>> ans = palinpartition(s);
        int n = ans.size();
        System.out.println("The Palindromic partitions are :-");
        System.out.print(" [ ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
        System.out.print("]");
    }
    public static List<List<String>> palinpartition(String s) {
        List<List<String>> res = new ArrayList< >();
        List<String> path = new ArrayList < > ();
        partitionHelper(0, s, path, res);
        return res;
    }

    static void partitionHelper(int index, String s, List <String> path, List <List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList <> (path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                partitionHelper(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }
    static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}
