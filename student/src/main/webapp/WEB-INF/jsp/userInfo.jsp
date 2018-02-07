<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert User Message</title>
<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
<div style="position:absolute; width: 99%; height: 98%;text-align: center;">
	<form id="userMssage" action="./InsertUserMessage" method="post">
		<table>
			<tr>
				<td style="text-align: right;">用户编码:</td>
				<td><input name="userId" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;">学校名称:</td>
				<td><input name="school" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;" >专业:</td>
				<td><input name="major" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;">专业水平:</td>
				<td><input name="prefStandards" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;">工作地:</td>
				<td><input name="workspace" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;">工作:</td>
				<td><input name="work" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;">工作类型:</td>
				<td><input name="companyType" type="text"></input></td>
			</tr>
			<tr>
				<td style="text-align: right;">是否从事本专业:</td>
				<td>
					<input name="isMajor" type="radio" value="是" checked="checked"></input>
					<input name="isMajor" type="radio" value="否"></input>
				</td>
			</tr>
			<tr>
				<td style="text-align: right;">是否在本地:</td>
				<td>
					<input name="isLocal" type="radio" value="是" checked="checked"></input>
					<input name="isLocal" type="radio" value="否"></input>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="提交"></input></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>