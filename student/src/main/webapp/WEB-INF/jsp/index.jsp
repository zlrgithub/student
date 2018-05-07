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
    	<img src="image/index/index3.png" />
        <form action="./user/login" method="post">
        	<input id="username" type="text" name="name" placeholder="Username"  onchange="pass()" onblur="check()">
        	<span id='alr'></span>
            <input id="password" type="text" name="password" placeholder="Password" onblur="check2()">
            <span id='alr2'></span>
            <select name = 'roleType' id="roleType">
				<option value = "学生">学生</option>
				<option value = "企业人员">企业人员</option>
				<option value = "管理员">管理员</option>
			</select><br>
            <button type="submit">Sign In</button>
            <button type="button" onclick="register()">Regist</button>
            <div class="error"><span>+</span></div>
         </form>
     </div>
</body>
</html>