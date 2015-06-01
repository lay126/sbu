<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>this is User Main page</title>
</head>
<body>
	<table>
		<tr>
			<td><%@ include file="loginForm.jsp"%></td>
			<td rowspan="2"><%@ include file="UserEventForm.jsp"%></td>
		</tr>
		<tr>
			<td>
			
			<%@ include file="UserCategoryForm.jsp"%></td>
		</tr>
	</table>
</body>
</html>