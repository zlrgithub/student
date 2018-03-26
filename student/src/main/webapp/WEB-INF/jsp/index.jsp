<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome page</title>
<link rel="stylesheet" href="js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
<link rel="stylesheet" href="js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
<link rel="stylesheet" href="css/index.css" type="text/css" />
<script type="text/javascript" src="js/jquery-easyui-1.5.4/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/myJS/index.js"></script>
</head>
<body>
 	<div class="page-container">
    	<h1>就业信息系统</h1>
        <form action="./user/login" method="post">
        	<input type="text" name="name" placeholder="Username"  onchange="pass()">
            <input id="password" type="text" name="password" placeholder="Password">
            <select name = 'roleType' id="roleType">
				<option value = "学生">学生</option>
				<option value = "企业人员">企业人员</option>
			</select>
            <button type="submit">Sign In</button>
            <button type="button" onclick="register()">Regist</button>
            <div class="error"><span>+</span></div>
         </form>
     </div>
</body>
</html>