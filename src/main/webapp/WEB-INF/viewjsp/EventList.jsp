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
		<table>
			<tr>
				<td>
					<form action="<c:url value='/jsp/writeEvent.do' />" method="POST">
						<table align="center" cellspacing="5" cellpadding="5" border="0"
							bordercolor="#E6E6E6" rules="rows" width="80%" bgcolor="#E6E6E6">

							<tr>
								<td width="10%" align="center">�̺�Ʈ �̸�<input type="text"
									name="eventName" /></td>
								<td width="10%" align="center">�̺�Ʈ ���۳�¥<input type="text"
									name="eventStartDate" /></td>
								<td width="10%" align="center">�̺�Ʈ ���ᳯ¥<input type="text"
									name="eventEndDate" /></td>
								<td width="10%" align="center">�̺�Ʈ ����<input type="text"
									name="eventText" /></td>
							</tr>
							<tr>
								<td colspan="4" align="center"><input type="submit" value="���" /></td>
							</tr>
						</table>


					</form>

				</td>
			</tr>
			<tr>
				<td><%@ include file="EventListView.jsp"%>
				</td>
			</tr>

		</table>
	</center>

</body>
</html>