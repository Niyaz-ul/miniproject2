<html>
	<head>
		<script language="javascript">
			function validate()
			{
				var name=document.myform.t1.value;
				if(name=="")
					{
					alert("Username is mandatory");
					document.myform.t1.focus();
					return false;
					}
				
				return true;
			}
		</script>
	</head>

<body>
	<center>
		<h2><u>Registration Form</u></h2>
	</center>
<form action="test1" method="POST" name="myform" onsubmit="return validate()">
	<table align="center">
	
		<tr>
			<td>Username:</td>
			<td><input type="text" name="t1" autocomplete="off"/></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="t2"  autocomplete="off"/></td>
		</tr>
		<tr>
			<td>Confirm Password:</td>
			<td><input type="password" name="t3"  autocomplete="off"/></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input type="text" name="t4"  autocomplete="off"/></td>
		</tr>
		<tr>
			<td><input type="reset" value="refresh"/></td>
			<td><input type="submit" value="submit"/></td>
		</tr>
	</table>
</form>
</body>
</html>