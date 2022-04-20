package Submarine.board;

import java.util.Arrays;

import Submarine.Submarine.Submarine;

public class Board {
	//fields
	private char[][] userBoard;
	private char[][] subBoard;
	private Submarine[] submarines;
	
	
	public Board() {
		initSubBoard(this.subBoard);
		initUserBoard(this.userBoard);
		initSubmarines( this.submarines);
		
		
	}
	

	public void initSubBoard(char[][] subBoard) {
		subBoard=new char[10][20];
		for (int i = 0; i < subBoard.length; i++) {
			for (int j = 0; j < subBoard.length; j++) {
				subBoard[i][j] =' ';
			}
		}
	}
	
	
	public void initUserBoard(char[][] userBoard) {
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
	
	
	public void initSubmarines( Submarine[] submarines) {
		submarines=new Submarine[5];
		for (int i = 0; i < submarines.length; i++) {
			submarines[i]=new Submarine();
		}
	}


	@Override
	public String toString() {
		return "Board [userBoard=" + Arrays.toString(userBoard) + ", subBoard=" + Arrays.toString(subBoard)
				+ ", submarines=" + Arrays.toString(submarines) + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
