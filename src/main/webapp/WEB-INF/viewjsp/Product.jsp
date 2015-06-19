product jsp
<!-- 
<table align="left" bgcolor="#008800" border="0" cellspacing="2"
	cellpadding="2">
	<tr>
		<td bgcolor="#FFFF88"><a
			href="<c:url value="/shop/viewProduct.do"><c:param name="productId" value="${product.productId}"/></c:url>">
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
 -->

