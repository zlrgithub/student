<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="jquery,ui,easy,easyui,web">
	<meta name="description" content="easyui help you build your web page easily!">
	<title>Show Me</title>
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/demo/demo.css" />
	<link rel="stylesheet" href="./../css/showMe.css" />
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/datagrid-detailview.js"></script>
	<script type="text/javascript" src="./../js/myJS/showMe.js"></script>
</head>
<body>
	<div><form id="form1" action="showMe.do" method="post">
		<div style="width: 80%" align="left">
			<a id="a1" class="easyui-linkbutton" style="width: 100px;">修改用户信息</a>
			<a id="a2" class="easyui-linkbutton" style="width: 100px;display: none;">保存信息</a>
		</div>
		<br><br>
		<div align="left" style="width: 100%;height:400px; ;float: left;">
			<div style="width: 30%;height:20%;">
				<table class="tables">
						<tr>
							<td>用户编码：</td>
							<td id="tb1"></td>
						</tr>
						<tr>
							<td>用户名：</td>
							<td id="tb2"></td>
						</tr>
				</table>
			</div>
			<div style="float: left;width: 30%;">
				<table class="tables">
						<tr>
							<td>学校名称：</td>
							<td id="tb3"></td>
						</tr>
						<tr>
							<td>专业：</td>
							<td id="tb4"></td>
						</tr>
						<tr>
							<td>专业水平：</td>
							<td id="tb5"></td>
						</tr>
				</table>
			</div>
			<div style="float: left;width: 30%;">
				<table class="tables">
						<tr>
							<td>工作地：</td>
							<td id="tb6"></td>
						</tr>
						<tr>
							<td>工作：</td>
							<td id="tb7"></td>
						</tr>
						<tr>
							<td>工作类型：</td>
							<td id="tb8"></td>
						</tr>
				</table>
			</div>
			<div style="float: left;width: 30%;">
				<table class="tables">
						<tr>
							<td>是否本专业：</td>
							<td id="tb9"></td>
						</tr>
						<tr>
							<td>是否在本地：</td>
							<td id="tb10"></td>
						</tr>
				</table>
			</div>
		</div></form>
	</div>
</body>
</html>