


## Problem Statement - 

Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

### Link :- [Reapeated String Match](https://leetcode.com/problems/repeated-string-match/)

### Approach


1.first we will check if the length of 'b'(substring) is greater then 'a' then we will increase the 
length of a untill a>b


now length of  a > b
then we will perform only two checks

str.indexOf(b)-> return -1 if string b is not present in str othreswise return the index of b;

1.if b is not present then we will just add 'a' means repeat 'a' value once more 
2.again check the indexvalue if it is -1 that means it's not possible for 'b' to be the sub string of 'a'
if it return any value otherthan -1 that means 'b' is present in 'a' so just return the no of repeat


### Code

     public int repeatedStringMatch(String a, String b) {
  
        int repeat =0;
        StringBuilder str = new StringBuilder();
        
        //this loop will run untill the length of a > b
        while(str.length()<b.length()){
            str.append(a);
            repeat++;
        }
        
        if(str.indexOf(b)==-1){
            str.append(a);
            repeat++;
        }
        
        if(str.indexOf(b)==-1){
            return -1;
        }
        
        return repeat;
    }
    }
