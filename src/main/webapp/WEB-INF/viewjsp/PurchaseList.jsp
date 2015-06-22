<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Purchase List</title>
</head>
<body bgcolor="#FFC9C8">
	<center>
		<form action="<c:url value='/user/login.do' />" method="POST">

			<input type="hidden" name="userId"
				value="<c:url value="${useSession.user.userId}" />" /> <input
				type="hidden" name="userPwd"
				value="<c:url value="${useSession.user.userPwd}" />" />

			<table align="center" width="1400">
				<tr>
					<td align="left"><input type="submit" value="홈으로 이동" /></td>
				</tr>
			</table>

		</form>
		<br />
		<center>
			<table align="left" bgcolor="#ffe4c4" width="700" border=2 bordercolor="white">
				<tr>
					<td colspan=2 align="center" bgcolor="#ffe4c4"><c:if
							test="${empty userSession.user}">
				please login!
			</c:if> <c:if test="${!empty userSession.user}">
				 <br>${userSession.user.userId} 님의 구매 목록 입니다 :)<br>
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
		</center>
	</center>
</body>
</html>