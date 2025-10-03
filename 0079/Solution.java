class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0 ; i<board.length ; i++){
            for(int j=0 ; j<board[0].length ; j++){
                if(board[i][j]==word.charAt(0)){
                    if(check(board,i,j,word,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board, int row, int col, String word, int len){
        if(len==word.length()) return true;
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(len)) 
            return false;

        int[] r = {1,-1,0,0};
        int[] c = {0,0,-1,1};
        board[row][col]='.';
        for(int i=0 ; i<4 ; i++){
            if(check(board,row+r[i],col+c[i],word,len+1)){
                return true;
            }
        }
        board[row][col] = word.charAt(len);
        return false;
    }
}