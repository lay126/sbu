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
<body bgcolor="#FFC9C8">
	<form action="<c:url value='/user/login.do' />" method="POST">

		<input type="hidden" name="userId"
			value="<c:url value="${useSession.user.userId}" />" /> <input
			type="hidden" name="userPwd"
			value="<c:url value="${useSession.user.userPwd}" />" />

		<table align="center" width="1400">
			<tr>
				<td align="left"><input type="submit" value="Ȩ���� �̵�" /></td>
			</tr>
		</table>

	</form>

	<center>
		<br>
		<h2>" ${product.productName} " �� ������ �˷������~</h2>
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
						��Ϻ���</a> <br>
					<br>
				</caption>
				<tr bgcolor="#FFD8CA">
					<th>��ǰ��</th>
					<td width="300"><b>${product.productName}</b></td>
				</tr>
				<tr bgcolor="#FFD8CA">
					<th height="100">��ǰ ����</th>
					<td>${product.productDescription}</td>
				</tr>

				<tr bgcolor="#FFD8CA">
					<th>������</th>
					<td><c:if test='${product.productRemain <= 0}'>
							<font color="RED" size="2"> ��� ���� </font>
						</c:if> <c:if test='${product.productRemain > 0}'>
							<font size="2"><fmt:formatNumber
									value='${product.productRemain}' /> ${product.productRemain} ��
								���� </font>
						</c:if></td>
				</tr>
				<tr bgcolor="#FFD8CA">
					<th>����</th>
					<td>${product.productPrice}��</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><c:if
							test='${product.productRemain <= 0}'>
							<font color="RED" size="2"> ���Ű� �Ұ��� ��ǰ�Դϴ�. </font>
						</c:if> <c:if test='${product.productRemain > 0}'>
							���� ���� : <input type="text" name="salesNum" /> ��&nbsp;&nbsp;&nbsp;&nbsp;<input
								type="button" value="�����ϱ�" onclick="buyCheck()">
							</font>
						</c:if></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
