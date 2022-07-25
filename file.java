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

// 2. Find Peak Element
public class Main
{
	public static void main(String[] args) {
	    int[] nums={1,2,3,1};
	   // Explanation: 3 is a peak element and your function should return the index number 2.

		System.out.println(findPeakElement(nums));
	}
	 static int findPeakElement(int[] arr) {
        int ans=0;
        ans=maximumOfArray(arr);
        return ans;
    }

     static int maximumOfArray(int[] arr){
        int ans=0;
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
            if (start == end) {

                ans=start;
                break;
            }
        }
        return ans;
}
}
// 3.Find Smallest Letter Greater Than Target
public class Main
{
	public static void main(String[] args) {
	    char[] letters={'c','f','j'};
	    char target='a';
		System.out.println(nextGreatestLetter(letters,target));
	}
	static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        int start=0;
        int end=letters.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return letters[start];
    }
}

