<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table id="dg" class="easyui-datagrid"></table>
	<div id = "tb">
		<div>
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain ="true" onclick="obj.add()">添加</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain ="true" onclick="obj.edit()">修改</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain ="true" onclick="obj.remove()">删除</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain ="true" 
				style="display: none" id = "save" onclick = "obj.save()">保存</a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-redo" plain ="true" 
				style="display: none" id = "redo"onclick="obj.redo()">取消编辑</a>
		</div>
		<div>
			工作名称：<input type="text" name = "jobName">
			<!-- 创建时间:<input class="easyui-datebox" type="text" name="createTime">
			到<input class="easyui-datebox" type="text" name="endTime"> -->
			<a href="#" class="easyui-linkbutton" iconCls = "icon-search" plain = "true" onclick="obj.search()">查询</a>
		</div>
	</div>
</body>
</html>