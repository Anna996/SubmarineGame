package Submarine.Submarine;

import java.util.Random;

public class Submarine {
	private int size;

	private char[][] pattern;

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

	}
	
	public char[][] getPattern() {
		return pattern;
	}
}
