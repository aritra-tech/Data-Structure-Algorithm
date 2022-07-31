class Solution
{
public:
    int queens(int col, int n, vector<int> &leftrow, vector<int> &upperdiagonal, vector<int> &lowerdiagonal)
    {
        if (col == n)
            return 1;
        int count = 0;
        for (int row = 0; row < n; row++)
        {
            /* checking for the three directions if it already has queen 
                leftrow,
                upperdiagonal,
                lowerdiagonal
            */
            if (leftrow[row] == 0 && upperdiagonal[n - 1 + col - row] == 0 && lowerdiagonal[row + col] == 0)
            {
                // marking them as it contains queen here
                leftrow[row] = upperdiagonal[n - 1 + col - row] = lowerdiagonal[row + col] = 1;
                // adding the count of valid board
                count += queens(col + 1, n, leftrow, upperdiagonal, lowerdiagonal);
                // backtracking here and marking them as 0 , we removed queen from here
                leftrow[row] = upperdiagonal[n - 1 + col - row] = lowerdiagonal[row + col] = 0;
            }
        }
        return count;
    }
    int totalNQueens(int n)
    {
        vector<int> leftrow(n, 0), upperdiagonal(2 * n - 1, 0), lowerdiagonal(2 * n - 1, 0);
        return queens(0, n, leftrow, upperdiagonal, lowerdiagonal);
    }
};