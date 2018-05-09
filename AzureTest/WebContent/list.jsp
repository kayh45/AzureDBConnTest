<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table {
		border-collapse: collapse;
	}
	td {
	 border : solid 1px #000;
	 padding : 2px;
	}
</style>
</head>
<body>
				<table>
					<tr style = "background-color : #cbf5ef">
						<td>testName</td>
						<td>testNum</td>

					</tr>
					<c:forEach var = "test" items = "${tVoList}">
					<tr>
						<td>${test.testName}</td>
						<td>${test.testNum}</td>
					</tr>
					</c:forEach>
				</table>
			<a href = "Test.do?to=main">작성화면으로 가기</a>

</body>
</html>