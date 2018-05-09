<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DB 입출력 테스트</title>
<style>
	table {
		border-collapse: collapse;
	}
	td {
		border : solid 2px #ddd;
		margin : 0;
		padding : 5px;
	}
	.label {
		background-color : #cbf5ef;
	}
</style>
</head>
<body>
	<form method = "post" action = "Test.do?to=write">
	<table>
		<tr>
			<td class = "label">
				testName<br>
				(varchar타입 | 10)
			</td>
			<td>
				<input type = "text" name = "testName">
			</td>
		</tr>
		<tr>
			<td  class = "label">
				testNum<br> 
				(int타입)
			</td>
			<td>
				<input type = "text" name = "testNum">
			</td>
		</tr>
	</table>
	<button type = "submit">작성</button>
	</form>
	<a href = "Test.do?to=list">리스트 보기</a>
</body>
</html>