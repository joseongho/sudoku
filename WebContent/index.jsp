<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>sudoku 모르는 숫자는 0</p>
	<form action="SudokuServlet" method="post">
		<table>
			<%
				int k = 0;
				for (int i = 0; i < 9; i++) {
					out.print("<tr>");
					for (int j = 0; j < 9; j++) {
						out.print("<td><input type='number' max='9' min='0' value='0'name='" + k++ + "'></td>");
					}
					out.print("</tr>");
				}
			%>
		</table>
		<input type="submit">
	</form>
</body>
</html>