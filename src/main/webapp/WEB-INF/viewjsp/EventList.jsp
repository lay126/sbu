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
		<form action="<c:url value='/jsp/writeEvent.do' />" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">


				<tr>

					<td width="10%" bgcolor="#E6E6E6" align="center">�̺�Ʈ �̸�<input
						type="text" name="eventName" /></td>

					<td width="10%" bgcolor="#E6E6E6" align="center">�̺�Ʈ ���۳�¥<input
						type="text" name="eventStartDate" /></td>

					<td width="10%" bgcolor="#E6E6E6" align="center">�̺�Ʈ ���ᳯ¥<input
						type="text" name="eventEndDate" /></td>

					<td width="10%" bgcolor="#E6E6E6" align="center">�̺�Ʈ ����<input
						type="text" name="eventText" /></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="���" />
			</center>

		</form>

		<h2>�̺�Ʈ ����</h2>


		<form action="/jsp/deleteEvent.do" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">
				<tr>
					<td width="10%" bgcolor="#E6E6E6" align="center">�̺�Ʈ �̸�<input
						type="text" name="eventName"></td>
				</tr>

			</table>
			<br>
			<center>
				<input type="submit" value="����" />
			</center>
		</form>

<%@ include file="EventListView.jsp"%>
		
	</center>

</body>
</html>