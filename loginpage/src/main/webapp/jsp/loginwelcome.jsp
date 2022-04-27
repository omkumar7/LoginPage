<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
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
	<table>
		<tr>
			<td>Welcome ${firstname}</td>
		</tr>
		<tr>
        	<td>Name: ${firstname} ${lastname}</td>
        </tr>
		<tr>
           	<td>Phone: ${phone}</td>
        </tr>
        <tr>
        	<td>Email: ${email}</td>
        </tr>
        <tr>
        	<td>Address: ${address}</td>
        </tr>

		<tr>

		</tr>
		<tr>

		</tr>
		<tr>
				<td><button><a href="home.jsp">LogOut</a></button></td>
				<td><button><a href="edit">Edit</a></button></td>
		        <td><button><a href="changepassword">Change Password</a></button></td>
		</tr>
	</table>
</body>
</html>