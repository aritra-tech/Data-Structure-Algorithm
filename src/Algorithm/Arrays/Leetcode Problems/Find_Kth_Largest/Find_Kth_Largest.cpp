class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        int len = nums.size();
        // sort the array
        sort(nums.begin(), nums.end());
        // return kth largest
        return nums[len-k];
    }
};
