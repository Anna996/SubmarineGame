package Submarine.board;

public class Board {
	//fields
	private char[][] userBoard;
	private char[][] subBoard;
	
	
	public Board() {
		subBoard=new char[10][20];
		for (int i = 0; i < subBoard.length; i++) {
			for (int j = 0; j < subBoard.length; j++) {
				subBoard[i][j] =' ';
			}
		}
		
		userBoard=new char[12][22];
		for (int i = 0; i < userBoard.length; i++) {
			for (int j = 0; j < userBoard.length; j++) {
				if( i==0 || i==userBoard.length-1 || j==0 || j==userBoard.length-1)
					userBoard[i][j] ='*';
				else
					userBoard[i][j] =' ';
			}
		}
		
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
