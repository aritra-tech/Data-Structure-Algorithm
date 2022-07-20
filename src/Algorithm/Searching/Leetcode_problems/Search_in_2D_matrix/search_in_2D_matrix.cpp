class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        bool f=0;
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix[0].size();j++)
            {
                if(matrix[i][j]==target)
                {
                    f=1;break;
                }
            }
        }
        return f;
    }
};