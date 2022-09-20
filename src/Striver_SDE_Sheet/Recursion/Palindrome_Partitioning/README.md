## Problem Statement
[Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/)

## Approach
The initial idea will be to make partitions to generate substring and check if the substring generated out of the partition will be a palindrome. Partitioning means we would end up generating every substring and checking for palindrome at every step. Since this is a repetitive task being done again and again, at this point we should think of recursion. The recursion continues until the entire string is exhausted. After partitioning, every palindromic substring is inserted in a data structure When the base case has reached the list of palindromes generated during that recursion call is inserted in a vector of vectors/list of list.

## Complexity

Time Complexity: O((2^n)*k*(n/2))
Space Complexity: O(k*x)