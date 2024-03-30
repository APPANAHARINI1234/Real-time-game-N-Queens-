package board;
import java.util.Arrays;
public class Board {
   public int n;
   public char[][]board;
    public Board(int n){
        this.n=n;
       board=new char[n][n];
       for(int i=0;i<n;i++){
        Arrays.fill(board[i],'X');
       }
    }
    public void setQueen(int row,int col){
        board[row][col]='Q';
        System.out.println(n);
       
    }
    public void resetQueen(int row,int col){
        board[row][col]='X';
        
    }
    public void getBoardConfig(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
