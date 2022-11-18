<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
			수정할 아이디 입력 
			
		<input type="text" id ="searchId" placeholder="입력"/>
		<input type="button" id = "searchIdBtn" value ="아이디 검색"/>
	</p>
	<div id ="resultDiv"></div>
	<div id="updateDiv">
		<form id ="updateForm">
			<table>
				<tr>
					<td>이름  입력 </td>
					<td>
					<input type="text" id ="name" name ="name"/>
					
					</td>
				</tr>
				<tr>
						<td>아이디 입력 </td>
						<td>
							<input type="text" id ="id" name ="id" readonly="readonly"/>
							
						</td>
					</tr>
					<tr>
						<td>비밀번호 입력 </td>
						<td>
							<input type="text" id ="pwd" name ="pwd"/>
							
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<input type="button" id = "updatebtn" value ="tnwjd">
							<input type="reset"  value ="취소" id ="resetbtn">
						</td>
					</tr>
				</table>
				
				
			</form>
		</div>
							
				
			
				

<script type="text/javascript" src="http://code.jquery.com/jquery-3.6.1.min.js"></script>
<script type="text/javascript" src="../js/update.js"></script>
</body>
</html>