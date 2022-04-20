package Submarine.Submarine;

import java.util.Random;

public class Submarine {
	private int size;

	private char[][] pattern;
	public static final char CHAR = '*' ;

	public void createRandom(int maxSize) {
		Random random = new Random();
		int size = random.nextInt(maxSize) + 1;
		setSize(size);
		initPattern();
		createPattern();
	}

	private void setSize(int size) {
		this.size = size;
	}

	private void initPattern() {
		pattern = new char[size][size];
	}

	// TODO Logic
	private void createPattern() {
		if (size == 1) {
			pattern[0][0] = CHAR;
			return;
		}
		
		int[] randomElement = getRandomElement(size);
		pattern[randomElement[0]][randomElement[1]] = CHAR;
		int[][] neighbors = getNeighbors(randomElement);
		
	}
	
	// TODO
	private int[] getRandomElement(int size) {
		return null;
	}
	
	// TODO
	private int[][] getNeighbors(int[] source){
		return null;
	}

	public char[][] getPattern() {
		return pattern;
	}
}
