/*
51. N-Queens
Link of the problem statement :- https://leetcode.com/problems/n-queens/

INTUITION:-

CONDITIONS :- 
- ONLY one queen in the current row
- ONLY one queen in the current column
- ONLY one queen in the current diagonal

1. If current Row becomes equal to n, then it means we have got one valid combination ,so push it into the answer vector.
2. traverse through all the cells of the current row to find the valid cell.
3. A cell is valid ONLY if it doesn't has any queen in that row and in that column and in its upper lft & upper right diagonal.
4. If the current cell is valid then update the current cell's value to 'Q' and move to the next row.
5. After that recursive call undo the changes because we want to find all the possible solutions of the n-queen problem.

* Time Complexity = O(exponential)
* Space Complexity = O(exponential)

*/


class Solution {
public:
    
    //checking if a queen already exists in the same DIAGONAL or not
    bool isDiagonalValid(int currRow,int currCol,vector<string>&board,int n)
    {
        //we'll check only for upper left and upper right diagonal
        //because I haven't yet filled it lower left and lower right diagonals
        //so I don't need to bother about them
        
        //checking for upper left diagonal
        int row = currRow;
        int col = currCol;
        while(row>=0 && col>=0)
        {
            if(board[row][col] == 'Q')
               return false;
               
            row--;
            col--;
        }
        //checking for upper right diagonal
        row = currRow;
        col = currCol;
        while(row>=0 && col<n)
        {
            if(board[row][col] == 'Q')
                return false;
            
            row--;
            col++;
        }
        
        //if we haven't found any queen in the upper left diagonal and in the upper right diagonal
        //then return true 
        //because its a valid cell and we can place a queen there
        return true;
    }
    
    //checking if a queen already exists in the current COLUMN or not
    bool isColValid(int currCol,vector<string>&board,int n)
    {
        for(int currRow = 0 ;currRow<n ; currRow++)
        {
            if(board[currRow][currCol] == 'Q')
                return false;
        }
        return true;
    }
    
    //checking if a queen already exists in the current ROW or not
    bool isRowValid(int currRow,vector<string>&board,int n)
    {
        for(int currCol = 0 ;currCol<n ; currCol++)
        {
            if(board[currRow][currCol] == 'Q')
                return false;
        }
        return true;
    }
    
    //function to check if the current cell is valid or not
    //i.e. if we can place a queen in it or not
    bool isValid(int currRow,int currCol,vector<string>&board,int n)
    {
        if(isRowValid(currRow,board,n) && isColValid(currCol,board,n) && 
           isDiagonalValid(currRow,currCol,board,n))
            return true;
        
        return false;
    }
    
    //function to find all possible combinations
    void findCombinations(int currRow,vector<string>&board,vector<vector<string>>&ans,int n)
    {
        //we have found one valid solution of n-queens
        //so push it into the answer vector
        if(currRow == n)
        {
            ans.push_back(board);
            return ;
        }
        
        //iterating over all the columns of the current row
        //to check if we can place a queen or not
        for(int currCol = 0; currCol<n; currCol++)
        {
            //checking if the current cells is valid or not
            if(isValid(currRow,currCol,board,n))
            {
                //if the current cell is valid then update its value to Q
                //and move on to the next row
                board[currRow][currCol] = 'Q';
                findCombinations(currRow+1,board,ans,n);
                //undo the change done
                //because we want to find all the possible combinations
                board[currRow][currCol] = '.';
            }
        }
    }
    
    //control starts from here
    vector<vector<string>> solveNQueens(int n) 
    {
        vector<vector<string>>ans;//to store all the possible answers
        vector<string>board(n);
        string s(n,'.');

        for(auto &i: board)
            i=s;
        
        findCombinations(0,board,ans,n);
        
        return ans;
    }
};