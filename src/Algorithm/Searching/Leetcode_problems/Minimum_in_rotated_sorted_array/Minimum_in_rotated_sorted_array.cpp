##Approach 1

class Solution {
public:
    int findMin(vector<int>& nums) {
        int n=nums.size();
        int mini=-1,start=0,end=n-1,mid=-1;
        
        if(nums.size()==1 || nums[start]<nums[end])
        {
            return nums[0];
        }
        while(start<=end)
        {
            mid= (start+end)/2;
            
            if(nums[mid] > nums[mid+1] )
            {
                mini=nums[mid+1];
                break;
            }
            if(nums[mid-1]>nums[mid])
            {
                mini=nums[mid];
                break;   
            }
            if(nums[start]<nums[mid])
            {
                start=mid+1;
            }
            else end=mid-1;
        }
        return mini;
    }
};



##Approach 2

class Solution {
public:
    int findMin(vector<int>& nums) {
        int n=nums.size();
        int mini=-1,start=0,end=n-1,mid=-1;

        
        while(start<end)
        {
            mid=(start+end)/2;
            
            if(nums[start] < nums[end]) return nums[start];
            else if(nums[mid] > nums[end]) start=mid+1;
            else end=mid;
        }
        return nums[start];
    }
};