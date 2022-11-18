$('#writebtn').click(function(){
	$('#nameDiv').empty();
	
	
	if($('#name').val()==''){
	$('#nameDiv').text("이름입력");
	$('#name').focus();
	}else if($('#id').val()==''){
	$('#idDiv').text("아이디입력");
	$('#id').focus();
	}else if($('#pwd').val()==''){
	$('#pwdDiv').text("비밀번호입력");
	$('#pwd').focus();
	}else{
		$.ajax({
			type : 'post',
			url : '/chapter06_SpringWebMAVEN/user/write',
			data : $('#writeForm').serialize(),
			success : function(){
				alert("가입 성공");
				location.href='/chapter06_SpringWebMAVEN/user/list';
			},
			error: function(err){
			console.log(err);
			} 
			
		});
	}
});

//아이디 중복체크

$('#id').focusout(function(){
	$('#idDiv').empty();
	
	if($('#id').val() == ''){
		$('#idDiv').text("먼저 아이디를 입력헤주세요");
		$('#id').focus();
	}else{
		$.ajax({
			type:'post',
			url: '/chapter06_SpringWebMaven/user/isExistId',
			data: 'id=' + $('#id').val(),
			dataType: 'text',
			success: function(data){
				if(data == 'exist'){
					$('#idDiv').text('사용 불가능');
				}else if(data == 'non_exist'){
					$('#idDiv').text('사용 가능');
					$('#idDiv').css('color','blue');
				}
			},
			error: function(err){
				console.log(err);
			}
			
		});	
	}
});






















