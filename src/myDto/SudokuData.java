package myDto;

public class SudokuData {
	private int answer;
	private int banNumber;

	public SudokuData(int answer) {
		super();
		this.answer = answer;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public int getBanNumber() {
		return banNumber;
	}

	public void setBanNumber(int i) {
		this.banNumber = i;
	}

}
