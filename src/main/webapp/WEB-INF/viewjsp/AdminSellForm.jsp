<%@ page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<center>
	<form name="productNumForm"
		action="<c:url value='/jsp/viewProductRemain.do' />" method="POST">

		<table bgcolor="#A8BDCC" width="700" cellpadding="10" height="150">
			<tr>
				<td align="center" bgcolor="#A8BDCC" width="150" height="150">product number :</td>
				<td><c:if test="${empty product}">
						<input type="text" name="productNum" />
					</c:if> <c:if test="${!empty product}">
						<input type="text" name="productNum"
							value="${ product.productNum }" />
					</c:if></td>
				<td><input type="submit" value="search" /></td>
			</tr>
		</table>
	</form>

	<form name="buyForm" action="<c:url value='/user/buy.do' />"
		method="POST">
		<table bgcolor="#A8BDCC" width="700" cellpadding="10"  height="200">
			<tr>
				<td align="center" width="150">customer id :</td>
				<td><input type="text" name="userId" /></td>
				<td rowspan="2"><input type="submit" value="done" /></td>
			</tr>
			<tr>
				<td align="center" width="150">number of sales :</td>
				<td><input type="text" name="salesNum" /></td>
			</tr>
		</table>
		<c:if test="${!empty product}">
			<input type="hidden" name="productNum"
				value="${ product.productNum }" />
		</c:if>
	</form>

	<br>
	<c:if test="${!empty product}">
		<table align="center" bgcolor="#A8BDCC" cellspacing="0"
			cellpadding="10" border="1" width="700"  height="200">
			<tr bgcolor="#A8BDCC">
				<th>product</th>
				<th>number of remain</th>
			</tr>
			<tr bgcolor="#A8BDCC">
				<td><b>${product.productName}</b></td>
				<td><c:if test='${product.productRemain <= 0}'>
						<font color="RED" size="2"> no remain </font>
					</c:if> <c:if test='${product.productRemain > 0}'>
						<font size="2"><fmt:formatNumber
								value='${product.productRemain}' /> ${product.productRemain} 개 남음
						</font>
					</c:if></td>
			</tr>
		</table>
	</c:if>
</center>


