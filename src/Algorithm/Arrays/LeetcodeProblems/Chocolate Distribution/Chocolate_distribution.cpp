class Solution
{
public:
    long long findMinDiff(vector<long long> a, long long n, long long m)
    {
        long long mini = INT_MAX;
        long long i = 0, j;
        // sort the array so that we can select mimimum diff elements
        sort(a.begin(), a.end());
        // we took two pointers i and j , and they should be at a difference of m
        j = i + m - 1;
        while (j < n)
        {
            // just find the diff of both elements as max element and min element
            long long diff = a[j] - a[i];
            // check if it is mimimum than the previous diff and store in mini
            mini = min(mini, diff);
            // increment the pointers
            i++;
            j++;
        }
        return mini;
    }
};