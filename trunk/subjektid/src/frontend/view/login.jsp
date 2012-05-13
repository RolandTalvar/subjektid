<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="loginForm" scope="request"
	class="frontend.forms.LoginForm" />
<jsp:useBean id="errors" scope="request" class="java.util.HashMap" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	<%
		String username = "";
		String usernameError = "";
		String passwordError = "";

		if (!errors.isEmpty()) {
			
			username = loginForm.getUsername();
			usernameError = errors.containsKey("username") ? (String) errors
					.get("username") : "";
			passwordError = errors.containsKey("password") ? (String) errors
					.get("password") : "";
	%>
	<p class="error">Login failed.</p>
	<%
		}
	%>
	<form method="post" action="?action=login">
		<table>
			<tr>
				<th>Username</th>
				<td><input type="text" name="username" value="<%=username%>"/><%=usernameError %></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="password" /><%=passwordError %></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit" name="LoginBtn">Login</button>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>