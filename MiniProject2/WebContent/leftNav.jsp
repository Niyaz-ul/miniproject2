<html>
	<head>
		<style>
			a
			{
				margin-left:100px;
				font-size:20px;
				font-family:arial;
				color:#34495e;
				text-decoration:none;
			}
			a:hover
			{
				color:#27ae60;
				text-decoration:underline;
				font-family:serif;
			}
			form
			{
				margin-left:50px;
			}
			input[type="text"]
			{
				width:200px;
				height:30px;
				border:2px solid black;
				border-radius:15px;
			}
			input[type="password"]
			{
				width:200px;
				height:30px;
				margin-top:10px;
				border:2px solid black;
				border-radius:15px;
			}
			input[type="submit"]
			{
				margin-top:10px;
				margin-left:70px;
				border:none;
				background-color:#bdc3c7;
				color:black;
				padding:8px;
				font-weight:bold;
			}
			input[placeholder]
			{
				text-align:center;
				font-size:18px;
			}
			input[type="text"]:hover , input[type="password"]:hover
			{
			
				border:3px solid blue;
				
			}
			input[type="submit"]:hover
			{
				background-color:white;
				border:2px solid blue;
				color:blue;
			}

			
		</style>
	</head>
	<body>
			<form name="mf" action="test2" method="POST">
				<input type="text" name="t1" autocomplete="off" placeholder="username"/><br>
				<input type="password" name="t2"autocomplete="off" placeholder="password" /><br>
				<input type="submit" value="LogIn"/>
			</form>
			
			
			<br><br>
			<a href="mainpage2.jsp">registration</a>
	</body>
</html>