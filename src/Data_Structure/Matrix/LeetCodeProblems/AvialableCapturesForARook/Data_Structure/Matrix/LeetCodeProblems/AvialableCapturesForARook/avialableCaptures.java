package Data_Structure.Matrix.LeetCodeProblems.AvialableCapturesForARook;

public class avialableCaptures {
    public void main(String[] args) {
      char[][] board = 
      {{'.','.','.','.','.','.','.','.'}
      ,{'.','.','.','p','.','.','.','.'}
      ,{'.','.','.','R','.','.','.','p'}
      ,{'.','.','.','.','.','.','.','.'}
      ,{'.','.','.','.','.','.','.','.'}
      ,{'.','.','.','p','.','.','.','.'}
       ,{'.','.','.','.','.','.','.','.'}
      ,{'.','.','.','.','.','.','.','.'}};
    int output = numRookCaptures(board);
    System.out.println(output);
    }

public int numRookCaptures(char[][] board) {
    int count = 0, x = 0, y = 0;
    for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[i].length; j++) {
            if (board[i][j] == 'R') {
                /*Firstly we are storing the 
                 * location of the ROOK in x and y
                */
                x = i;
                y = j;
            }
        }
    }
    /*HERE WE ARE LOOKING FOR BISHOP
     * OR ANY PIECE IF PRESENT 
     * FOR ROOK THAT IT CAN TAKE ON!!   
     */
    for (int i = x; i < board.length; i++) {
        if (board[i][y] == 'B')
            break;
        if (board[i][y] == 'p') {
            count++;
            break;
        }
    }
    for (int i = x; i >= 0; i--) {
        if (board[i][y] == 'B')
            break;
        if (board[i][y] == 'p') {
            count++;
            break;
         }
    }
    for (int j = y; j < board[0].length; j++) {
        if (board[x][j] == 'B')
            break;
        if (board[x][j] == 'p') {
            count++;
            break;
        }
    }
    for (int j = y; j >= 0; j--) {
        if (board[x][j] == 'B')
            break;
        if (board[x][j] == 'p') {
            count++;
            break;
        }
    }
       return count;
    }
}