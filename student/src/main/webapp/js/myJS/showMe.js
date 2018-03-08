$(document).ready(function(){
	$().ready(function(){
		$.post("showMe.do","",function(data,status){
			var jsonObj = JSON.parse( data ); 
			var tr1 = "<input id = 'userId' type='text' disabled='disabled' value='"+jsonObj.userId+"' />";
			var tr2 = "<input id = 'username' type='text' disabled='disabled' value='"+jsonObj.username+"' />";
			var sexVal;
			if ( jsonObj.sex == "男" ){
				sexVal = "女";
			}else{
				jsonObj.sex = "女";
				sexVal = "男";
			}
			var tr3 = "<select id = 'sex' disabled='disabled'>" +
					"<option>"+jsonObj.sex+"</option>" +
					"<option>"+sexVal+"</option></select>"
			var tr4 = "<input id = 'school' type='text' disabled='disabled' value='"+jsonObj.school+"' />";
			var tr5 = "<input id = 'graTime' type='text' disabled='disabled' value='"+jsonObj.graTime+"' />";
			var isTopSchoolVal;
			if ( jsonObj.isTopSchool == "是" ){
				isTopSchoolVal = "否";
			}else{
				jsonObj.isTopSchool = "否";
				isTopSchoolVal = "是";
			}
			var tr6 = "<select id = 'isTopSchool' disabled='disabled'>" +
						"<option>"+jsonObj.isTopSchool+"</option>" +
						"<option>"+isTopSchoolVal+"</option></select>"
			//	"<input id = 'isTopSchool' type='text' disabled='disabled' value='"+jsonObj.isTopSchool+"' />";
			var tr7 = "<input id = 'major' type='text' disabled='disabled' value='"+jsonObj.major+"' />";
			var standard = ["A(3.7+)","B(3.3~3.7)","C(1.5~3.3)","D(1.0~1.5)","F(0~1.0)"];
			var ops1 = "<select id = 'prefStandard' disabled='disabled'>";
			for( var i = 0 ; i < 5 ; i++ ){
				if( jsonObj.prefStandards == standard[i] ){
					ops1 = ops1 + "<option>"+standard[i]+"</option>";
					for( var k = 0 ; k < 5 ;k ++ ){
						if( jsonObj.prefStandards !== standard[i].substring(0,1) ){
							ops1 = ops1 + "<option>"+standard[i]+"</option>";
						}
					}
					break;
				}
			}
			if( ops1 == "<select id = 'prefStandard' disabled='disabled'>"){
				for(var i = 0 ; i<5 ; i ++){
					ops1 = ops1 + "<option>"+standard[i]+"</option>";
				}
			}
			var tr8 = ops1 + "</select>";
			//var tr8 = "<input id = 'prefStandard' type='text' disabled='disabled' value='"+jsonObj.prefStandards+"' />";
			var tr9 = "<input id = 'workspace' type='text' disabled='disabled' value='"+jsonObj.workspace+"' />";
			var tr10 = "<input id = 'cityType' type='text' disabled='disabled' value='"+jsonObj.cityType+"' />";
			var tr11 = "<input id = 'work' type='text' disabled='disabled' value='"+jsonObj.work+"' />";
			/*var tr12 = "<input id = 'isMajor' type='text' disabled='disabled' value='"+jsonObj.isMajor+"' />";*/
			var isMajorValu;
			var isMajorValu2;
			if( jsonObj.isMajor == 1 ){
				isMajorValu = "是";
				isMajorValu2 = "否";
			}else {
				isMajorValu = "否";
				isMajorValu2 = "是";
			}
			var tr12 = "<select id = 'isMajor' disabled='disabled'> " +
					"<option>"+isMajorValu+"</option>" +
					"<option>"+isMajorValu2+"</option>"+
					"</select>";
			var tr13 = "<input id = 'salary' type='text' disabled='disabled' value='"+jsonObj.salary+"' />";
			/*var tr14 = "<input id = 'companyType' type='text' disabled='disabled' value='"+jsonObj.companyType+"' />";*/
			var comTypeInfo = ["国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"];
			var op1;
			var op2 = "<select id = 'companyType' disabled='disabled'><option>"+comTypeInfo[jsonObj.companyType]+"</option>"
			for(var i=0;i<7;i++){
				if (i != jsonObj.companyType ){
					op1 = "<option>"+comTypeInfo[i]+"</option>" ;
					op2 = op2 + op1;
				}
			}
			var tr14 = op2 + "</select>";
			var tr15 = "<input id = 'isTrain' type='text' disabled='disabled' value='"+jsonObj.isTrain+"' />";
			/*var tr16 = "<input id = 'wayOfOffer' type='text' disabled='disabled' value='"+jsonObj.wayOfOffer+"' />";*/
			var wayOfOffer = ["校园招聘","网络招聘","社会招聘","内部推荐"];
			var opx1;
			var opx2 = "<select id = 'wayOfOffer' disabled='disabled'><option>"+wayOfOffer[jsonObj.wayOfOffer]+"</option>"
			for(var i=0;i<4;i++){
				if (i != jsonObj.wayOfOffer ){
					opx1 = "<option>"+wayOfOffer[i]+"</option>" ;
					opx2 = opx2 + opx1;
				}
			}
			var tr16 = opx2 + "</select>";
			
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
			$("#tb12").append(tr12);
			$("#tb13").append(tr13);
			$("#tb14").append(tr14);
			$("#tb15").append(tr15);
			$("#tb16").append(tr16);
			
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
		var isMajorValu;
		if( $("#isMajor").val() == "是" ){
			isMajorValu = 1;
		}else {
			isMajorValu = 0;
		}
		var comTypeInfo = ["国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"];
		for ( var i = 0 ; i < 7 ; i++ ){
			if( $("#companyType").val() == comTypeInfo[i] ){
				var companyTypeVal = i;
			}
		}
		var wayOfOffer = ["校园招聘","网络招聘","社会招聘","内部推荐"];
		for ( var i = 0 ; i < 4 ; i++ ){
			if( $("#wayOfOffer").val() == wayOfOffer[i] ){
				var wayOfOfferVal = i;
			}
		}
		$.post("showMeChange.do",
				{
					userId:$("#userId").val(),
					username:$("#username").val(),
					sex:$("#sex").val(),
					school:$("#school").val(),
					graTime:$("#graTime").val(),
					isTopSchool:$("#isTopSchool").val(),
					major:$("#major").val(),
					prefStandard:$("#prefStandard").val(),
					workspace:$("#workspace").val(),
					cityType:$("#cityType").val(),
					work:$("#work").val(),
					isMajor:isMajorValu,
					salary:$("#salary").val(),
					companyType:companyTypeVal,
					isTrain:$("#isTrain").val(),
					wayOfOffer:wayOfOfferVal
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