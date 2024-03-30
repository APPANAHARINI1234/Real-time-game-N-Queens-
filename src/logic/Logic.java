package logic;
import board.Board;

public class Logic {
   Board board;
   
   public Logic(Board board){
    this.board=board;
   
   }
   public boolean isSafe(int row,int col){
    int count=0;
    for(int i=0;i<board.n;i++){
        if(board.board[i][col]=='Q')
          count++;
    }
    if(count>1)
    return false;
    count=0;
    for(int i=0;i<board.n;i++){
        if(board.board[row][i]=='Q')
        count++;
    }
    if(count>1)
    return false;
    int i=row;
    int j=col;
    count=0;
    while(i>=0&&j>=0){
        if(board.board[i][j]=='Q')
          count++;
          i--;
          j--;
    }
    
    if(count>1)
    return false;
    count=0;
    i=row;
    j=col;
    while(i<board.n&&j<board.n){
        if(board.board[i][j]=='Q')
          count++;
          i++;
          j++;
    }
    if(count>1)
    return false;
    count=0;
    i=row;
    j=col;
    while(i>=0&&j<board.n){
        if(board.board[i][j]=='Q')
          count++;
          i--;
          j++;
    }
    if(count>1)
    return false;
    i=row;
    j=col;
    count=0;
    while(i<board.n&&j>=0){
        if(board.board[i][j]=='Q')
          count++;
          i++;
          j--;
    }
    if(count>1)
    return false;
    return true;

   }
   public boolean isWinner(){
    int count=0;
    for(int i=0;i<board.n;i++){
        for(int j=0;j<board.n;j++){
            if(board.board[i][j]=='Q'){
                count++;
              if(!isSafe(i,j))
              return false;
            }
        }
    }
    if(count!=board.n){
        return false;
    }
    return true;

   }
}
