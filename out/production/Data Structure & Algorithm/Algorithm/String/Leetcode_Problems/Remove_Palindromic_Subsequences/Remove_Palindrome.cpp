#include <iostream>

using namespace std;

class Solution {
public:
    int removePalindromeSub(string str) {
	if(str.empty())
		return 0; //empty string, that means 0 step

	//check for palindrome
	int starting = 0, ending = str.length() - 1;

	while(starting < ending) {
		if(str[starting++] != str[ending--])
			return 2; //not a palindrome, remove all "a", then remove all "b", i.e 2 steps
	}

	return 1;// it is a palindrome
}};
