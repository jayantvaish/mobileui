<!DOCTYPE html>
<html>
<%-- <jsp:include page="header.jsp" /> --%>
<body>

<div data-role="page" data-theme="d">
	<form action="http://platinum.cloud.intalio.com/auth/login" id='login-form1' method="post">
		<input name="info" value="eyJjbGllbnRfbmFtZSI6IiIsImNsaWVudF9pZCI6IjRlZjgwM2Y2MTIwYmE5YWNiNDk3ZmZjNCIsInJlZGlyZWN0X3VyaSI6Imh0dHA6Ly9wbGF0aW51bS5jbG91ZC5pbnRhbGlvLmNvbS9vYXV0aCIsInN0YXRlIjoiIiwicmVzcG9uc2VfdHlwZSI6InRva2VuIiwibGFuZyI6IiIsInVzZXJuYW1lIjoiIiwibm90aWNlX21lc3NhZ2UiOiIifQ==" />
		<input id='username' name="username" type='text' value="system"></input>
		<input id='password' name="password" type='password' value="gold"></input>
		<input type="submit" value="Submit">
	</form>
	
	<script type="text/javascript">
		//$(document).bind("pagebeforechange", $('#login-form').submit());
	</script>
	
</div>
</body>
</html>