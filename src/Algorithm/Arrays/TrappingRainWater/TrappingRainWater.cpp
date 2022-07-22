class Solution {
public:
    int trap(vector<int>& height) {
        int ans = 0;
        
        for(int i = 0; i < height.size(); i++){
            int maxLeft = 0, maxRight = 0;
            for(int j = i; j >= 0 ; j--){
                maxLeft = max(maxLeft, height[j]);
            }
            for(int j = i; j < height.size() ; j++){
                maxRight = max(maxRight, height[j]);
            }
            ans += min(maxLeft, maxRight) - height[i];
            // cout << maxLeft << " " << maxRight << " " << ans << endl;
        }
        
        return ans;
    }
};