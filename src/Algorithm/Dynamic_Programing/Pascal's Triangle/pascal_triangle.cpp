class Solution
{
public:
    vector<vector<int>> ans;
    vector<vector<int>> generate(int numRows) // initializing numRows
    {
        for(int i = 0; i<numRows; ++i)
        {
            vector<int> row(i+1, 1);
            for(int j = 1; j<i; ++j)
                // 1st and last elements will be 1,
                // rest will be sum of two elements from above row
                row[j] = ans[i-1][j] + ans[i-1][j-1];
            ans.push_back(row);
        }
        return ans;
    }

};
