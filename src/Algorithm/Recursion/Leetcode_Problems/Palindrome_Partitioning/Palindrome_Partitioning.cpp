class Solution {
public:
    vector<vector<string>> partition(string s)
    {
        vector<vector<string>> ans;
        vector<string> sub;
        partition(s, 0, sub, ans);
        return ans;
    }
    
    void partition(string& s, int i, vector<string>& sub, vector<vector<string>>& ans)
    {   
        int l = s.length();
    
        if(i == l)
        {
            ans.push_back(sub);
            return;
        }
    
        for(int j = i; j < l; ++j)
        {
            string temp = s.substr(i, j - i + 1);
            if(isPalindrome(temp))
            {
                sub.push_back(temp);
                partition(s, j + 1, sub, ans);
                sub.pop_back();
            }
        }
    }

    
    bool isPalindrome(string s)
    {
        int l = s.length();
    
        for(int i = 0; i < l / 2; ++i)
            if(s[i] != s[l - 1 - i])
                return false;
    
        return true;
    }
};
