$(document).ready(
function() {
	// Display the notice message.
	$('#notice_message').hide();
	var notice_msg = $('#notice_message').text();
	if (notice_msg && notice_msg != '') {
		$('#notice_message').fadeIn(1500).delay(3000).fadeOut(1500);
	}

	$('.io-login-box').bind('shakeBox',	function() {
		var duration = 500;
		var stepcount = 0;

		function quiver(el, x) {
			deg = 0;
			if (x != 0)
				deg = Math.cos(x* duration/ 100) / (x / duration * 100);
			el.css("-webkit-transform",	"rotate("+ deg + "deg)");
			el.css("-moz-transform", "rotate("+ deg + "deg)");
			el.css("-ms-transform", "rotate("+ deg + "deg)");
			el.css("transform", "rotate("+ deg + "deg)");
		}
		$(this).animate(
			// pick any unsused but iterable animation property, so the step function is triggered
			{
				color : "white"
			},
			{
				duration : duration, step : function(now,fx) {
				//increment the function input
				stepcount += 1;
				quiver($(this),stepcount);
				},
				complete : function() {
					//reset the rotation
					quiver($(this),0);
				}
			});
	});


	function process_login() {
		var info = $('#info').val();
		var user = $('#username').val();
		var passwd = $('#password').val();
		//alert("Username: " + user);
		//alert("Password: " + passwd);
		if (!user || user == '' || !passwd	|| passwd == '') {
			$('.io-login-box').trigger('shakeBox');
		} else {
			var data = $('#login-form').serialize();
			
			window.location.href='home.jsp';  //will be removed
			//alert("Data: " + data);
			/*$.ajax({
				type : 'POST',
				url : 'http://platinum.cloud.intalio.com/auth/login',
				data : data,
				dataType : 'json',
				complete : function(res, textStatus) {
					//alert("Response Code: " + res.status); 
					//alert("TextStatus: " + textStatus);
					if (textStatus === 'success') {
						window.location.href='home.jsp';
					} else {
						$('.io-login-box').trigger('shakeBox');
						console.log('login failed with error: ', res.responseText);
					}
				}
			});*/
			
			  
			  //$('#login-form').submit();

			  /*var iframe = document.createElement("iframe");
			  var uniqueString = "loginResult";
			  document.body.appendChild(iframe);
			  iframe.style.display = "none";
			  iframe.contentWindow.name = uniqueString;
			  iframe.id = uniqueString;
		
			  // construct a form with hidden inputs, targeting the iframe
			  var form = document.createElement("form");
			  form.target = uniqueString;
			  form.action = "http://iridium.cloud.intalio.com/auth/login";
			  form.method = "POST";
		
			  // repeat for each parameter
			  var input1 = document.createElement("input");
			  input1.type = "hidden";
			  input1.name = "info";
			  input1.value = info;
			  form.appendChild(input1);
			  
			  var input2 = document.createElement("input");
			  input2.type = "hidden";
			  input2.name = "username";
			  input2.value = user;
			  form.appendChild(input2);
			  
			  var input3 = document.createElement("input");
			  input3.type = "hidden";
			  input3.name = "password";
			  input3.value = passwd;
			  form.appendChild(input3);
		
			  document.body.appendChild(form);
			  form.submit(alert($('#' + uniqueString).contents().find('body').html()));*/
			  
			  //alert($('#' + uniqueString).contents().find('pre').html());
			  
			  

			
			


		}
	}				

	$(document).bind('keyup', function(event) {
		if (event.keyCode == '13') {
			//window.location.href='home.jsp';
			process_login();
		}
	});

});