<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>this is User join page</title>
</head>
<body>

	<form:form commandName="accountUserForm" method="post">
		<table>
			<tr>
				<td><%@ include file="loginForm.jsp"%></td>
				<td rowspan="2">
					<table>
						<tr height="30">
							<td align="left" bgcolor="#E7EBC9"><label for="user_id">ID</label>
								<c:if test="${accountUserForm.newAccount}">
									<form:input path="account.username" />
								</c:if> <c:if test="${!accountUserForm.newAccount}">
									<c:out value="${accountUserForm.account.username}" />
								</c:if> <!-- <input type="text" id="user_id" size="16" maxlength="14" /> -->
							</td>
						</tr>
						<tr height="20">
							<td align="left" bgcolor="#E7EBC9"><label for="user_pwd">PASS</label>
								<%--  --%><form:password path="account.password" />
								<input type="text" id="user_pwd" size="14" maxlength="12" />
							</td>
						</tr>
						<tr height="20">
							<td align="left" bgcolor="#E7EBC9"><label for="user_name">NAME</label>
								<input type="text" id="user_name" size="14" maxlength="12" /></td>
						</tr>
						<tr height="20">
							<td align="left" bgcolor="#E7EBC9"><label for="user_birth">BIRTH</label>
								<input type="text" id="user_birth" size="14" maxlength="12" />
							</td>
						</tr>
						<tr height="20">
							<td align="left" bgcolor="#E7EBC9"><label for="user_email">E-MAIL</label>
								<input type="text" id="user_email" size="14" maxlength="12" />
							</td>
						</tr>
						<tr height="20">
							<td align="left" bgcolor="#E4F7BA"><label for="user_tel">TEL</label>
								<input type="text" id="user_tel" size="14" maxlength="12" /></td>
						</tr>
						<tr height="30">
							<td align="center" bgcolor="#E4F7BA"><input type="submit"
								value="Sign Up" /></td>
						</tr>
					</table>
				</td>
			</tr>
			<td></td>
			<tr>
				<td><%@ include file="UserCategoryForm.jsp"%></td>
			</tr>
		</table>
	</form:form>
</body>
</html>