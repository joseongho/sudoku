<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="myDto.SudokuData"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello
	<table>
		<%
			SudokuData[] myData;
			int k = 0;
			for (int i = 0; i < 9; i++) {
				out.print("<tr>");
				for (int j = 0; j < 9; j++) {
					myData = (SudokuData[]) request.getAttribute("s0");
					out.print("<td>" + myData[k].getAnswer() + "</td>");
					k++;
				}
				out.print("</tr>");
			};
		%>
	</table>
</body>
</html>