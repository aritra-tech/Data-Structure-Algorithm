// 1.Find First and Last Position of Element in Sorted Array
import java.util.Arrays;
public class Main
{
  public static void main (String[]args)
  {
    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;
    System.out.println (Arrays.toString (searchRange (nums, target)));

  }
  static int[] searchRange (int[]nums, int target)
  {
    int[] ans = { -1, -1 };

    ans[0] = a1 (nums, target, true);
    ans[1] = a1 (nums, target, false);

    return ans;
  }

  static int a1 (int[]nums, int target, boolean findStartIndex)
  {
    int a = -1;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end)
      {
	int mid = start + (end - start) / 2;
	if (target > nums[mid])
	  {
	    start = mid + 1;
	  }
	else if (target < nums[mid])
	  {
	    end = mid - 1;
	  }
	else
	  {
	    a = mid;
	    if (findStartIndex)
	      {
		end = mid - 1;
	      }
	    else
	      {
		start = mid + 1;
	      }
	  }
      }
    return a;
  }
}
