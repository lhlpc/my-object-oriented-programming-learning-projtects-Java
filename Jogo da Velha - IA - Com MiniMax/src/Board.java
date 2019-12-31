import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//class Point {
//
//	int x, y;
//
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	@Override
//	public String toString() {
//		return "[" + x + ", " + y + "]";
//	}
//}
//
//class PointAndScore {
//
//	int score;
//	Point point;
//
//	PointAndScore(int score, Point point) {
//		this.score = score;
//		this.point = point;
//	}
//}

class Board {
 
   
    Scanner scan = new Scanner(System.in);
    int[][] board;

    public Board() {
    	
    	board = new int[3][3];
    	int i,j;
    	
    	//Inicialização do Tabuleiro (Board)
    	for(i = 0; i < board[0].length; i++) {
    		for(j = 0; j < board[0].length; j++) {
    			board[i][j] = -1;
    			//System.out.println("i = " + i + " -- j = " + j);
    		}
    	}
    }
    
    public boolean xHasWon(){
    	int i;
    	//Verifica se X formou diagonal
    	if(board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1){
    		return true;
    	} else {
    		//Verifica se X formou alguma reta em alguma coluna ou linha
    		for(i = 0; i < board[0].length; i++) {
    			if((board[i][0] == 1 && board[i][1] == 1 && board[i][3] == 1) || (board[0][i] == 1 && board[1][i] == 1 && board[2][i] == 1)){
    				return true;		
    			}
    		}
    		
    	}
    	
    	return false;
    	
    }
    
    public boolean oHasWon(){
    	int i;
    	//Verifica se O formou diagonal
    	if(board[0][0] == 0 && board[1][1] == 0 && board[2][2] == 0){
    		return true;
    	} else {
    		//Verifica se X formou alguma reta em alguma coluna ou linha
    		for(i = 0; i < board[0].length; i++) {
    			if((board[i][0] == 0 && board[i][1] == 0 && board[i][3] == 0) || (board[0][i] == 0 && board[1][i] == 0 && board[2][i] == 0)){
    				return true;		
    			}
    		}
    	}
    	
    	return false;
    	
    }
    
    public void printBoard() {
        System.out.println();

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


   
}