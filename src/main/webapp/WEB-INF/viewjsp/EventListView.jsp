<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ProductList</title>
</head>
<body>
	<center>
		<h2>�̺�Ʈ ��ǰ ���</h2>
		<br>
		<c:if test='${ empty eventList }'>
			<c:out value='��ϵ� ��ǰ�� �����ϴ�.' />
		</c:if>

		<c:forEach var="event" items="${ eventList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td width="400"><c:out value='�̺�Ʈ ��: ${ event.eventName } ' /></td>
					<td width="500"><c:out value='�̺�Ʈ ����: ${ event.eventText } ' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>
