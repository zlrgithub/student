<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"
		+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<title>student</title>
<head>
	<link rel="stylesheet"
		href="js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
	<link rel="stylesheet" href="js/jquery-easyui-1.5.4/themes/icon.css"
		type="text/css" />
	<script type="text/javascript"
		src="js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript"
		src="js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript"
		src="js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">	
      $(function(){
          //console.info($('#dd2'));
          /*使用JavaScript动态创建EasyUI的Dialog的步骤：
          1、定义一个div，并给div指定一个id
          2、使用Jquery选择器选中该div，然后调用dialog()方法就可以创建EasyUI的Dialog
          */
          $('#dd2').dialog();//使用默认的参数创建EasyUI的Dialog
          //使用自定义参数创建EasyUI的Dialog
          $('#dd3').dialog({
              title: '使用JavaScript创建的Dialog',
              width: 400,
              height: 200,
              closed: false,
              cache: false,
              modal: true
          });
      });
  </script>
</head>
<body>
	
      <%--使用纯html的方式创建创建EasyUI的Dialog的步骤：
      1、定义一个div
      2、将div的class样式属性设置成easyui-dialog，这样就可以将普通的div变成EasyUI的Dialog了
       --%>
    <div class="easyui-dialog" id="dd1" title="EasyUI Dialog" style="width: 500px;height: 300px;">
        Hello World!
    </div>
    <div id="dd2">Dialog Content</div>
    <div id="dd3">Dialog Content</div>
  </body>
</html>
