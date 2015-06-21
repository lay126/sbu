<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<%@ page import="sbu.spring.dao.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	function buyCheck() {
		var result = confirm("���� �Ͻðڽ��ϱ�?");

		if (result) {
			document.productForm.submit();
		}
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product</title>
</head>
<body>

	<center>
		<h2>${product.productName}��ǰ����</h2>
		<br>
		<form name="productForm"
			action="<c:url value='/user/buy2.do' > <c:param name='userId' value='${userSession.user.userId}'/><c:param name='productNum' value='${product.productNum}'/> </c:url>"
			method="POST">
			<table align="center" bgcolor="#008800" cellspacing="0"
				cellpadding="10" border="1">
				<caption align="left">
					<a
						href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='${ product.productCateNum }'/></c:url>">
						��Ϻ���</a>
				</caption>
				<tr bgcolor="#FFFF88">
					<th>��ǰ��</th>
					<td width="300"><b>${product.productName}</b></td>
				</tr>
				<tr bgcolor="#FFFF88">
					<th height="100">��ǰ ����</th>
					<td>${product.productDescription}</td>
				</tr>

				<tr bgcolor="#FFFF88">
					<th>������</th>
					<td><c:if test='${product.productRemain <= 0}'>
							<font color="RED" size="2"> ��� ���� </font>
						</c:if> <c:if test='${product.productRemain > 0}'>
							<font size="2"><fmt:formatNumber
									value='${product.productRemain}' /> ${product.productRemain} ��
								���� </font>
						</c:if></td>
				</tr>
				<tr bgcolor="#FFFF88">
					<th>����</th>
					<td>${product.productPrice}��</td>
				</tr>
				<tr>
					<td colspan="2" align="center">���� ���� : <input type="text"
						name="salesNum" /> ��&nbsp;&nbsp;&nbsp;&nbsp;<input type="button"
						value="�����ϱ�" onclick="buyCheck()"></td>
					<%-- 	<td colspan="2" align="center"> ���� ���� : <input type="text"
						name="salesNum" /> ��&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit"
						value="�����ϱ�"></td> --%>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
