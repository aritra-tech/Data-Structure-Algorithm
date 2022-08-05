### **Problem Link:**

- #### [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

### **Java Solution:**
```
private static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
```
### **C++ Solution:**
```
string longestCommonPrefix(vector<string>& strs) {

        //sort the array of string as the first element and the last element

        int len=strs.size();
        sort(strs.begin(),strs.end());
        string a=strs[0];
        string b=strs[len-1];
        string result="";

        //now all we gotta do is compare

        for(int i=0;i<a.size();i++){
            if(a[i]!=b[i])
                break;
            else
                result=result+a[i];
        }
        return result;
    }
```