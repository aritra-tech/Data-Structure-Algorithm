## Problem Statement - 
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

### Link :- [String to Integer](https://leetcode.com/problems/string-to-integer-atoi/)

### Approach

- Ignore all leading whitespace.
- Check if + or - symbol is used.
- Read the numbers till the next non-digit character or string end is reached.
- If the integer is out on 32-bit signed integer range [-2^31, 2^31 - 1] we return either of these limits based on integer sign.

### Code

    private static int myAtoi(String s) {
		  if(s==null) return 0;

	        s=s.trim();
	        
	        if(s.length()==0) return 0;
	        
	        int sign = +1;
	        long ans = 0;
	        if(s.charAt(0) == '-') sign = -1;
	        
	        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
			
			// initiate the starting pointer
	        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
			
	        while(i < s.length()) {
	            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
	            ans = ans * 10 + s.charAt(i)-'0';
	            // check the conditions
	            if(sign == -1 && -1*ans < MIN) return MIN;
	            if(sign == 1 && ans > MAX) return MAX;
	            
	            i++;
	        }
	        
	        return (int)(sign*ans);
		
	}
      

 ### Complexity
  - Time Complexity :- O(n)
  - Space Complexity :- O(1)