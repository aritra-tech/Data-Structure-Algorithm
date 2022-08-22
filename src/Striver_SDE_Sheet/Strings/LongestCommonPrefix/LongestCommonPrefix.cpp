
// Brute Force Approach

class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        int n = strs.size();
        string ans = "";
        sort(strs.begin(), strs.end());
        string a = strs[0];
        string b = strs[n - 1];
        for (int i = 0; i < a.size(); i++)
        {
            if (a[i] == b[i])
            {
                ans += a[i];
            }
            else
            {
                break;
            }
        }
        return ans;
    }
};

// Optimized Approach

class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        string ans = strs[0];
        for (int i = 1; i < strs.size(); i++)
        {
            int j;
            for (j = 0; j < ans.size(); j++)
            {
                if (ans[j] != strs[i][j])
                    break;
            }

            ans = ans.substr(0, j);
            if (ans == "")
            {
                return ans;
            }
        }
        return ans;
    }
};