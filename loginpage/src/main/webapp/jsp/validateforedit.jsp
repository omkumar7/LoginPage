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
padding-left:500px;
background-color: #DBF9FC;
}
a{
text-decoration	:none;
}

</style>

</head>
<body>

	<form:form id="editForm2" modelAttribute="edit1" action="editprocess"
		method="post">
		<h3>Conform Password For Verify</h3>
				<form:label path="password">Password:</form:label>
				<form:password path="password" name="password"	id="password" minlength="8" maxlength="8"/>

				<form:button id="edit" name="edit">Conform</form:button>
			<a href="home.jsp">Home</a>
	</form:form>
	<table align="center">
		<tr>
			<td style="font-style: italic; color: red;">${message}</td>
		</tr>
	</table>

</body>
</html>