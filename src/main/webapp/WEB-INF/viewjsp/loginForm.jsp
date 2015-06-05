<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form commandName="accountUserForm" method="post">
	</form>
	<table align="left" bgcolor="#6D839A" width="200" height="200">
		<tr>
			<td align="center" bgcolor="#9CA8B3">ID</td>
			<td align="center" bgcolor="#9CA8B3"><input type="text"
				size="10" /></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#9CA8B3">PWD</td>
			<td align="center" bgcolor="#9CA8B3"><input type="password"
				size="10" /></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#9CA8B3"><input type="submit"
				value="login" /></td>
			<td align="center" bgcolor="#9CA8B3"><a
				href="<c:url value='/jsp/join/user.do'/>">join</a></td>
		</tr>
	</table>

</form:form>

