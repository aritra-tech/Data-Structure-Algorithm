public class Main
{
  public static void main (String[]args)
  {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    System.out.println (search (nums, target));
  }

  static int search (int[]nums, int target)
  {
    int pivot = pivotelement (nums, 0, nums.length - 1);
    if (pivot == -1)
      {
	//if we don't find a pivot it means array is not rotated so just do noraml binary seaarch
	return binarySearch (nums, target, 0, nums.length - 1);
      }
    if (nums[pivot] == target)
      {
	return pivot;
      }
    //if pivot is found we have found two ascending sorted array
    int ans = binarySearch (nums, target, 0, pivot);
    if (ans == -1)
      {
	ans = binarySearch (nums, target, pivot + 1, nums.length - 1);
      }
    return ans;
  }

  static int pivotelement (int[]arr, int start, int end)
  {
    while (start <= end)
      {
	int mid = start + (end - start) / 2;
	if (mid < end && (arr[mid] > arr[mid + 1]))
	  {
	    return mid;
	  }
	if (mid > start && (arr[mid] < arr[mid - 1]))
	  {
	    return mid - 1;
	  }
	if (arr[start] >= arr[mid])
	  {
	    end = mid - 1;
	  }
	else
	  {
	    start = mid + 1;
	  }
      }
    return -1;
  }

  static int binarySearch (int[]arr, int target, int start, int end)
  {
    while (start <= end)
      {
	int mid = start + (end - start) / 2;
	if (arr[mid] == target)
	  {
	    return mid;
	  }
	else if (target > arr[mid])
	  {
	    start = mid + 1;
	  }
	else
	  {
	    end = mid - 1;
	  }
      }
    return -1;

  }
}

