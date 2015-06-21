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
		<h2>이벤트 등록</h2>
		<form action="<c:url value='/jsp/writeEvent.do' />" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">


				<tr>

					<td width="10%" bgcolor="#E6E6E6" align="center">이벤트 이름<input
						type="text" name="eventName" /></td>

					<td width="10%" bgcolor="#E6E6E6" align="center">이벤트 시작날짜<input
						type="text" name="eventStartDate" /></td>

					<td width="10%" bgcolor="#E6E6E6" align="center">이벤트 종료날짜<input
						type="text" name="eventEndDate" /></td>

					<td width="10%" bgcolor="#E6E6E6" align="center">이벤트 설명<input
						type="text" name="eventText" /></td>
				</tr>
			</table>
			<center>
				<input type="submit" value="등록" />
			</center>

		</form>

		<h2>이벤트 삭제</h2>


		<form action="/jsp/deleteEvent.do" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">
				<tr>
					<td width="10%" bgcolor="#E6E6E6" align="center">이벤트 이름<input
						type="text" name="eventName"></td>
				</tr>

			</table>
			<br>
			<center>
				<input type="submit" value="삭제" />
			</center>
		</form>

		<h2>이벤트 상품 목록</h2>
		<br>
		<c:if test='${ empty eventList }'>
			<c:out value='등록된 상품이 없습니다.' />
		</c:if>

		<c:forEach var="event" items="${ eventList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td><c:out value='이벤트 명: ${ event.eventName } ' /></td>
					<td><c:out value='이벤트 내용: ${ event.eventText } ' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>

</body>
</html>