package myClass;

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
	
	
}
