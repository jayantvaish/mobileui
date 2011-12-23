<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<body>
	<div data-role="page"
			style="background-image: url(images/background.jpg); height:100%" align="center">
		<br> <br>
		<div data-role="content"
			style="background-image: url(images/login.jpeg); width:70%; height:50%; border-radius:20px" align="center">
			<br> <br> <img src="images/logo.png"> <br>
			<br> <br> 
			<form id="login" action="home.jsp" method="post">
				<input id="username" type="text" name="username" id="username"  placeholder="Username"
					value="" style="width: 75%" /> <br> 
				<input id="password" type="password" name="password" id="password" placeholder="Password" value=""
					style="width: 75%" /> <br>
			</form>
		</div>
		
		<script type="text/javascript">
			$('#username, #password').keypress(function(e){
				if( e.keyCode == 13 ){  
					window.location.href='applications.jsp';
			   }
			});
		</script>
	</div>
</body>
</html>