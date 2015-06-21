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
		<form action="/jsp/writeEvent.do" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">
				<tr>
					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventName">이벤트 이름</td>

					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventStartDate">이벤트 시작날짜</td>

					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventEndDate">이벤트 종료날짜</td>

					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventText">이벤트 설명</td>
				</tr>
			</table>
		</form>

		<form action="/jsp/deleteEvent.do" method="POST">
			<table align="center" cellspacing="5" cellpadding="5" border="0"
				bordercolor="#E6E6E6" rules="rows" width="80%">
				<tr>
					<td width="10%" bgcolor="#E6E6E6" align="center"><input
						type="text" name="eventName">이벤트 이름</td>
				</tr>

			</table>
			<br>
			<center>
				<input type="submit" value="Post" />삭제
			</center>
		</form>



		<h2>이벤트 상품 목록</h2>
		<br>
		<c:if test='${ empty eventProductList }'>
			<c:out value='등록된 상품이 없습니다.' />
		</c:if>

		<c:forEach var="event" items="${ eventProductList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td><c:out value='이벤트 : ${ event.event } ' /></td>
					</a>
					</td>
					<td><c:out value='이벤트 명: ${ event.eventName } ' /></td>
					</td>
					<td><c:out value='이벤트 내용: ${ event.eventText } ' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>