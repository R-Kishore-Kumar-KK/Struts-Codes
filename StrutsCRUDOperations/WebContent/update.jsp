<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using
		JDBC</h2>
	<form action=updatedetails method="post">
		<pre>
<b>Name:         </b><input type="text" name="emp_name"
				value='<s:property value="emp_name"/>'>
		
		
<b>Email:        </b><input type="email" name="emp_email"
				value='<s:property value="emp_email"/>'>
		            <input type="hidden" name="emp_emailhidden"
				value='<s:property value="emp_email"/>'>
		
<b>Password:     </b><input type="password" name="emp_pass"
				value='<s:property value="emp_pass"/>'>
		
		
<b>Designation:  </b><input type="text" name="emp_deg"
				value='<s:property value="emp_deg"/>'>
		
		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
	</form>
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>