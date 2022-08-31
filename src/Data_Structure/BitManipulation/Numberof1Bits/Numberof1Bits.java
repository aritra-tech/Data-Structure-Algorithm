package Data_Structure.BitManipulatio.Numberof1Bits;

public class Numberof1Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
      int bits = 0;
      int mask = 1;
      for (int i = 0; i < 32; i++) {
        if ((n & mask) != 0) {
          bits++;
        }
        mask <<= 1;
      }
      return bits;
    }
  }

  // Time Complexity: O(1)
// Space Complexity: O(1)