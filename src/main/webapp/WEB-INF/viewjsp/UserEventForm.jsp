<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<table align="left" bgcolor="#ffe4c4" width="700" height="1000">
	<tr>
		<td align="center" bgcolor="#ffe4c4"><c:if
				test="${empty userSession.user}">
				please login!
			</c:if> <c:if test="${!empty userSession.user}">
				<%@ include file="RecoForm.jsp"%>
			</c:if>
	</tr>

	<c:forEach var="event" items="${ eventList.pageList }">
		<tr>
			<td align="center" colspan="2" align="center" bgcolor="#f5f5dc">
				<a href="<c:url value='/jsp/viewEventProductList.do'>
				<c:param name='event' value='${ event }' />
				<c:param name='eventNum' value='${ event.eventNum }' /></c:url>">
							<c:out value='${ event.eventText }' />
					</a>
				
				</td>
		</tr>

	</c:forEach>
</table>

