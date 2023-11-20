<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<div style="margin-left: 25%; margin-top: 50px;">
		<h1>Struts2 and MySQL database connectivity example</h1>
		<s:form action="Register">
			<s:textfield label="ID" name="id" />
			<s:textfield label="Name" name="name" />
			<s:textfield label="Email" name="email" />
			<s:textfield label="City" name="city" />
			<s:submit value="Register" />
		</s:form>
	</div>
</body>
</html>