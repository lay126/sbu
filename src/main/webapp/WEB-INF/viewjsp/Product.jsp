<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Product</title>
</head>
<body>
	<center>
		<h2>${product.productName} 상품 정보</h2>
		<br>
		<table align="center" bgcolor="#008800" cellspacing="0"
			cellpadding="10" border="1">
			<caption align="left">
				<a
					href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='${ product.productCateNum }'/></c:url>">
					목록보기</a>
			</caption>
			<tr bgcolor="#FFFF88">
				<th>상품명</th>
				<td width="300"><b>${product.productName}</b></td>
			</tr>
			<tr bgcolor="#FFFF88">
				<th height="100">상품 설명</th>
				<td>${product.productDescription}</td>
			</tr>

			<tr bgcolor="#FFFF88">
				<th>재고수량</th>
				<td><c:if test='${product.productRemain <= 0}'>
						<font color="RED" size="2"> 재고 없음 </font>
					</c:if> <c:if test='${product.productRemain > 0}'>
						<font size="2"><fmt:formatNumber
								value='${product.productRemain}' /> ${product.productRemain}
							개 남음 </font>
					</c:if></td>
			</tr>
			<tr bgcolor="#FFFF88">
				<th>가격</th>
				<td>${product.productPrice}원</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="button" value="구매하기"></td>
			</tr>
		</table>
	</center>

</body>
</html>
