## Problem Statement - Roman to Integer


### Link :- [Roman to Integer](https://leetcode.com/problems/roman-to-integer/)

### Approach-1

- Store in hashmap all the 7 roman numerals along with their values.
-  We will add Roman numerals in the result , they will be subtractive only when a smaller number appreas before a larger number . Ex: IV (which is 4)
-  Therefore we will iterate backwards from the right side towards the left and result will store the value of last element.
- So we will add every letter in result until we get a letter which is smaller than its next letter then we will subtract it from result.


### Code

class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char,int>mp;
        mp.insert({'I',1});
        mp.insert({'V',5});
        mp.insert({'X',10});
        mp.insert({'L',50});
        mp.insert({'C',100});
        mp.insert({'D',500});
        mp.insert({'M',1000});
        
        int n=s.size();
        int result=mp[s[n-1]];
        for(int i=n-2;i>=0;i--)
        {
            if(mp[s[i]] >= mp[s[i+1]])
            {result+=mp[s[i]];}
            else result-=mp[s[i]];
        }
        return result;
    }
};


 ### Complexity
- Time Complexity:O(N)
- Space Complexity:O(1) as hashmap will contain only 7 values for every testcase not more than that


### Approach-2

- Approach is same that keep on adding the letters in the result until we find a letter whose value is smaller than the next one.
- Here we will use switch case instead of hashmap, so whenever we want value of any letter then through recursion we will get that value.

### Code

class Solution {
public:
    int help(char str)
    {
        switch(str)
        {
            case 'I' : return 1;
            case 'V' : return 5; 
            case 'X' : return 10; 
            case 'L' : return 50; 
            case 'C' : return 100; 
            case 'D' : return 500; 
            case 'M' : return 1000; 
        }
        return 0;
    }
    int romanToInt(string s) {
        int n=s.size();
        int sum=help(s[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            if(help(s[i+1]) <= help(s[i]))
            {
                sum+= help(s[i]);
            }
            else sum-=help(s[i]);
        }
        return sum;
    }
};

 ### Complexity
- Time Complexity:O(N)
- Space Complexity:O(1)