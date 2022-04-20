package Submarine.Runner;

import Submarine.board.Board;

public class Runner {

	public static void main(String[] args) {
		
		Board b=new Board();
//		b.printBoard(b.getSubBoard());
		b.printBoard(b.getUserBoard());
	}
}
