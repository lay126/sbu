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
		<h2>�̺�Ʈ ���</h2>
		<form action="/jsp/writeEvent.do" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">
				<tr>
					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventName">�̺�Ʈ �̸�</td>

					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventStartDate">�̺�Ʈ ���۳�¥</td>

					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventEndDate">�̺�Ʈ ���ᳯ¥</td>

					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventText">�̺�Ʈ ����</td>
				</tr>
			</table>
		</form>

		<form action="/jsp/deleteEvent.do" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">
				<tr>
					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventName">�̺�Ʈ �̸�</td>
				</tr>

			</table>
			<br>
			<center>
				<input type="submit" value="Post" />����
			</center>
		</form>



		<h2>�̺�Ʈ ��ǰ ���</h2>
		<br>
		<c:if test='${ empty eventProductList }'>
			<c:out value='��ϵ� ��ǰ�� �����ϴ�.' />
		</c:if>

		<c:forEach var="event" items="${ eventProductList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td><c:out value='�̺�Ʈ : ${ event.event } ' /></td>
					</a>
					</td>
					<td><c:out value='�̺�Ʈ ��: ${ event.eventName } ' /></td>
					</td>
					<td><c:out value='�̺�Ʈ ����: ${ event.eventText } ' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>