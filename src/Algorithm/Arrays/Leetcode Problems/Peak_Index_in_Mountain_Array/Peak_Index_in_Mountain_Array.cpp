class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
	    //start=1 and end=n-2 as peak can never be first and last element
        int start=1,end=arr.size()-2,answer;
        while(start<=end){

            int middle=start+(end-start)/2;
            //peak will always greater than left and right element
            if(arr[middle]>arr[middle-1] and arr[middle]>arr[middle+1]){
                answer=middle;
                break;
            }
			//if left element is greater than mid, peak will be in left side
            else if(arr[middle-1]>arr[middle])
                end=middle-1;
            else
                start=middle+1;
        }
        return answer;
    }
};
