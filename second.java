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
