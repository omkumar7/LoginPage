<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Password</title>
<style>
.Main_Div{
     display: flex;
     flex-direction: column;
     align-items:center
}
button{
   margin:5px;
}
body {
background-color: #DBF9FC;
}
a{
text-decoration	:none;
}

</style>

</head>
<body>

	<form:form id="loginForm1" modelAttribute="password1" action="passwordprocess"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="username">Username: </form:label></td>
				<td><form:input path="username" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password:</form:label></td>
				<td><form:password path="password" name="password"
						id="password" minlength="8" maxlength="8"/></td>
			</tr>
			<tr>
            	<td><form:label path="newpassword">Enter New Password:</form:label></td>
            	<td><form:password path="newpassword" name="newpassword"
            				id="newpassword" minlength="8" maxlength="8"/></td>
            			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="password1" name="password1">Conform</form:button></td>
			</tr>

			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>