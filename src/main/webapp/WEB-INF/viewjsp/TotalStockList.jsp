<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ProductList</title>
</head>
<body bgcolor="#FFC9C8">
	<form action="<c:url value='/admin/login.do' />" >

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
	<center>
		<h2>재고 목록</h2>
		<br>

		<c:forEach var="product" items="${ productList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td width="500" align="center"><a
						href="<c:url value='/jsp/viewProduct.do'><c:param name='productNum' value='${ product.productNum }' /><c:param name='product' value='${ product }' /></c:url>">
							<c:out value='${ product.productName }' />
					</a></td>
				
					<td width="400""><c:out value='남은 수량 : ${ product.productRemain } 개' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>