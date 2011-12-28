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
		height: 320px;
		width: 320px;
		margin-left: -160px;
		margin-top: -200px;
		position: absolute;
		left: 50%;
		top: 50%;
		text-align: center;
	}
	
	.io-login-box-logo {
		height: 60px;
		margin-bottom: 20px;
		margin-top: 60px;
		text-align: center;
	}
	
	
	
	.io-login-form-input {
		margin-bottom: 30px;
	}
	
	.io-login-form-input input {
		-moz-border-radius: 10px;
		-webkit-border-radius: 10px;
		border-radius: 10px;
		-moz-box-shadow: inset 2px 2px 4px rgba(0, 0, 0, 0.5);
		-webkit-box-shadow: inset 2px 2px 4px rgba(0, 0, 0, 0.5);
		box-shadow: inset 2px 2px 4px rgba(0, 0, 0, 0.5);
		border: none;
		font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif;
		font-size: 18px;
		height: 40px;
		width: 240px;
		padding: 0px 10px;
		position: relative;
		background-color: #F0F0F0;
		z-index: 0;
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
		
		<div data-role="content">
			<div id='loginBox' class='io-login-box'>
				<div class='io-login-box-logo'>
					<img src='images/logo.png' height='60' width='200' title='Intalio Logo' />
				</div>

				<form action="login" id='login-form'
					method="post">
					<div style='display: none'>
						<input id="info" name="info" value="eyJjbGllbnRfbmFtZSI6IiIsImNsaWVudF9pZCI6IjRlZjgwM2Y2MTIwYmE5YWNiNDk3ZmZjNCIsInJlZGlyZWN0X3VyaSI6Imh0dHA6Ly9wbGF0aW51bS5jbG91ZC5pbnRhbGlvLmNvbS9vYXV0aCIsInN0YXRlIjoiIiwicmVzcG9uc2VfdHlwZSI6InRva2VuIiwibGFuZyI6IiIsInVzZXJuYW1lIjoiIiwibm90aWNlX21lc3NhZ2UiOiIifQ==" />
					</div>
					<div style='height: 40px; color: #FFFFFF !important;'>
						<label id='notice_message'></label>
					</div>
					<div class='io-login-form-input' align="center">
						<input id='username' name="username" type='text' value=''
							spellcheck='false' placeholder="Username"></input>
					</div>
					<div class='io-login-form-input' align="center">
						<input id='password' name="password" type='password'
							spellcheck='false' placeholder="Password"></input>
					</div>
				</form>

			</div>

		</div>

		<script type="text/javascript" src="js/login.js"></script>
	</div>
</body>
</html>