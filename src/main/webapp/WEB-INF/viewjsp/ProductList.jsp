<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ProductList</title>
</head>
<body>
	<center>
		<h2>��ǰ ���</h2>
		${ productList }
		<%-- 
		<!--  �ϴ���  -->
		<table>
			<tr>
				<td><c:forEach var="product" items="${ productList }"> </c:forEach>
		</table> 
		--%>
	</center>
</body>
</html>