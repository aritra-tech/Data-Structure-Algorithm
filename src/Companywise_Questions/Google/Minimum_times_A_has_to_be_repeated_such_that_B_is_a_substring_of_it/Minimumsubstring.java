package Companywise_Questions.Google.Minimum_times_A_has_to_be_repeated_such_that_B_is_a_substring_of_it;

public class Minimumsubstring {
    public static void main(String[] args){
        String A = "abcd";
        String B = "cdabcdab";
        System.out.println(Min_repetation(A,B));
    }

    private static int Min_repetation(String A, String B) {
        int ans = 1;

        // To store repeated string
        String S = A;

        // Until size of S is less than B
        while(S.length() < B.length())
        {
            S += A;
            ans++;
        }

        // ans times repetition makes required answer
        if (issubstring(B, S)) return ans;

        // Add one more string of A
        if (issubstring(B, S + A))
            return ans + 1;

        // If no such solution exists
        return -1;
    }
    static boolean issubstring(String str2, String rep1)
    {
        int M = str2.length();
        int N = rep1.length();

        // Check for substring from starting
        // from i'th index of main string
        for (int i = 0; i <= N - M; i++)
        {
            int j;

            // For current index i,
            // check for pattern match
            for (j = 0; j < M; j++)
                if (rep1.charAt(i + j) != str2.charAt(j))
                    break;

            if (j == M) // pattern matched
                return true;
        }

        return false; // not a substring
    }
}
