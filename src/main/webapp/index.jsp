<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta http-equiv="Pragma" content="no-cache" />
		<script type="text/javascript" src="ajax-pushlet-client.js"></script>		
		<script type="text/javascript">
			PL._init(); 
			PL.joinListen('/cuige/he');
			function onData(event) { 
				alert(event.get("mess")); 
				// 离开
				// PL.leave();
			}
		</script>
	</head>
	<body>
		<center>
		<h1>
			la la la!
		</h1>
		</center>
	</body>
</html>


