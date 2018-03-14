<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/default/easyui.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/themes/icon.css" type="text/css" />
	<link rel="stylesheet" href="./../js/jquery-easyui-1.5.4/demo/demo.css" />
	<link rel="stylesheet" href="./../css/cityInfo.css" />
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/datagrid-detailview.js"></script>
    <script type="text/javascript" src="./../js/echarts/echarts.min.js"></script>
	<script type="text/javascript" src="./../js/echarts/echarts-gl.min.js"></script>
	<script type="text/javascript" src="./../js/echarts/echarts-all.js"></script>
	<script type="text/javascript" src="./../js/myJS/cityInfo.js"></script>
</head>
<body onload="showCityInfo()" >
<%
String cityName = session.getAttribute("cityName").toString(); //从session里把a拿出来
%>  
	<div id="head">
		<h2><%=cityName%>毕业生就业情况</h2>
	</div>
	<div id="successiveGraduation"></div>
	<div id="topTenJob"></div>
	<div id="companyTypeandJob"></div>
	<div id="threeTypeChange"></div>
	<div id="employmentRate"></div>
	<div id="trainAndJob"></div>
	<div id="majorJobRate"></div>
	
	
	
</body>
</html>