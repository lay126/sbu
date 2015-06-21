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
		<h2>이벤트 상품 목록</h2>
		<br>
		<c:if test='${ empty eventList }'>
			<c:out value='등록된 상품이 없습니다.' />
		</c:if>

		<c:forEach var="event" items="${ eventList.pageList }">
			<table border="1" cellspacing="0" width="900" cellpadding="20"
				bgcolor="#ffe4e1">
				<tr>
					<td width="400"><c:out value='이벤트 명: ${ event.eventName } ' /></td>
					<td width="500"><c:out value='이벤트 내용: ${ event.eventText } ' /></td>
				</tr>

			</table>
			<br>
		</c:forEach>
	</center>
</body>
</html>
