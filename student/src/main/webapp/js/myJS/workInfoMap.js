function getWorkInfo(){
	var infoList = new Array();
	var workInfo = new Array();
	var unknowInfo = new Array();
	var continueInfo = new Array();
	$(document).ready(function(){
		$().ready(function(){
			$.ajaxSettings.async = false;
			$.post("workInfoMap.do","",function(data,status){
				var jsonObj = JSON.parse( data ); 
				for(var j = 0 ; j < jsonObj.infoMapList.length ; j++ ){
						workInfo[j] = {name: jsonObj.infoMapList[j].name,value: jsonObj.infoMapList[j].value};
						unknowInfo[j] = {name: jsonObj.unknowList[j].name,value: jsonObj.unknowList[j].value};
						continueInfo[j] = {name: jsonObj.continueList[j].name,value: jsonObj.continueList[j].value};
				}
			});
			$.ajaxSettings.async = true;
		});
	});
	infoList.push(workInfo)
	infoList.push(unknowInfo)
	infoList.push(continueInfo)
	return infoList;
}
function as(){
	var sss=new Array();
	sss=[{name: '北京',value: Math.round(Math.random()*1000)},{name: '澳门',value: Math.round(Math.random()*1000)}];
	return sss;
} 
function showmap(){
		//加载数据开始
		//var datas=[100,200];
		//加载数据结束
		var myChart = echarts.init(document.getElementById('main'));
		var option = {
		    title : {
		        text: '应届生就业信息',
		        x:'center'
		    },
		    tooltip : {
		        trigger: 'item'
		    },
		    legend: {
		        orient: 'vertical',
		        x:'left',
		        data:['就业','继续深造','未确定']
		    },
		    dataRange: {
		        min: 0,
		        max: 2500,
		        x: 'left',
		        y: 'bottom',
		        text:['高','低'],           // 文本，默认为数值文本
		        calculable : true
		    },
		    series : [
		           {
		            name: '就业',
		            type: 'map',
		            mapType: 'china',
		            roam: false,
		            itemStyle:{
		                normal:{label:{show:true}},
		                emphasis:{label:{show:true}}
		            },
		            data: []
		        },
		        {
		            name: '继续深造',
		            type: 'map',
		            mapType: 'china',
		            itemStyle:{
		                normal:{label:{show:true}},
		                emphasis:{label:{show:true}}
		            },
		            data:[]
		        },
		        {
		            name: '未确定',
		            type: 'map',
		            mapType: 'china',
		            itemStyle:{
		                normal:{label:{show:true}},
		                emphasis:{label:{show:true}}
		            },
		            data:[]
		        }
		    ]
		};
		
		//加载异步数据
		var  nidsye1 = new Array();
		nidsye1.push(getWorkInfo());
		option.series[0].data=nidsye1[0][0]//设置data
		option.series[1].data=nidsye1[0][1]
		option.series[2].data=nidsye1[0][2]
 		myChart.setOption(option);//加载option
		
 		myChart.on('click', function (params) {
 			console.log(params);
 			$().ready(function(){
 				$.post("cityInfo",
 						{
 							cityName:params.name
 						},
 						function(data,status){
 							window.location.href="http://localhost:8080/student/showMessage/cityInfo"
 							//parent.window.document.getElementById("showView").src="http://localhost:8080/student/showMessage/cityInfo"
 				});
 			});
 			
 				
 		});	
 		
}