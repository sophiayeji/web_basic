<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax 예시</title>
<script src="04_jQuery/js/jquery-3.6.1.min.js"></script>
<script>

	$().ready(function(){
		
		$("#duplicatedIdCheck").click(function(){
			
			$.ajax({
				url : "ajaxEx04",
				type : "post",
				data: {"id": $("#id").val()}, // 보낼데이터
			    success: function(data) { //(받을데이터)
			    	if(data == "YES") {
			    		$("#result").html("중복된 아이디입니다.");
			    	}
			    	else {
			    		$("#result").html("사용가능한아이디입니다.");
			    	}
			    
			    }
			});		
		});			
	});
</script>
</head>
<body>

	<p>
		id : <input type="text" id="id">
		<input type="button" id="duplicatedIdCheck" value="중복확인"> 
		<span id="result"></span>
	</p> 
	
</body>
</html>