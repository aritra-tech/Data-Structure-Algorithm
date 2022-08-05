class Solution
{
public:
    string restoreString(string s, vector<int>& indices)
    {
        char a[s.length() + 1];
           int i =0;
           for(; i < s.length(); i++)
           {
               a[indices[i]] = s[i];
           }
           a[i] = 0;
           return a;
	}
};

