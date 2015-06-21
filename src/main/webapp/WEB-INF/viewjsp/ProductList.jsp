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
		<c:out value='${ cateNum }' />
		<br>
		<c:if test='${ empty productList }'>
			<c:out value='��ϵ� ��ǰ�� �����ϴ�.' />
		</c:if>

		<c:forEach var="product" items="${ productList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td><a
						href="<c:url value='/jsp/viewProduct.do'><c:param name='productNum' value='${ product.productNum }' /><c:param name='product' value='${ product }' /></c:url>">
							<c:out value='${ product.productName }' />
					</a></td>
					<td><c:out value='���� : ${ product.productPrice } ��' /></td>
					</td>
					<td><c:out value='���� ���� : ${ product.productRemain } ��' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>