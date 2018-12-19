<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>sudoku 모르는 숫자는 -1</p>
	<form action="SudokuServlet" method="post">
		<table>
			<%
				int k = 0;
				for (int i = 0; i < 9; i++) {
			%>
			<tr>
				<%
					for (int j = 0; j < 9; j++) {
				%>
				<td><input type="number" max="9" min="-1" value="-1"
					name="<%=k++%>"></td>
				<%
					}
				%>
			</tr>
			<%
				}
			%>
		</table>
		<input type="submit">
	</form>
</body>
</html>