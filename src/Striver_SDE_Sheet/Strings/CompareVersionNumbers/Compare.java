/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given two version numbers, version1 and version2.
4. Compare those two version numbers.
5. We have to compare their revisions in left-to-right order to compare version numbers.
6. Revisions are compared using their integer value ignoring any leading zeros.
7. Using vector split the version numbers.
8. We mean that revisions 1 and 001 are considered equal.
9. Go upon the following conditions : If version1 < version2, return -1.
10. If version1 > version2, return 1.
11. Otherwise, return 0.

*/

package Striver_SDE_Sheet.Strings.CompareVersionNumbers;

public class Compare {
    public int compareVersion(String version1, String version2) {
        String[] splitOne = version1.split("\\.");
        String[] splitTwo = version2.split("\\.");
        int i = 0;
        for (i = 0; i < Math.min(splitOne.length, splitTwo.length); i++) {
          int diff = Integer.parseInt(splitOne[i]) - Integer.parseInt(splitTwo[i]);
          if (diff == 0) {
            continue;
          }
          return diff < 0 ? -1 : 1;
        }
        while (i < splitOne.length) {
          if (Integer.parseInt(splitOne[i++]) > 0) {
            return 1;
          }
        }
        while (i < splitTwo.length) {
          if (Integer.parseInt(splitTwo[i++]) > 0) {
            return -1;
          }
        }
        return 0;
      } 
}

// Time Conplexity : O(n)
// Space Complexity : O(1)