class Solution {
public:
    int binarysearch(vector<int>& nums,int target,int first,int last)
    {
        while(first<=last)
        {
            int midval=(first+last)/2;
            if(nums[midval]==target) return midval;
            else if(nums[midval]>target)
            {
                last=midval-1;
            }
            else {first=midval+1;}
        }
        
        return -1;
    }
    int search(vector<int>& nums, int target) {
        int n=nums.size();
        int start=0,end=n-1,mid=-1,index=-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(nums[start]<=nums[end]) {index=start;break;}
            else if(nums[mid]>nums[end]) start=mid+1;
            else end=mid;
        }
        int num1= binarysearch(nums,target,0,index-1);
        int num2= binarysearch(nums,target,index,n-1);
        if(num1==-1)return num2;
        else return num1;
    }
};