<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

 

<%-- <form:form commandName="loginUser" method="post" action="/jsp/user/login.do"> --%>
<form action="<c:url value='/user/login.do' />" method="POST">

<c:if test="${!empty signonForwardAction}">
	<input type="hidden" name="forwardAction" value="<c:url value="${signonForwardAction}" />"/>
</c:if>

	<table align="left" bgcolor="#FFEBA3" width="200" height="200">
		<tr>
			<td align="center" bgcolor="#FFF9E3">ID</td>
			<td align="center" bgcolor="#FFF9E3"><input type="text"
				name=userId size="10" /></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FFF9E3">PWD</td>
			<td align="center" bgcolor="#FFF9E3"><input type="password"
				name="userPwd" size="10" /></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#FFF9E3"><input type="submit"
				value="login" /></td>
			<td align="center" bgcolor="#FFF9E3"><a
				href="<c:url value='/join/user.do'/>">join</a></td>
		</tr>
	</table>

</form>
<%-- </form:form> --%>

