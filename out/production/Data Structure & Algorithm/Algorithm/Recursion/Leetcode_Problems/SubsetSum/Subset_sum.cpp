class Solution
{
public:
    void sum(vector<int> &arr, int N, int i, vector<int> &ans, int addition)
    {
        if (i == N)
        {
            ans.push_back(addition);
            return;
        }
        addition += arr[i];
        sum(arr, N, i + 1, ans, addition);
        addition -= arr[i];
        sum(arr, N, i + 1, ans, addition);
    }
    vector<int> subsetSums(vector<int> arr, int N)
    {
        vector<int> ans;
        sum(arr, N, 0, ans, 0);
        return ans;
    }
};