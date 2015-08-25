<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>

	<form:errors path="Customer.uname" />
	<br />
	<form:errors path="Customer.password" />
	<br />
	<center>
		<form action="addCustomer.htm" method="post">
			<pre>
<h2>Registeration Form</h2>
				<br />
<table border="0">
<tr>
<td>User Name 	:</td>
						<td> <input type="text" name="uname" /></td>
</tr>
<tr>
<td>Password 	:</td>
						<td> <input type="password" name="password" /></td>
</tr>
<tr>
<td>First Name 	:</td>
						<td> <input type="text" name="fname" /></td>
</tr>
<tr>
<td>Last Name 	:</td>
						<td> <input type="text" name="lname" /></td>
</tr>
<tr>
<td>Date of Birth 	:</td>
						<td> <input type="date" name="cutomerDetail.dob" /></td>
</tr>
<tr>
						<td />
						<td align="center"><input type="submit" value="Add Customer" /></td>
</tr>
</table>
</pre>
		</form>
	</center>
</body>
</html>