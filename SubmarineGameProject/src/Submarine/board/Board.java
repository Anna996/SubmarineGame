package Submarine.board;

import java.util.Arrays;

import Submarine.Submarine.Submarine;

public class Board {
	//fields
	private char[][] userBoard;
	private char[][] subBoard;
	private Submarine[] submarines;


	//Constructor
	public Board() {
		initSubBoard();
		initUserBoard();
		initSubmarines();
	}



	//getters and setters
	public char[][] getUserBoard() {
		return userBoard;
	}


	public void setUserBoard(char[][] userBoard) {
		this.userBoard = userBoard;
	}


	public char[][] getSubBoard() {
		return subBoard;
	}


	public void setSubBoard(char[][] subBoard) {
		this.subBoard = subBoard;
	}


	public Submarine[] getSubmarines() {
		return submarines;
	}


	public void setSubmarines(Submarine[] submarines) {
		this.submarines = submarines;
	}

	//methods
	public void initSubBoard() {
		subBoard=new char[10][20];
		for (int i = 0; i < subBoard.length; i++) {
			for (int j = 0; j < subBoard[i].length; j++) {
				subBoard[i][j] =' ';
			}
		}
	}


	public void initUserBoard() {
		userBoard=new char[12][22];
		for (int i = 0; i < userBoard.length; i++) {
			for (int j = 0; j < userBoard[i].length; j++) {
				if( i==0 || i==userBoard.length-1 || j==0 || j==userBoard[i].length-1)
					userBoard[i][j] ='*';
				else
					userBoard[i][j] =' ';
			}
		}
	}


	public void initSubmarines() {
		submarines=new Submarine[5];
		for (int i = 0; i < submarines.length; i++) {
			submarines[i]=new Submarine();
		}
	}


	public void printBoard(char [][]b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
				System.out.print(' ');
			}
			System.out.println("");
		}
	}











}
