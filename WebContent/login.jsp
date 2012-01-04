<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<style type='text/css'>	
	.io-login-box {
		-moz-border-radius: 20px;
		-webkit-border-radius: 20px;
		border-radius: 20px;
		border: 1px solid #ccc;
		-moz-box-shadow: 0 0 30px rgba(0, 0, 0, 0.8);
		-webkit-box-shadow: 0 0 30px rgba(0, 0, 0, 0.8);
		box-shadow: 0 0 30px rgba(0, 0, 0, 0.8);
		-moz-transition: opacity 0.25s linear;
		-webkit-transition: opacity 0.25s linear;
		transition: opacity 0.25s linear;
		background-image: url('images/login.jpeg');
		height: 170px;
		width: 250px;
		z-index : 0;
	}
	
	.io-login-box-logo {
		height:200px;
		width : 220px;
		margin-bottom: 20px;
		margin-top: 60px;
		text-align: center;
	}
	
	
	
	.io-login-form-input {
		margin-bottom: 30px;
	}
	
	.io-login-form-input input {
		-moz-border-radius: 5px;
		-webkit-border-radius: 10px;
		border-radius: 15px;
		-moz-box-shadow: inset 2px 2px 4px rgba(0, 0, 0, 0.5);
		-webkit-box-shadow: inset 2px 2px 4px rgba(0, 0, 0, 0.5);
		box-shadow: inset 2px 2px 4px rgba(0, 0, 0, 0.5);
		border: none;
		font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
		font-size: 14px;
		height: 30px;
		width: 200px;
		padding: 0px 10px;
		background-color: #F0F0F0;
		z-index: 1;
	}
	
	.io-login-logo {
		position: absolute;
		text-align: center;
		width: 100%;
	}
</style>
<body>
	<div data-role="page" style="background-image: url(images/background.jpg); font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
		overflow-x: hidden;	overflow-y: hidden;	margin: 0;	padding: 0;	text-rendering: optimizelegibility;">
		
		 <div data-role="content" role="main"> 
					 <div id='loginBox' class='io-login-box' style=" position:relative; margin-left:20px;">
						<div   style="position:relative ;margin-top:10px; margin-left:45px">
							<img src='images/logo.png' height='60px' width='150px' title='Intalio Logo' />
						</div>
					</div> 
				<form id='login-form' method="post" style="postition:fixed; top:50%; left:50% ;">
					
					<div class='io-login-form-input' style="position:relative; margin-top:-90px; margin-left:40px">
						<input id='username' name="username" type='text' value=''
							spellcheck='false' placeholder="UserName"></input>
					</div>
					<div class='io-login-form-input' style="position:relative; margin-top:-15px; margin-left:40px">
						<input id='password' name="password" type = "password"
							spellcheck='false' placeholder="Password"></input>
					</div>	
					<div style="color: #FFFFFF !important" style="position:relative;">
						<label id='notice_message'></label>
					</div>
					<div style="display: none">
						<input id="info" name="info" value="eyJjbGllbnRfbmFtZSI6IiIsImNsaWVudF9pZCI6IjRlZjgwM2Y2MTIwYmE5YWNiNDk3ZmZjNCIsInJlZGlyZWN0X3VyaSI6Imh0dHA6Ly9wbGF0aW51bS5jbG91ZC5pbnRhbGlvLmNvbS9vYXV0aCIsInN0YXRlIjoiIiwicmVzcG9uc2VfdHlwZSI6InRva2VuIiwibGFuZyI6IiIsInVzZXJuYW1lIjoiIiwibm90aWNlX21lc3NhZ2UiOiIifQ==" />
					</div>
				
				</form>
			
		</div>	

		<script type="text/javascript" src="js/login.js"></script>
		
	</div>
</body>
</html>