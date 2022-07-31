class Solution
{
public:
    /* for checking the 3 conditions
        Each of the digits 1-9 must occur exactly once in each row.
        Each of the digits 1-9 must occur exactly once in each column.
        Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
    */
    bool isvalid(vector<vector<char>> &board, int row, int col, char c)
    {
        for (int i = 0; i < 9; i++)
        {
            if (board[row][i] == c)
            {
                return false;
            }

            if (board[i][col] == c)
                return false;

            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return false;
        }
        return true;
    }

    // helper function for filling the empty cells
    bool helper(vector<vector<char>> &board)
    {
        for (int i = 0; i < board.size(); i++)
        {
            for (int j = 0; j < board[0].size(); j++)
            {
                //if cell is empty then we will try to fill the value
                if (board[i][j] == '.')
                {
                    for (char c = '1'; c <= '9'; c++)
                    {

                        if (isvalid(board, i, j, c))
                        {
                            board[i][j] = c;

                            if (helper(board) == true)
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    void solveSudoku(vector<vector<char>> &board)
    {
        helper(board);
    }
};