class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n=nums.size();
        int first=-1,start=0,end=n-1,mid=0;
        vector<int>ans(2,-1);
        // first element
        while(start<=end)
        {
             mid=(start+end)/2;
            if(nums[mid]==target)
            {
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else end=mid-1;
        }
        ans[0]=first;
        
        //last element
         int last=-1;
         start=0,end=n-1,mid=0;
        while(start<=end)  
        {
            int mid=(start+end)/2;
            
            if(nums[mid]==target)
            {
                last=mid;
                start=mid+1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else end=mid-1;
        }
        ans[1]=last;
        
        return  ans;
    }
};