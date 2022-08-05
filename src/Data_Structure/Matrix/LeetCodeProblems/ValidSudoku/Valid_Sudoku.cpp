#include <bits/stdc++.h>
#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {

        bool hashtable[9][9];

        memset(hashtable, 0, sizeof(hashtable));
        for(int i = 0 ; i < 9 ; i ++)
            for(int j = 0 ; j < 9 ; j ++)
                if(board[i][j] != '.'){
                    int num = board[i][j] - '0' - 1;
                    if(hashtable[i][num] == 1)
                        return false;
                    hashtable[i][num] = 1;
                }

        memset(hashtable, 0, sizeof(hashtable));
        for(int i = 0 ; i < 9 ; i ++)
            for(int j = 0 ; j < 9 ; j ++)
                if(board[j][i] != '.'){
                    int num = board[j][i] - '0' - 1;
                    if( hashtable[i][num] == 1 )
                        return false;
                    hashtable[i][num] = 1;
                }

        memset(hashtable, 0, sizeof(hashtable));
        for(int i = 0 ; i < 9 ; i ++){
            int br = i/3;
            int bc = i%3;
            for(int ii = 0 ; ii < 3 ; ii ++)
                for(int jj = 0 ; jj < 3 ; jj ++){
                    int r = br*3 + ii;
                    int c = bc*3 + jj;
                    if(board[r][c] != '.'){
                        int num = board[r][c] - '0' - 1;
                        if (hashtable[i][num] == 1)
                            return false;
                        hashtable[i][num] = 1;
                    }
                }
        }
        return true;
    }
};


int main() {

    vector<string> input = {
        "53..7....",
        "6..195...",
        ".98....6.",
        "8...6...3",
        "4..8.3..1",
        "7...2...6",
        ".6....28.",
        "...419..5",
        "....8..79"
    };

    vector<vector<char>> board;
    for(const string& row: input){
        vector<char> r;
        for(char c: row)
            r.push_back(c);
        board.push_back(r);
    }

    cout << Solution().isValidSudoku(board) << endl;

    return 0;
}

// Time Complexity: O(9*9)
// Space Complexity: O(1)

