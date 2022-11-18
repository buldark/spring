$(function(){
	$('#updateDiv').hide();
	
	//아이디 찾기
	$('#searchIdBtn').click(function(){
		$('#resultDiv').empty();
		$.ajax({
			type : 'post'
			,url : '/chapter06_SpringWebMAVEN/user/getUser'
			,data: 'id = '+ $('#searchId').val()
			//,dataType : 'json' //데이터타입을 뺴버리면 주는대로 값을 받음 
			//서버에서 받아오는 
			//getUser에서 id를  찾으면 json으로 잘 오지만 데이터 타입은 JSON으로 오지만 id가 없으면 JSON이 오지 못한다.
			//그래서 dataType를 생략해야 한다 (dataType를 생략하면 자료에 맞게 자동으로 형식이 지정된다)
			,success :function(data){
				//alert(JSON.stringify(data));
				
				if(data == ''){
					$('#updateDiv').hide();
					$('#resultDiv').text('찾고자 하는 아이디 없음요');
					
				}else{
					$('#updateDiv').show();
					
					$('#name').val(data.name);
					$('#id').val(data.id);
					
				}
			},error :function(err){
				console.log(err);
			}
		});//$.ajax
	});
});
//취소 버튼
$('#resetbtn').click(function(){
//강제 이벤트 발생 
//집에 가고 싶다...뽐뽁......

$('#searchIdBtn').trigger('click');//강제 이벤트 발생 

});

















