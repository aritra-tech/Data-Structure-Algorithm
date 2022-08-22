## Problem Statement - Reverse Words in a String


### Link :- [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)

### Approach

- We will create a stack to store the words & string temp to store words temporarily.

- Now we will loop through the string given as input , so if s[i] is not empty space then we will push the characters in temp so that it become a word.

- If s[i] is empty space and size of temp is also not 0 it means we got a word and now we will push that word in stack and will make temp as empty to store another word.

- Once we done iterating over the sentence given as input , we'll see while stack is not empty, we'll check if temp's size is 0 or not because if temp size is 0 that means all the words are in stack & there was some trailing space in sentence but if temp size was not empty that means last word is still in temp.

- It temp size is not empty then we will firstly add that word in ans as it will be the last word of input, now if ans is empty then we'll directly add temp in it otherwise we will add empty space in between.

- If temp size is 0 means all elements are in stack so we will pop the elements from stack and will add it in our ans along with adding empty space after every word.

- If there is a single word only (ex: abscged) then it will be stored in temp & stack will remain empty so for that we'll add a condition at last if temp size is not 0 still then it means we need to return temp.


### Code

class Solution {
public:
    string reverseWords(string s) {
        int n=s.size();
        stack<string>st;
        string temp="",ans="";
        for(int i=0;i<n;i++)
        {
            if(s[i]!= ' ')
            {
                temp.push_back(s[i]);
            }
            else if(s[i]==' ' && temp.size()!=0)
            {
                st.push(temp);
                temp="";
            }
        }
        while(!st.empty())
        {
            if(temp.size()!=0)
            {
                if(ans.size()==0) {ans=temp; temp="";}
                else
                {
                    ans=ans+' '+temp;
                    temp="";
                }
                
            }
            else
            {
                if(ans.size()==0)
                {
                    ans=st.top();
                    st.pop();
                }
                else
                {
                    ans= ans+' '+st.top();
                    st.pop();
                }
            
            }

        }
        if(temp.size()!=0) return temp;
        else return ans;
    }
};


 ### Complexity
- Time Complexity: O(N)
- Space Complexity: O(N)

### Approach

- In this approach we have modified the string given as input and have used two pointers.

- We will initially keep a flag as 0 & keep i=0 and j=0.

- we will run a while loop in that we'll check if s[i] is empty space then move i pointer until i reaches to s[i] which is not empty.

- If flag exists means flag=1 then create an empty space after that word , increase j pointer & again make flag as 0 so that we don't create space after every letter.

- Now if s[i] is not empty then store s[i] in s[j] so our initial string is getting modified and increment both pointers.

- Now reverse the word with the help of start and j pointer.

- Once we are out of while loop resize string s according to j pointer & if at the end of s there is any space then remove it.

- Atlast reverse the whole string and return s .

### Code

class Solution {
public:
    string reverseWords(string s) {
        int i=0,j=0,n=s.size();
        bool flag=0;
        while(i<n)
        {
            while(i<n && s[i]==' ') i++;
            if(flag)
            {
                s[j]=' ';
                j++;
                flag=0;
            }
            int start=j;
            while(i<n && s[i]!=' ')
            {
                s[j]=s[i];
                i++;j++;
                flag=1;
            }
            reverse(s.begin()+start,s.begin()+j);
        }
        
        s.resize(j);
        if(s.back() == ' ') s.pop_back();
        reverse(s.begin(),s.end());
        return s;
    }
};


 ### Complexity
 - Time Complexity:O(N)
- Space Complexity:O(1)