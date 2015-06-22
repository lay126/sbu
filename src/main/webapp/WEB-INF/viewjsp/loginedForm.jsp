<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<form id="logoutUser" action="<c:url value='/user/logout.do' />" method="POST">
	<table align="left" bgcolor="#FFE0C8" width="200" height="200">
		<tr>
			<td align="center" bgcolor="#FFF9E3">ID</td>
			<td align="center" bgcolor="#FFF9E3"><c:out value="${userSession.user.userId}"/></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FFF9E3">EMAIL</td>
			<td align="center" bgcolor="#FFF9E3"><c:out value="${userSession.user.userEmail}"/></td>
		</tr>
		<c:if test="${userSession.user.userId != 'admin'}">
		<tr>
			<td align="center" bgcolor="#FFF9E3">POINT</td>
			<td align="center" bgcolor="#FFF9E3">
			<c:out value="${userSession.user.userPoint}"/></td>
		</tr>
		</c:if>
		<tr>
			<td colspan="2" align="center" bgcolor="#FFF9E3"><input type="submit"
				value="LOGOUT" /></td>
		</tr>
	</table>

</form>

