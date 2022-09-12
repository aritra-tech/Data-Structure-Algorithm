package Companywise_Questions.Adobe.Remove_All_Adjacent_Duplicates_In_String;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }

    private static String removeDuplicates(String s) {
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
    }
}
