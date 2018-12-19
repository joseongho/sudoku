package myDto;

import java.util.Set;

public class SudokuData {
	private int answer;
	private Set<Integer> guessNumber;

	public SudokuData(int answer) {
		super();
		this.answer = answer;
	}

	public SudokuData(Set<Integer> guessNumber) {
		super();
		this.guessNumber = guessNumber;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public Set<Integer> getGuessNumber() {
		return guessNumber;
	}

	public void setGuessNumber(Set<Integer> guessNumber) {
		this.guessNumber = guessNumber;
	}

}
