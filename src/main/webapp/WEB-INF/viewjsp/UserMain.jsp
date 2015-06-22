<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main page</title>
</head>
<body>
		<table>
			<tr>
				<td><c:if test="${empty userSession.user}">
						<%@ include file="loginForm.jsp"%>
					</c:if> <c:if test="${!empty userSession.user}">
						<%@ include file="loginedForm.jsp"%>
					</c:if></td>
				<td rowspan="2"><%@ include file="UserEventForm.jsp"%>
				</td>
			</tr>
			<tr>
				<td><%@ include file="UserCategoryForm.jsp"%></td>
			</tr>
		</table>
	</center>
</body>
</html>