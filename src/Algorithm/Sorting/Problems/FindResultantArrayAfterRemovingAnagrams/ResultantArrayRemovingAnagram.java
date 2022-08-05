package Algorithm.Sorting.Problems.FindResultantArrayAfterRemovingAnagrams;

import java.util.*;
public class ResultantArrayRemovingAnagram {
    static List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String next = " ";
        for (int  i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            Arrays.sort(temp);
            String temp2 = new String(temp);
            if (!temp2.equals(next)) {
                list.add(words[i]);
            }
            next = temp2;
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        System.out.println(removeAnagrams(words));

    }
}
