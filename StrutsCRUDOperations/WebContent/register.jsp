<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
<style type="text/css">
.button-register {
	background-color: green;
	color: white;
}

.button-report {
	background-color: #000000;
	color: white;
	margin-left: 30%;
}
</style>
</head>
<body>
	<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using
		JDBC</h2>
	<a href="report"><button class="button-report" type="button">Report</button></a>
	<s:form action="registeruser.action" method="post">
		<s:textfield label="Full Name" name="emp_name" />
		<s:textfield label="Email" name="emp_email" />
		<s:password label="Password" name="emp_pass" />
		<s:textfield label="Designation" name="emp_deg" />
		<s:submit cssClass="button-register" value="Resgister" />
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>