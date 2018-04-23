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
<h2 align="center">用户自定义查询界面</h3>
<h5>自定义查询条件</h5>
<div style="width: 98%;height: 100px;padding-left: 20px;float: left;">
	<form>
		<label for="gradTime">毕业年份：</label>
		<input type="text" id = "gradTime" onchange="selectList(this)">
		&emsp;
		<label for="school">学校名称：</label>
		<select id = "school" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		&emsp;&emsp;&emsp;
		<label for="major">专业：</label>
		<select id="major" onchange="selectList(this)">
			<option>-请选择-</option>
		</select>
		&emsp;
		<label for="trainTime">实习周期(月)：</label>
		<select id = "trainTime" onchange="selectList(this)">
			<option>-请选择-</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
			<option>5</option>
			<option>6</option>
			<option>7</option>
			<option>8</option>
			<option>9</option>
			<option>10</option>
			<option>11</option>
			<option>12</option>
		</select>
		&emsp;
		<label for = "prefStandards" >成绩：</label>
		<select id = "prefStandards" onchange="selectList(this)">
			<option>-请选择-</option>
			<option>A(3.7~4.0)</option>
			<option>B(3.3~3.7)</option>
			<option>C(1.5~3.3)</option>
			<option>D(1.5~1.0)</option>
			<option>F(1.0~0.0)</option>
		</select>
		<br><br>
		
		<label for="companyType">公司类型：</label>
		<select id = "companyType" onchange="selectList(this)">
			<option>-请选择-</option>
			<option>国有企业</option>
			<option>外资企业</option>
			<option>私有企业</option>
			<option>事业单位</option>
			<option>股份制公司</option>
			<option>合资企业</option>
			<option>上市公司</option>
		</select>
		&emsp;&emsp;&emsp;
		<label for = "sex">性别：</label>
		<select id = "sex" onchange="selectList(this)">
			<option>-请选择-</option>
			<option>男</option>
			<option>女</option>
		</select>
		&emsp;
		<label for ="salary">薪资范围：</label>
		<input type="text" id = "salary1" onchange="selectList(this)" />--<input type="text" id = "salary2" onchange="selectList(this)" />
		&emsp;
		<input type="reset" value="重置查询条件" onclick="resets()">
	</form>
</div>
<div style="width: 98%;height: 290px;float: left;" id = "showView">
</div>
<div>
	<table id ="dg" border="1px;" style="display:none; padding: 0px;margin: 0px;"cellpadding="0px;"cellspacing="0px;">
	</table>
</div>
</body>
</html>