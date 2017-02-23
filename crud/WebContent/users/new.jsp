<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test Application</title>
</head>
<body>
	<ul>
		<li>Home</li>
		<li>Account</li>
	</ul>
	<div id="body">
		<table>
			<form action="." method="post">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname"/>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname"/>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"/>
				</tr>
				<tr>
					<td><input type="submit" value="Save"/>
				</tr>
			</form>
		</table>
	</div>
	<div>
		<p>Powered by develop2disrupt</p>
	</div>
</body>
</html>
