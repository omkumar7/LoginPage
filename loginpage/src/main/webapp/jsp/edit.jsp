<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
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
padding-left: 500px;
background-color: #DBF9FC;
}
a{
text-decoration	:none;
}
 .error {
            color:red;
        }

.body{ align="center"}
</style>

</head>
<body>

    <form:form id="editForm" modelAttribute="edit2" action="editprocess1"
    		method="post">
            <h3>Conform Password For Verify</h3>
            Username:<td><input  path="username" value= ${username}  name="username" id="username" /></td>
                        <br><br>
			FirstName:<td><input  path="firstname" value= ${firstname}  name="firstname" id="firstname" /></td>
            <br><br>
			LastName:<input path="lastname"value=${lastname} name="lastname" id="lastname"/>
            <br><br>
    		Email:	<input   path="email" value=${email} name="email" id="email" />
            <br><br>
    		Address:<input path="address"value=${address} name="address" id="address" />
            <br><br>
			Phone:	<input path="phone"value=${phone} name="phone" id="phone" minlength="10" maxlength="10" />
            <br><br>

            <form:button id="save" name="save">Save</form:button></td>

	</form:form>

</body>
</html>