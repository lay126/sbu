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
<table align="center" width="1400">
		<tr>
			<td align="left"><a href="/sBu/select/user.do"> 홈으로 이동 </a></td>
		</tr>
	</table>
	<center>
		<h2>이벤트 상품 목록</h2>
		<br>
		<c:if test='${ empty eventProductList }'>
			<c:out value='등록된 상품이 없습니다.' />
		</c:if>

		<c:forEach var="product" items="${ eventProductList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td width="400" align="center"><a
						href="<c:url value='/jsp/viewProduct.do'><c:param name='productNum' value='${ product.productNum }' /><c:param name='product' value='${ product }' /></c:url>">
							<c:out value='${ product.productName }' />
					</a></td>
					<td width="250""><c:out value='가격 : ${ product.productPrice } 원' /></td>
					</td>
					<td width="250""><c:out value='남은 수량 : ${ product.productRemain } 개' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>