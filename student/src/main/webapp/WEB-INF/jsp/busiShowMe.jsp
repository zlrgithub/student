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
	<link rel="stylesheet" href="./../css/busiShowMe.css" />
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/datagrid-detailview.js"></script>
	<script type="text/javascript" src="./../js/myJS/busiShowMe.js"></script>
</head>
<body>
	<div><form id="form1" action="showMe.do" method="post">
		<div style="width: 80%" align="left">
			<a id="a1" class="easyui-linkbutton" style="width: 100px;">修改用户信息</a>
			<a id="a2" class="easyui-linkbutton" style="width: 100px;display: none;">保存信息</a>
		</div>
		<br><br>
		<div align="left" style="width: 100%;height:400px; ;float: left;">

			<div style="float: left;width: 55%;" align="right">
				<table class="tables">
						<tr>
							<td>账号：</td>
							<td id="tb1"></td>
						</tr>
						<tr>
							<td>姓名：</td>
							<td id="tb2"></td>
						</tr>
						<tr>
							<td>职位：</td>
							<td id="tb3"></td>
						</tr>
						<tr>
							<td>部门：</td>
							<td id="tb4"></td>
						</tr>
						<tr>
							<td>电话：</td>
							<td id="tb5"></td>
						</tr>
						<tr>
							<td>Email：</td>
							<td id="tb6"></td>
						</tr>
						<tr>
							<td>公司名称：</td>
							<td id="tb7"></td>
						</tr>
						<tr>
							<td>公司类型：</td>
							<td id="tb8"></td>
						</tr>
						<tr>
							<td>公司地址：</td>
							<td id="tb9"></td>
						</tr>
						<tr>
							<td>公司网站：</td>
							<td id="tb11"></td>
						</tr>
						<tr>
							<td>公司简介：</td>
							<td id="tb10"></td>
						</tr>
				</table>
			</div>
		</div>
	</form></div>
</body>
</html>