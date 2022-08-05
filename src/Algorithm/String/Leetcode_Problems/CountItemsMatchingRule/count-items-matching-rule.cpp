class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int n = items.size(), count = 0;
        for(int i = 0; i<n; i++){
            if(ruleKey == "type"){
                if(items[i][0] == ruleValue){
                    count++;
                }
            }
            if(ruleKey == "color"){
                if(items[i][1] == ruleValue){
                    count++;
                }
            }
            if(ruleKey == "name"){
                if(items[i][2] == ruleValue){
                    count++;
                }
            }
        }
        return count;
    }
};
//https://leetcode.com/problems/count-items-matching-a-rule/
