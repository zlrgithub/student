<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="./../css/selectByMe.css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/demo/demo.css" />
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/datagrid-detailview.js"></script>
    <script type="text/javascript" src="./../js/echarts/echarts.min.js"></script>
	<script type="text/javascript" src="./../js/echarts/echarts-gl.min.js"></script>
	<script type="text/javascript" src="./../js/echarts/echarts-all.js"></script>
	<script type="text/javascript" src="./../js/myJS/selectByMe.js"></script>
</head>
<body>
<h3 align="center">学生自定义查询界面</h3>
<h5 style="color: black;">请选择查询条件</h5>
<div style="width: 98%;height: 100px;padding-left: 20px;float: left;">
	<form>
		<input type="reset" value="重置查询条件" onclick="resets()"><br>
		<label for="gradTime">毕业年份：</label>
		<input type="text" id = "gradTime" onchange="selectList(this)">
		
		<label for="school">学校名称：</label>
		<select id = "school" onchange="selectList(this)">
			<option>-请选择-</option>
			<option>长春工业大学</option>
		</select>
		
		<label for="major">专业：</label>
		<select id="major" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		
		<label for="trainTime">实习周期：</label>
		<select id = "trainTime" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		
		<label for = "prefStandards" >成绩：</label>
		<select id = "prefStandards" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		<br>
		
		<label for="companyType">公司类型：</label>
		<select id = "companyType" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		
		<label for = "sex">性别：</label>
		<select id = "sex" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		
		<label for ="salary">薪资范围：</label>
		<input type="text" id = "salary1" onchange="selectList(this)" />--<input type="text" id = "salary2" onchange="selectList(this)" />
	</form>
</div>
<div style="width: 98%;height: 290px;float: left;" id = "showView">
</div>
<div>
	<table id ="dg" border="1px;" style="display:none; padding: 0px;margin: 0px;border-color: gray" cellpadding="0px;"cellspacing="0px;">
		<tr id = "name">
			<th width='120px;'hight='60px;'>查询条件：</th>
		</tr>
		<tr id = "info">
			<th width='120px;'hight='60px;'>人数：</th>
		</tr>
		<tr id = "other">
			<th width='120px;'hight='60px;'>其他：</th>
		</tr>
		<tr id = "prop">
			<th width='120px;'hight='60px;'>占比：</th>
		</tr>
	</table>
</div>
</body>
</html>