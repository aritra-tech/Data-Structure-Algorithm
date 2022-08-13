/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with a positive integer n.
4. We split digit string into the minimal number of substrings.
5. Each substring contains exactly one unique digit.
6. Then for each substring, say the number of digits, then say the digit.
7. Finally, concatenate every said digit and return the nth term of the count-and-say sequence.

*/

package Striver_SDE_Sheet.Strings.CountandSay;

public class Count {
    public String nextString(String str) {
		StringBuilder next = new StringBuilder();
		int len = str.length();
		int i = 0;
		while (i < len) {
			int j = i;
			int count = 0;
			char currentNumber = str.charAt(i);
			while (j < len && str.charAt(j) == currentNumber) {
				j++;
				count++;
			}
			next.append(count).append(currentNumber);
			i = j;
		}
		return next.toString();
	}
	public String countAndSay(int n) {
		if (n <= 1) {
			return "1";
		} else {
			String p = "1";
			for (int i = 2; i <= n; i++) {
				String next = nextString(p);
				p = next;
			}
			return p;
		}
	}
}

// Time Complexity: O(n * 2^n)
// Space Complexity: O(2^n)

