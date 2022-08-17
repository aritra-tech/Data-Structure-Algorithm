/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with two strings s and t.
4. We have to just rearrange the letters of a different word or phrase.
5. We have to perform this using all the original letters exactly once.
6. Look at the given constraints Constraints: 1 <= s.length, t.length <= 5 * 104 && s and t consist of lowercase English letters.
7. Now return true if t is an anagram of s
8. Otherwise return false.

*/

package Striver_SDE_Sheet.Strings.ValidAnagram;

public class Anagram {
    public boolean isAnagram(String s, String t) {
		if (s == null && t == null) {
			return true;
		}
		if (s.length() != t.length()) {
			return false;
		}
		final int mapLen = 26;
		int[] map1 = new int[mapLen];
		int[] map2 = new int[mapLen];
		int len = s.length();
		for (int i = 0; i < len; i++) {
			char c1 = s.charAt(i);
			map1[c1 - 'a']++;
			// ASCII of letter a is 97
			int c2 = t.charAt(i);
			map2[c2 - 97]++;
		}
		for (int i = 0; i < mapLen; i++) {
			if (map1[i] != map2[i]) {
				return false;
			}
		}
		return true;
	}
}

// Time Complexity: O(nlogn)
// Space Complexity: O(1)
