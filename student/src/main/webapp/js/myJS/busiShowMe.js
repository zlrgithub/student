$(document).ready(function(){
	$().ready(function(){
		$.post("showMe.do","",function(data,status){
			var jsonObj = JSON.parse( data ); 
			var tr1 = "<input id = 'userId' type='text' disabled='disabled' value='"+jsonObj.userId+"' />";
			var tr2 = "<input id = 'username' type='text' disabled='disabled' value='"+jsonObj.userName+"' />";
			var tr3 = "<input id = 'job' type='text' disabled='disabled' value='"+jsonObj.job+"' />";
			var tr4 = "<input id = 'department' type='text' disabled='disabled' value='"+jsonObj.department+"' />";
			var tr5 = "<input id = 'phone' type='text' disabled='disabled' value='"+jsonObj.phone+"' />";
			var tr6 = "<input id = 'email' type='text' disabled='disabled' value='"+jsonObj.email+"' />";
			var tr7 = "<input id = 'companyName' type='text' disabled='disabled' value='"+jsonObj.companyname+"' />";
			var comTypeInfo = ["国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"];
			var op1;
			var op2 = "<select id = 'companyType' disabled='disabled'><option>"+jsonObj.companytype+"</option>"
			for(var i=0;i<7;i++){
				if (comTypeInfo[i] != jsonObj.companytype ){
					op1 = "<option>"+comTypeInfo[i]+"</option>" ;
					op2 = op2 + op1;
				}
			}
			var tr8 = op2 + "</select>";
			//var tr7 = "<input id = 'companyType' type='text' disabled='disabled' value='"+jsonObj.companyType+"' />";
			var tr9 = "<input id = 'companyAddress' type='text' disabled='disabled' value='"+jsonObj.companyaddress+"' />";
			var tr10 = "<textarea rows=\"3\" id = 'companyIntroduce' disabled='disabled'>" +jsonObj.companyIntroduce+"</textarea>";
			var tr11 = "<input id = 'companyWeb' type='text' disabled='disabled' value='"+jsonObj.companyWeb+"' />";
			
			$("#tb1").append(tr1);
			$("#tb2").append(tr2);
			$("#tb3").append(tr3);
			$("#tb4").append(tr4);
			$("#tb5").append(tr5);
			$("#tb6").append(tr6);
			$("#tb7").append(tr7);
			$("#tb8").append(tr8);
			$("#tb9").append(tr9);
			$("#tb10").append(tr10);
			$("#tb11").append(tr11);
		});
	});
});

$(document).ready(function(){
	$("#a1").click(function(){
		$("input").attr("disabled",false);
		$("select").attr("disabled",false);
		$("#userId").attr("disabled",true);
		$("#a2").css("display","");
	});
});

$(document).ready(function(){
	$("#a2").click(function(){
		$.post("showMeChange.do",
				{
					userId:$("#userId").val(),
					username:$("#username").val(),
					job:$("#job").val(),
					department:$("#department").val(),
					phone:$("#phone").val(),
					email:$("#email").val(),
					companyName:$("#companyName").val(),
					companyType:$("#companyType").val(),
					companyAddress:$("#companyAddress").val(),
					companyIntroduce:$("#companyIntroduce").val(),
					companyWeb:$("#companyWeb").val()
				},
				function(data,status){
					window.location.href="http://localhost:8080/student/user/showMe"
		});
	});
});
function infoOk(){
	window.location.href="http://localhost:8080/student/showMessage/showMain";
}