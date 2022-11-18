<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#writeForm div{
	color: red;
	font-size: 8pt;
	font-weight: bold;
}
</style>
</head>
<body>
<h2>
<img src="../img/loader.gif"
onclick ="location.href='/chapter06_SpringWebMAVEN/'" >회원가입</h2>
<hr>
<form id="writeForm">
<table border="1">
	<tr>
		<td>이름</td>
		<td>
			<input type="text" id = "name" name ="name"/>
			<div id="nameDiv"></div>
		</td>
	</tr>
	<tr>
		<td>아이디</td>
		<td>
			<input type="text" id = "id" name ="id"/>
			<div id="idDiv"></div>
		</td>
	</tr>
	
	<tr>
		<td>비밀번호</td>
		<td>
			<input type="password"id ="pwd" name="pwd"/>
			<div id="pwdDiv"></div>
		</td>
	</tr>
	
	<tr>
		<td colspan="2">
		<input type="button"  id = "writebtn" value="등록" onclick="location.href='/chapter06_SpringWebMAVEN/'" />
		<button type="reset">취소</button>
		</td>	
	</tr>
	</table>
</form>

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>

<script type="text/javascript" src="../js/write2.js"></script>
<script type="text/javascript">



</script>
</body>
</html>