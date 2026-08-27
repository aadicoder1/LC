import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) Arrays.fill(board[i],'.');
        solve(0,n,board,ans);
        return ans;
    }

    void solve(int row,int n,char[][] board,List<List<String>> ans){
        // All queens placed
        if(row==n){
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++) list.add(new String(board[i]));
            ans.add(list);
            return;
        }

        // Try every column in current row
        for(int col=0;col<n;col++){
            if(isSafe(row,col,n,board)){
                board[row][col]='Q';
                solve(row+1,n,board,ans);
                // Backtrack
                board[row][col]='.';
            }
        }
    }

    boolean isSafe(int row,int col,int n,char[][] board){
        // Check column
        for(int i=0;i<row;i++) if (board[i][col]=='Q') return false;
        // Check upper-left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--) if (board[i][j]=='Q') return false;
        // Check upper-right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<n; i--,j++) if (board[i][j]=='Q') return false;
        
        return true;
    }
}