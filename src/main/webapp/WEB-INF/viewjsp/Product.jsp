<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ProductList</title>
</head>
<body>

	product jsp 
	<br>$ { product .productName} :  ${product.productName}
	<%
	if (request != null) {
		System.out.println("not null");
	} else {
		System.out.println("null");
	}
%>
	<%-- 
<table align="left" bgcolor="#008800" border="0" cellspacing="2"
	cellpadding="2">
	<tr>
		<td bgcolor="#FFFF88"><a
			href="<c:url value="/shop/viewProduct.do">
					<c:param name="productNum" value="${product.productNum}"/>
				</c:url>">
				<b><font color="BLACK" size="2">&lt;&lt; <c:out
							value="${product.productName}" /></font></b>
		</a></td>
	</tr>
</table>

<p>
<table align="center" bgcolor="#008800" cellspacing="2" cellpadding="3"
	border="0" width="60%">
	<tr bgcolor="#FFFF88">
		<td bgcolor="#FFFFFF"><c:out
				value="${product.productDescription}" escapeXml="false" /></td>
	</tr>

	<tr bgcolor="#FFFF88">
		<td><font size="3"><i><c:out
						value="${product.productName}" /></i></font></td>
	</tr>
	<tr bgcolor="#FFFF88">
		<td><c:if test="${product.productRemain <= 0}">
				<font color="RED" size="2"><i>Back ordered.</i></font>
			</c:if> <c:if test="${product.productRemain > 0}">
				<font size="2"><fmt:formatNumber
						value="${product.productRemain}" /> in stock.</font>
			</c:if></td>
	</tr>
	<tr bgcolor="#FFFF88">
		<td><fmt:formatNumber value="${product.productPrice}"
				pattern="$#,##0.00" /></td>
	</tr>
</table>
 --%>
</body>
</html>
