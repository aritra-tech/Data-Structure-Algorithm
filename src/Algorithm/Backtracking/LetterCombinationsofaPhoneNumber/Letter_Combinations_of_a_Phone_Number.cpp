/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.*/

#include <bits/stdc++.h>
using namespace std;

class Solution {
private:
    map<char, string> m = {
        {'2', "abc"}, {'3', "def"}, {'4', "ghi"},
        {'5', "jkl"}, {'6', "mno"}, {'7', "pqrs"},
        {'8', "tuv"}, {'9', "wxyz"}
    };

    vector<string> result;

public:
    vector<string> letterCombinations(string digits) {
        if(digits.size() != 0){
            generateCombination("", digits, 0);
        }

        return result;
    }

    void generateCombination(string current, string digits, int index) {
        if(index == digits.size()){
            result.push_back(current);
        } else {
            char currentDigit = digits[index];
            string mapping = m[currentDigit];
            for(int i = 0; i < mapping.size(); i++){
                generateCombination(current + mapping[i], digits, index+1);
            }
        }
    }
};