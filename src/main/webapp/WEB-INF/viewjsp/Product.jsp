<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<%@ page import="sbu.spring.dao.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function buyCheck() {
		var result = confirm("구매 하시겠습니까?");

		if (result) {
			document.productForm.submit();
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product</title>
</head>
<body bgcolor="#FFC9C8">
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

	<center>
		<br>
		<h2>" ${product.productName} " 의 정보를 알려드려요~</h2>
		<br>
		<form name="productForm"
			action="<c:url value='/user/buy2.do' > <c:param name='userId' value='${userSession.user.userId}'/><c:param name='productNum' value='${product.productNum}'/> </c:url>"
			method="POST">
			<table align="center" bgcolor="#D6FFB6" cellspacing="0"
				cellpadding="10" border="1" bordercolor="white" width="600"
				height="500">
				<caption align="left">
					<a
						href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='${ product.productCateNum }'/></c:url>">
						목록보기</a> <br>
					<br>
				</caption>
				<tr bgcolor="#FFD8CA">
					<th>상품명</th>
					<td width="300"><b>${product.productName}</b></td>
				</tr>
				<tr bgcolor="#FFD8CA">
					<th height="100">상품 설명</th>
					<td>${product.productDescription}</td>
				</tr>

				<tr bgcolor="#FFD8CA">
					<th>재고수량</th>
					<td><c:if test='${product.productRemain <= 0}'>
							<font color="RED" size="2"> 재고 없음 </font>
						</c:if> <c:if test='${product.productRemain > 0}'>
							<font size="2"><fmt:formatNumber
									value='${product.productRemain}' /> ${product.productRemain} 개
								남음 </font>
						</c:if></td>
				</tr>
				<tr bgcolor="#FFD8CA">
					<th>가격</th>
					<td>${product.productPrice}원</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><c:if
							test='${product.productRemain <= 0}'>
							<font color="RED" size="2"> 구매가 불가한 상품입니다. </font>
						</c:if> <c:if test='${product.productRemain > 0}'>
							구매 수량 : <input type="text" name="salesNum" /> 개&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="button" value="구매하기" onclick="buyCheck()">
							</font>
						</c:if></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
