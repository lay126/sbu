<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<table align="left" bgcolor="#ffe4e1" width="200" height="800">
	<c:if test="${!empty userSession.user}">
		<tr>
			<td align="center" bgcolor="#ffb6c1"><a
				href="<c:url value='/jsp/viewPurchaseList.do'></c:url>">
					Purchase</a></td>
		</tr>
	</c:if>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='1'/></c:url>">
				base</a></td>
	</tr>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='2'/></c:url>">face
		</a></td>
	</tr>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='3'/></c:url>">
				colors</a></td>
	</tr>
</table>

