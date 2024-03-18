public class CheckIfMoveisLegal {

/*
Problem Link : https://leetcode.com/problems/check-if-move-is-legal/

class Solution {
    public boolean checkMove(char[][] board, int rMove, int cMove, char color) {
        int [][]directions = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        board[rMove][cMove] = color;
        boolean legalMove = false;
        for(int[]d:directions){
            if(isLegal(board,rMove,cMove,color,d)){
                legalMove = true;
                break;
            }
        }
        return legalMove;    
    }
    private boolean isLegal(char[][]board,int row, int col, char color, int[] direction){
        int dr = direction[0];
        int dc = direction[1];
        row+=dr;
        col+=dc;
        int length = 1;
        while(0 <= row && row < board.length && 0 <= col && col < board[0].length){
            length++;
            if(board[row][col] == '.'){
                return false;
            }
            if(board[row][col] == color){
                return length>=3;
            }
            row+=dr;
            col+=dc;
        }
    return false;
    }
} 
*/
    
}
