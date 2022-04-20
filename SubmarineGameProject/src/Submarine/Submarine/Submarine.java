package Submarine.Submarine;

import java.util.Random;

public class Submarine {
	private int size;

	private char[][] pattern;
	public static final char CHAR = '*' ;
	
	public Submarine() {
		this.createRandom(4);
	}

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

	private void createPattern() {
		if (size == 1) {
			pattern[0][0] = CHAR;
			return;
		}
		
		int[] randomElement = getRandomElement(size);
		int count = 0, idx;
		Random random = new Random();
		
		do {
			pattern[randomElement[0]][randomElement[1]] = CHAR;
			int[][] neighbors = getNeighbors(randomElement);
			idx = random.nextInt(neighbors.length);
			randomElement = neighbors[idx];
			count++;
		}
		while(count < size);
	}
	
	private int[] getRandomElement(int size) {
		Random random = new Random();
		int i = random.nextInt(size);
		int j = random.nextInt(size);
		
		return new int[] {i,j};
	}
	
	// TODO
	private int[][] getNeighbors(int[] source){
		return null;
	}

	public char[][] getPattern() {
		return pattern;
	}
}
