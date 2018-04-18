<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Main</title>
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/demo/demo.css" />
	<link rel="stylesheet" href="./../css/main.css" />
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/datagrid-detailview.js"></script>
	<script type="text/javascript" src="./../js/myJS/main.js"></script>
</head>
<% 
HttpSession httpSession = request.getSession();
String roleType = httpSession.getAttribute("roleType").toString();
%>
<body  onload="showJobInfo(<%="'"+roleType+"'"%>)">

	<div class="easyui-layout" style="width:100%;height:645px;">
		<div id = "div1" region="north">
			<h1>毕业生就业信息查询系统</h1>
			<div align="right" style="width: 98%">
				<a href='http://localhost:8080/student'>退出系统</a>
			</div>
		</div>
		<div id  ="div2" region="west" split="true" title="菜单">
			<!-- <p style="padding:5px;margin:0;"><font>Select Item:</font></p> -->
			<ul id = "menulist">
				<!-- <li id="userInfo" style="display: none"><a href="javascript:void(0)" onclick="change('http://localhost:8080/student/user/showMe')">
					<font>用户信息</font></a></li><br>
				<li id="studentInfo" style="display: none"><a href="javascript:void(0)" onclick="change('http://localhost:8080/student/showMessage/showMain')">
					<font>就业生数据</font></a></li><br>
				<li id="selectInfo" style="display: none"><a href="javascript:void(0)" onclick="change('http://localhost:8080/student/showMessage/selectByMe')">
					<font>自定义查询</font></a></li><br>
				<li id="selectJobInfo" style="display: none"><a href="javascript:void(0)" onclick="change('http://localhost:8080/student/jobMsgController/jobInfo')">
					<font>招聘信息查询</font></a></li><br>
				<li id = "jobInfo" style="display: none"><a href="javascript:void(0)" onclick="change('http://localhost:8080/student/showMessage/releaseJobInfo')">
					<font>发布招聘信息</font></a></li><br>-->
			</ul>
		</div>
		<div id="content" region="center" title=" ">
			<iframe id = "showView" src ='http://localhost:8080/student/showMessage/showMain' 
				style="width: 98%;height: 98%;border: 0px;">
			</iframe>
			<!-- <iframe id = "showView" src ='http://localhost:8080/student/jobMsgController/jobInfo' 
				style="width: 98%;height: 98%;border: 0px;">
			</iframe> -->
		</div>
	</div>
</body>
</html>