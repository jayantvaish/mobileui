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


	/*function process_login() {
		var user = $('#username').val();
		var passwd = $('#password').val();
		if (!user || user == '' || !passwd	|| passwd == '') {
			$('.io-login-box').trigger('shakeBox');
		} else {
			var data = $('#login-form').serialize();
			//alert(data);
			$.ajax({
				type : 'POST',
				url : './loginhandler.do',
				data: data,
				dataType: 'json',
				error:function(e){
					  //alert("Error" + e);
				},
				success: function(res){
					//alert(res.result);
					if(res.result == "success"){
						//alert("Login successfull");
						window.location.href='home.jsp';
					} else {
						$('.io-login-box').trigger('shakeBox');
						console.log('login failed with error: ', res.responseText);
					}
				}
			});


		}
	}	*/			

	$(document).bind('keyup', function(event) {
		//alert("event.keyCode: " + event.keyCode);
		if (event.keyCode == '13') {
			//window.location.href='home.jsp';
			process_login();
		}
	});

});

function process_login() {
	var user = $('#username').val();
	var passwd = $('#password').val();
	if (!user || user == '' || !passwd	|| passwd == '') {
		$('.io-login-box').trigger('shakeBox');
	} else {
		var data = $('#login-form').serialize();
		//alert(data);
		$.ajax({
			type : 'POST',
			url : './loginhandler.do',
			data: data,
			dataType: 'json',
			error:function(e){
				  //alert("Error" + e);
			},
			success: function(res){
				//alert(res.result);
				//window.location.href='home.jsp';
				if(res.result == "success"){
					//alert("Login successfull");
					window.location.href='home.jsp';
				} else {
					$('.io-login-box').trigger('shakeBox');
					console.log('login failed with error: ', res.responseText);
				}
			}
		});


	}
}	