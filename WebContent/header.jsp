<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html> 
<head> 	
	<title>Intalio</title> 
	<meta name="viewport" content="width=device-width, initial-scale=1, charset=utf-8"> 
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.css" />
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.js"></script>
	<script src="js/iscroll.js"></script>
    <script src="js/jquery.mobile.iscroll.js"></script>
    <!--  Following script is to ignore quirk with the pushState feature because 
    if you're doing lots of non-ajax linking and going forward/back, things can get strange. -->
    <script type="text/javascript">
    $.extend(  $.mobile , {	
    	/* ajaxEnabled		 : false, */
    	hashListeningEnabled: false});
    </script>
</head>
