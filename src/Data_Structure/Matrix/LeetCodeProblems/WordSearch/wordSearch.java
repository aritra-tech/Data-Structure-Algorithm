package Data_Structure.Matrix.LeetCodeProblems.WordSearch;

public class wordSearch {   
    public void main(String[] args) {
    char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    String word = "SEE";
    System.out.println(exist(board,word));
}
/* Creating a global boolean array in other functions
 * this array is used to if the location is checked
 * or not visited[][] = true when location is checked */
boolean visited[][];
public  boolean  exist(char[][] board, String word) {
    /*To get the row and column number of the matrix */     
       int r = board.length;
       int c = board[0].length;
       /*Declaring the boolean array is size*/
       visited = new boolean[r][c];
       for(int i = 0; i < r; i++) {
           for(int j = 0; j < c; j++) {
            /*Iterating over char board an checking if the word's char is 
             * equal to board[i][j] && checking another function if the word are
             * reapeating or not in the board*/
               if(word.charAt(0) == board[i][j] && searchWord(i, j, 0, board, word)) {
                   return true;
                   /* If condition is satisfied return true */
               }
           }
       }
       /*Else return false*/
       return false;
   }
   
   public boolean searchWord(int i, int j, int index, char[][] board, String word) {
       if(index == word.length()){
        return true;
        /*Exting the recursion condition when the word 
         * length is equal while interating over the board*/
       }
       /*Corner conditions if the row & col in the border 
        * & see if the visited the index or not so we don't go
        to the index again*/
       if(i < 0 ||
        i >= board.length ||
        j < 0 ||
        j >= board[i].length ||
        word.charAt(index) != board[i][j] ||
        visited[i][j]) {
           return false;
       }
       
       visited[i][j] = true;
       /*Checking the charchter inside the board
        * like the box surrounding the char in the board*/
       if(searchWord(i + 1, j, index + 1, board, word) || 
          searchWord(i - 1, j, index + 1, board, word) || 
          searchWord(i, j + 1, index + 1, board, word) || 
          searchWord(i, j - 1, index + 1, board, word)) {
           return true;
       }
       
       visited[i][j] = false;
       return false;
   }
}

/* OUTPUT 
 * TRUE
 */

