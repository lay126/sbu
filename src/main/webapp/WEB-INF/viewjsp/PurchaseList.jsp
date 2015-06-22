<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Purchase List</title>
</head>
<body>
<table align="center" width="1400">
		<tr>
			<td align="left"><a href="/sBu/select/user.do"> 홈으로 이동 </a></td>
		</tr>
	</table>
<br/>
	<table align="left" bgcolor="#ffe4c4" width="700">
		<tr>
			<td align="center" bgcolor="#ffe4c4"><c:if
					test="${empty userSession.user}">
				please login!
			</c:if> <c:if test="${!empty userSession.user}">
				your purchase product LIST
			</c:if></td>

		</tr>

		<c:forEach var="purchase" items="${ purchaseList.pageList }">
			<tr>
				<td><c:out value="${purchase.buyDate}" /></td>
				<td><c:out value="${purchase.productNum}" /></td>
				<td><c:out value="${userId}" /></td>
				<td><c:out value="${purchase.buyNum}" /></td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>