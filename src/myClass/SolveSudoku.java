package myClass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import myDto.SudokuData;

public class SolveSudoku {
	SudokuData[] sudokuArray;
	SudokuData sudokuData;
	Integer myInt;

	public SolveSudoku() {
		// TODO Auto-generated constructor stub
	}

	public SudokuData[] writeData(HttpServletRequest request) {
		sudokuArray = new SudokuData[81];
		Map<String, String[]> myMap = request.getParameterMap();
		Iterator<String[]> myIter = myMap.values().iterator();

		for (int i = 0; i < 81; i++) {
			myInt = new Integer(myIter.next()[0]);
			sudokuArray[i] = new SudokuData(myInt.intValue());
		}
		return sudokuArray;
	}

	public SudokuData[] solveData(SudokuData[] sudokuArray2) {
		// TODO Auto-generated method stub
		sudokuArray = new SudokuData[81];
		sudokuArray = sudokuArray2;
		int temp = 1;

		while (temp != 0) {
			temp = 0;
			for (int i = 0, x, y; i < 9; i++) {
				for (int j = 0; j < 81; j++) {
					if (sudokuArray[j].getAnswer() == i + 1) {
						x = j / 9;
						for (int k = 0; k < 9; k++) {
							if (sudokuArray[x * 9 + k].getAnswer() == 0) {
								sudokuArray[x * 9 + k].setBanNumber(i + 1);
							}
							if (sudokuArray[j % 9 + k * 9].getAnswer() == 0) {
								sudokuArray[j % 9 + k * 9].setBanNumber(i + 1);
							}
						}
					}
				}

				for (int j = 0; j < 9; j++) {
					x = 0;
					y = 0;
					for (int k = 0; k < 9; k++) {
						if (sudokuArray[j * 9 + k].getAnswer() == 0 && sudokuArray[j * 9 + k].getBanNumber() != i + 1) {
							x++;
							y = j * 9 + k;
						} else if (sudokuArray[j * 9 + k].getAnswer() == i + 1) {
							x = 2;
						}
					}
					if (x == 1) {
						sudokuArray[y].setAnswer(i + 1);
						temp++;
					}
				}
				for (int j = 0; j < 9; j++) {
					x = 0;
					y = 0;
					for (int k = 0; k < 9; k++) {
						if (sudokuArray[j + k * 9].getAnswer() == 0 && sudokuArray[j + k * 9].getBanNumber() != i + 1) {
							x++;
							y = j + k * 9;
						} else if (sudokuArray[j + k * 9].getAnswer() == i + 1) {
							x = 2;
						}
					}
					if (x == 1) {
						sudokuArray[y].setAnswer(i + 1);
						temp++;
					}
				}

				for (int j = 0; j < 9; j++) {
					x = 0;
					y = 0;
					for (int k = 0; k < 9; k++) {
						if (sudokuArray[j / 3 * 27 + j % 3 * 3 + k / 3 * 9 + k % 3].getAnswer() == 0
								&& sudokuArray[j / 3 * 27 + j % 3 * 3 + k / 3 * 9 + k % 3].getBanNumber() != i + 1) {
							x++;
							y = j / 3 * 27 + j % 3 * 3 + k / 3 * 9 + k % 3;

						} else if (sudokuArray[j / 3 * 27 + j % 3 * 3 + k / 3 * 9 + k % 3].getAnswer() == i + 1) {
							x = 2;
						}
					}
					if (x == 1) {
						sudokuArray[y].setAnswer(i + 1);
						temp++;
					}
				}
			}
		}
		return sudokuArray2;
	}

}
