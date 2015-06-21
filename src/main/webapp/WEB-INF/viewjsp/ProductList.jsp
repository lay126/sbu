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
		<h2>상품 목록</h2> <br>
		 <c:out value='${ cateNum }'/>
		  
		<c:forEach var="product" items="${ productList.pageList }">
			<table>
				<tr>
					<td><a
						href="<c:url value='/jsp/viewProduct.do'><c:param name='productId' value='${ product.productNum }' /></c:url>">
							<c:out value='${ productproductName }' />
					</a></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>