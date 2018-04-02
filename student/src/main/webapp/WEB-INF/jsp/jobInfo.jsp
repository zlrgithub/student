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
	<link rel="stylesheet" href="./../css/jobInfo.css" />
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="./../js/jquery-easyui-1.5.4/datagrid-detailview.js"></script>
    <script type="text/javascript" src="./../js/echarts/echarts.min.js"></script>
	<script type="text/javascript" src="./../js/echarts/echarts-gl.min.js"></script>
	<script type="text/javascript" src="./../js/echarts/echarts-all.js"></script>
	<script type="text/javascript" src="./../js/myJS/jobInfo.js"></script>
</head>
<body>
	<!-- <h2>2018年大学生招聘信息</h2> -->
	<div style="margin:20px 0;"></div>
	<div style="width:100%;height:950px;background-color: white;">
		<div style="width: 30%;height:800px;float: left;">
			<div style="width: 100%;height: 40%;">
				<!-- <div style="width: 100%;height: 10%;float: left;padding-top: 10px;" align="center">
					<h2>招聘日历</h2>
				</div> -->
				<div id="cc" class="easyui-calendar" style="width: 100%;height:90%;padding: 10px;float: left;"></div>
			</div>
			<div style="width: 100%;height: 60%;">
				<div style="width: 100%;height: 55%">
					<div style="height: 20%;width: 100%">
						<img src="./../image/jobInfo/jobInfo.png">
					</div>
					<div style="width: 100%;height: 75%;padding-top: 10px;">
						<div style="width: 50%;height: 100%;float: left;" align="left">
							<a href="http://www.jobtest.com.cn/online/test.htm"><img src="./../image/jobInfo/jobInfo4.png"></a>
							<br><a href="http://wzb.dept.ccut.edu.cn/"><img src="./../image/jobInfo/jobInfo3.png"></a>
						</div>
						<div style="width: 50%;height: 100%;float: left;" align="right">
							<a href="http://xlzx.zt.ccut.edu.cn/"><img src="./../image/jobInfo/jobInfo2.png"></a>
						</div>
					</div>
				</div>
				<div style="width:100%;height:45%;">
					<div style="width:100%;background-color: #a90d0d;vertical-align: top;">
						<font style="color:white; font-size: 15px;">我的位置</font>
					</div>
					<img class="img3" onclick="javascript:window.open('http://map.baidu.com/?latlng=43.860453,125.296&amp;title='+encodeURIComponent('长春工业大学')+'&amp;autoOpen=true&amp;l');" src="http://api.map.baidu.com/staticimage/v2?ak=xFXFMkIXXsPyzlt3ubUCwasP&amp;mcode=666666&amp;center=125.296,43.860453&amp;width=425&amp;height=250&amp;zoom=15" style="width:338px;height:200px;border:#ccc solid 1px; border-radius: 3px;cursor: pointer" id="map">
				</div>
			</div>
		</div>
		<div style="width:70%;height:800px;float: left;">
			<div style="width: 100%;height: 40%;padding-left: 10px;">
				<div style="width: 100%;background-color: #a90d0d">
					<font style="color:white; font-size: 15px;">企业信息</font>
					<a href="" style="color: black;">更多</a>
				</div >
				<div style="width: 100%;height: 100%">
					<div id = "companyInfoShow" style="width: 50%;height:100%;">
					</div>
					<div id = "companyInfoShow" style="width: 50%;height:100%;">
					
					</div>
				</div>
			</div>
			<div style="width: 100%;height: 60%;padding-left: 10px;">
				<div style="width: 100%;background-color: #a90d0d">
					<font style="color:white; font-size: 15px;">职位信息</font>
					<a href="" style="color: black;">更多</a>
				</div >
				<div id = "jobInfoShow" style="width: 100%;"></div>
			</div>
		</div>
		<div style="width:100%;height:100px; float:left;padding-top: 10px;">
			<!-- <hr style="border-color: red;width: 100%"/> -->
			<div style="width: 100%;background-color: #a90d0d">
				<font style="color:white; font-size: 15px;">友情链接</font>
			</div >
			<table style="width: 100%;">
				<tr>
					<td colspan="2"><a title="全国大学生创业服务网" href="http://cy.ncss.org.cn/"><img class="img2" src="./../image/jobInfo/job2.png"></a></td>
					<td colspan="2"><a title="新职业网" href="http://www.ncss.org.cn/"><img class="img2" src="./../image/jobInfo/job3.png"></a></td>
					<td colspan="2"><a title="学信就业" href="http://job.chsi.cn/"><img class="img2" src="./../image/jobInfo/job4.png"></a></td>
					<td colspan="2"><a title="吉林省人力资源开发管理云平台" href="http://jtiaotiao.com/index.php/component/jobfair/?school_id=5"><img class="img2" src="./../image/jobInfo/job5.png"></a></td>
					<td colspan="2"><a title="国际组织实习任职信息服务平台" href="http://gj.ncss.org.cn/"><img class="img2" src="./../image/jobInfo/job6.png"></a></td>
					<td colspan="2"><a title="应届生求职网" href="http://www.yingjiesheng.com/"><img class="img2" src="./../image/jobInfo/job7.png"></a></td>
				</tr>
				<tr>
					<td colspan="2"><a title="智联招聘" href="http://www.zhaopin.com/"><img class="img2" src="./../image/jobInfo/job8.png"></a></td>
					<td colspan="2"><a title="佛山人才网" href="http://www.fsrcw.com.cn/"><img class="img2" src="./../image/jobInfo/job9.png"></a></td>
					<td colspan="2"><a title="中国企业人才信息网" href="http://www.zgqyhr.com/"><img class="img2" src="./../image/jobInfo/job1.png"></a></td>
					<td colspan="2"><a title="长春创业就业博览会" href="http://cyjy.changchun.gov.cn/"><img class="img2" src="./../image/jobInfo/job10.png"></a></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>