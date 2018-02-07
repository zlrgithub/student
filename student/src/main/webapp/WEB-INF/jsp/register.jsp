<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert page</title>
<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
<link rel="stylesheet"  href="./../js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
<link rel="stylesheet"  href="./../css/register.css" type="text/css" />
<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="./../js/myJS/register.js"></script>
</head>
<body>
	<div style="position:absolute; width: 99%; height: 98%;text-align: center;">
	<form id="ff" action="./regeist" method="post">
		<table>
			<tr>
				<td colspan="2" style="red;padding-left: 100px">
					<h1>用户注册</h1>
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			<tr>
				<td class = "td">用户名：</td>
				<td><input name="name" type="text"></input></td>
			</tr>
			<tr>
				<td class = "td">密码：</td>
				<td><input name="password" type="text"></input></td>
			</tr>
			<tr>
				<td class = "td">确认密码:</td>
				<td><input name="password2" type="text"></input></td>
			</tr>
			<tr>
				<td colspan="2" style="padding-left: 100px">
					<button id = "cancel" type="reset" onclick="turnback()">返回</button>
					<button type="submit">注册</button>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>