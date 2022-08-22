// Brute Force Approach

class Solution
{
public:
    int romanToInt(string s)
    {
        unordered_map<char, int> mp;
        mp.insert({'I', 1});
        mp.insert({'V', 5});
        mp.insert({'X', 10});
        mp.insert({'L', 50});
        mp.insert({'C', 100});
        mp.insert({'D', 500});
        mp.insert({'M', 1000});

        int n = s.size();
        int result = mp[s[n - 1]];
        for (int i = n - 2; i >= 0; i--)
        {
            if (mp[s[i]] >= mp[s[i + 1]])
            {
                result += mp[s[i]];
            }
            else
                result -= mp[s[i]];
        }
        return result;
    }
};


// Optimized Approach
class Solution
{
public:
    int help(char str)
    {
        switch (str)
        {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        }
        return 0;
    }
    int romanToInt(string s)
    {
        int n = s.size();
        int sum = help(s[n - 1]);
        for (int i = n - 2; i >= 0; i--)
        {
            if (help(s[i + 1]) <= help(s[i]))
            {
                sum += help(s[i]);
            }
            else
                sum -= help(s[i]);
        }
        return sum;
    }
};