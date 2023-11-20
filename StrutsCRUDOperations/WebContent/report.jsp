<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report Page</title>
<style>
table, td, th {
	border: 1px solid black;
}

table {
	border-collapse: collapse;
	width: 60%;
}

th {
	height: 30px;
}

.button-update {
	background-color: #008CBA;
	color: white;
}

.button-delete {
	background-color: red;
	color: white;
}
</style>
</head>
<body>
	<h2>Struts 2 Create, Read, Update and Delete (CRUD) Example using
		JDBC</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>ID.No.</th>
						<th>Name</th>
						<th>Email</th>
						<th>Password</th>
						<th>Designation</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="beanList">
					<tr>
						<td><s:property value="emp_id" /></td>
						<td><s:property value="emp_name" /></td>
						<td><s:property value="emp_email" /></td>
						<td><s:property value="emp_pass" /></td>
						<td><s:property value="emp_deg" /></td>
						<td><a
							href="updatedetails.action?submitType=updatedata&emp_email=<s:property value="emp_email"/>">
								<button class="button-update">Update</button>
						</a> <a href="deleterecord.action?emp_email=<s:property value="emp_email"/>">
								<button class="button-delete">Delete</button>
						</a></td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div>
</body>
</html>