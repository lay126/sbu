<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<table align="left" bgcolor="#ffe4e1" width="200" height="400">
	<tr>
		<td align="center" bgcolor="#ffb6c1">sell</td>
	</tr>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='1'/></c:url>">
				salse volume</a></td>
	</tr>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='2'/></c:url>">total
				stock </a></td>
	</tr>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewProductList.do'><c:param name='productCateNum' value='3'/></c:url>">
				recommend</a></td>
	</tr>
	<tr>
		<td align="center" bgcolor="#ffe4e1"><a
			href="<c:url value='/jsp/viewEventList.do'><c:param name='eventNum' value='3'/></c:url>">
				event</a></td>
	</tr>
</table>

