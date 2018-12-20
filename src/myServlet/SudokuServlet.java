package myServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myClass.SolveSudoku;
import myDto.SudokuData;

/**
 * Servlet implementation class ReceiveData
 */
@WebServlet("/SudokuServlet")
public class SudokuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SolveSudoku mySolveSudoku;
	SudokuData[] sudokuArray;
	RequestDispatcher rd;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SudokuServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		rd = request.getRequestDispatcher("/resultValue.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		mySolveSudoku = new SolveSudoku();

		sudokuArray = mySolveSudoku.writeData(request);
		
		sudokuArray=mySolveSudoku.solveData(sudokuArray);
		
		request.setAttribute("s0", sudokuArray);
		doGet(request, response);
	}

}
