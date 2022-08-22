// Brute Force Approach
class Solution
{
public:
    string reverseWords(string s)
    {
        int n = s.size();
        stack<string> st;
        string temp = "", ans = "";
        for (int i = 0; i < n; i++)
        {
            if (s[i] != ' ')
            {
                temp.push_back(s[i]);
            }
            else if (s[i] == ' ' && temp.size() != 0)
            {
                st.push(temp);
                temp = "";
            }
        }
        while (!st.empty())
        {
            if (temp.size() != 0)
            {
                if (ans.size() == 0)
                {
                    ans = temp;
                    temp = "";
                }
                else
                {
                    ans = ans + ' ' + temp;
                    temp = "";
                }
            }
            else
            {
                if (ans.size() == 0)
                {
                    ans = st.top();
                    st.pop();
                }
                else
                {
                    ans = ans + ' ' + st.top();
                    st.pop();
                }
            }
        }
        if (temp.size() != 0)
            return temp;
        else
            return ans;
    }
};


// Optimized Approach
class Solution
{
public:
    string reverseWords(string s)
    {
        int i = 0, j = 0, n = s.size();
        bool flag = 0;
        while (i < n)
        {
            while (i < n && s[i] == ' ')
                i++;
            if (flag)
            {
                s[j] = ' ';
                j++;
                flag = 0;
            }
            int start = j;
            while (i < n && s[i] != ' ')
            {
                s[j] = s[i];
                i++;
                j++;
                flag = 1;
            }
            reverse(s.begin() + start, s.begin() + j);
        }

        s.resize(j);
        if (s.back() == ' ')
            s.pop_back();
        reverse(s.begin(), s.end());
        return s;
    }
};