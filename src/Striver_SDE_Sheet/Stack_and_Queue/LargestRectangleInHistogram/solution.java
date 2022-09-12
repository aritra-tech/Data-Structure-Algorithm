package Striver_SDE_Sheet.Stack_and_Queue.largestRectangleHistogram; 

import java.util.*;
public class solution {
    static int largestRectangleArea(int histo[]) {
        Stack < Integer > st = new Stack < > ();
        int max_area = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                max_area = Math.max(max_area, width * height);
            }
            st.push(i);
        }
        return max_area;
    }

    public static void main(String args[]) {
        int histo[] =  {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(histo));
    }
}