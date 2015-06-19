<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form commandName="loginUser" method="post">
<p>
	<label for="loginType"><spring:message code="login.form.type" /></label>
	<form:select path="loginType" items="${loginTypes}" />
</p>
<p>
	<label for="id"><spring:message code="login.form.id" /></label>
	<form:input id="id" path="account.id"/>
</p>
<p>
	<label for="password"><spring:message code="login.form.password" /></label>
	<form:password id="password" path="account.password"/>
</p>
<p>
	<input type="submit" value="logins">
</p>
</form:form>
