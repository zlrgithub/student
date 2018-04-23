function change(address) {
	document.getElementById("showView").src =address;
}
function showJobInfo(roleType){
	var jobInfo = document.getElementById("jobInfo");
	if( "学生" == roleType ){
		li1 = $("<li id=\"userInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/user/showMe')\"><font>用户信息</font></a></li><br>");
		li2 = $("<li id=\"studentInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/showMain')\"><font>就业生数据</font></a></li><br>");
		li3 = $("<li id=\"selectInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/selectByMe')\"><font>自定义查询</font></a></li><br>");
		li4 = $("<li id=\"selectJobInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/jobMsgController/jobInfo')\"><font>招聘信息查询</font></a></li><br>")
		$('#menulist').append(li1);
		$('#menulist').append(li2);
		$('#menulist').append(li3);
		$('#menulist').append(li4);
	}else if("管理员" == roleType){
		li1 = $("<li><a id=\"studentAccount\" href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/studentMsg')\" ><font>学生账户管理</font></a></li><br>");
		li2 = $("<li><a id=\"studentMsg\" href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/studentAccount')\" ><font>学生信息管理</font></a></li><br>");
		li3 = $("<li><a id=\"studentAccount\" href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/busiAccount')\" ><font>企业账户管理</font></a></li><br>");
		li4 = $("<li><a id=\"studentAccount\" href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/busiMsg')\" ><font>企业信息管理</font></a></li><br>");
		li5 = $("<li><a id=\"studentMsg\" href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/jobMsg')\" ><font>就业信息管理</font></a></li><br>");
		$('#menulist').append(li1);
		$('#menulist').append(li2);
		$('#menulist').append(li3);
		$('#menulist').append(li4);
		$('#menulist').append(li5);
	}else{
		li1 = $("<li id=\"userInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/user/showMe')\"><font>用户信息</font></a></li><br>");
		li2 = $("<li id=\"studentInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/showMain')\"><font>就业生数据</font></a></li><br>");
		li3 = $("<li id=\"selectInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/selectByMe')\"><font>自定义查询</font></a></li><br>");
		li4 = $("<li id=\"selectJobInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/jobMsgController/jobInfo')\"><font>招聘信息查询</font></a></li><br>")
		li5 = $("<li id=\"jobInfo\"><a href=\"javascript:void(0)\" onclick=\"change('http://localhost:8080/student/showMessage/releaseJobInfo')\"><font>发布招聘信息</font></a></li><br>");
		$('#menulist').append(li1);
		$('#menulist').append(li2);
		$('#menulist').append(li3);
		$('#menulist').append(li4);
		$('#menulist').append(li5);
	}
}
