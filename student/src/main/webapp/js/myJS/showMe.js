$(document).ready(function(){
	$().ready(function(){
		$.post("showMe.do","",function(data,status){
			var jsonObj = JSON.parse( data ); 
			var tr1 = "<input id = 'studentId' type='text' disabled='disabled' value='"+jsonObj.studentId+"' />";
			var tr2 = "<input id = 'school' type='text' disabled='disabled' value='"+jsonObj.school+"' />";
			var tr3 = "<input id = 'major' type='text' disabled='disabled' value='"+jsonObj.major+"' />";
			var tr4 = "<input id = 'prefStandard' type='text' disabled='disabled' value='"+jsonObj.prefStandards+"' />";
			var tr5 = "<input id = 'workspace' type='text' disabled='disabled' value='"+jsonObj.workspace+"' />";
			var tr6 = "<input id = 'work' type='text' disabled='disabled' value='"+jsonObj.work+"' />";
			var tr7 = "<input id = 'companyType' type='text' disabled='disabled' value='"+jsonObj.companyType+"' />";
			var tr8 = "<input id = 'isMajor' type='text' disabled='disabled' value='"+jsonObj.isMajor+"' />";
			var tr9 = "<input id = 'isLocal' type='text' disabled='disabled' value='"+jsonObj.isLocal+"' />";
			var tr10 = "<input id = 'username' type='text' disabled='disabled' value='"+jsonObj.userId+"' />";
			$("#tb1").append(tr1);
			$("#tb2").append(tr10);
			$("#tb3").append(tr2);
			$("#tb4").append(tr3);
			$("#tb5").append(tr4);
			$("#tb6").append(tr5);
			$("#tb7").append(tr6);
			$("#tb8").append(tr7);
			$("#tb9").append(tr8);
			$("#tb10").append(tr9);
		});
	});
});

$(document).ready(function(){
	$("#a1").click(function(){
		$("input").attr("disabled",false);
		$("#a2").css("display","");
		//$("#a2").attr("href","showMe.do");s
	});
});

$(document).ready(function(){
	$("#a2").click(function(){
		$.post("showMeChange.do",
				{
					studentId:$("#studentId").val(),
					school:$("#school").val(),
					major:$("#major").val(),
					prefStandard:$("#prefStandard").val(),
					workspace:$("#workspace").val(),
					work:$("#work").val(),
					companyType:$("#companyType").val(),
					isMajor:$("#isMajor").val(),
					isLocal:$("#isLocal").val(),
					username:$("#username").val()
				},
				function(data,status){
					window.location.href="http://localhost:8080/student/user/showMe"
		});
		 /*$.ajax({
		        type: "POST",//方法类型
		        dataType: "json",//预期服务器返回的数据类型
		        url: "showMeChange.do" ,//url
		        data: $('#form1').serialize(),
		        success: function (result) {
		            console.log(result);//打印服务端返回的数据(调试用)
		            if (result.resultCode == 200) {
		                alert("SUCCESS");
		            }
		            ;
		        	alert("okok");
		        },
		        error : function() {
		            alert("异常！");
		        }
		    });*/
	});
});
function infoOk(){
	window.location.href="http://localhost:8080/student/showMessage/showMain";
}
