//前十专业
function topTenJobDeal(jsonObj){
	var topTenJob = new Array();
	for(var i = 0 ; i < jsonObj.topTenJob.length ;i++ ){
		topTenJob.push({name:jsonObj.topTenJob[jsonObj.topTenJob.length-1-i].factor,value:jsonObj.topTenJob[jsonObj.topTenJob.length-1-i].number});
	}
	return topTenJob;
}
function topTenJob(cityData){
	var myChart = echarts.init(document.getElementById('topTenJob'));
	var option = {
			title: {
		        text: '前十热门专业',
		        x:'center'
		    },
		    xAxis: {
		    	position: 'top',
		        type: 'value',
		        boundaryGap: [0, 0.01]
		    },
		    yAxis: {
		    	splitLine:{  
                    show:false  
                },
		        type: 'category',
		        data: []
		    },
		    series: [{
		        data: [],
		        barWidth:20,
		        itemStyle: {
		        	normal: {
		        		label: {
		        			show: true,
		        			formatter: '{c}'
		        		},
		        		color: function(params) { 
	                        var colorList = ['#C33531','#EFE42A','#64BD3D','#EE9201','#29AAE3', '#B74AE5','#0AAF9F','#E89589','#16A085','#4A235A']; 
	                        return colorList[params.dataIndex] 
	                    }
		        	}
		        },
		        type: 'bar'
		    }]
		};
	
	var topTenJob = new Array();
	topTenJob.push(cityData);
	var s = new Array();
	for( var i = 0 ; i < topTenJob[0].length ; i ++){
		s.push(topTenJob[0][i].name);
	}
	option.yAxis.data=s;
	option.series[0].data=topTenJob[0];
	myChart.setOption(option);//加载option
}
//公司类型与人数变化
function companyTypeandJobDeal(jsonObj){
	var companyTypeandJobAll = new Array();
	for( var k = 0 ; k < jsonObj.compTypeAndJobs[0].length ; k++){
		var companyTypeandJob = new Array();
		for(var i = 0 ; i < jsonObj.compTypeAndJobs.length ;i++ ){
			companyTypeandJob.push({name:jsonObj.compTypeAndJobs[i][k].factor,value:jsonObj.compTypeAndJobs[i][k].number});
		}
		companyTypeandJobAll.push(companyTypeandJob);
	}
	return companyTypeandJobAll;
}

function companyTypeandJob(cityData){
	var myChart = echarts.init(document.getElementById('companyTypeandJob'));
	var option = {
			title: {
		        text: '公司类型与人数变化',
		        x:'center'
		    },
		    legend: {
		    	 type: 'scroll',
		         orient: 'vertical',
		         x: 0,
		         top: 20,
		         bottom: 20,
		         data: []
		         
		    },
		    series: [{
		    	name: [],
		        data: [],
		        radius : '50%',
	            center: ['50%', '60%'],
		        itemStyle : { normal: {label : {show: true,formatter: '{b}{d}%'}}},
		        type: 'pie'
		    },
		    {
		    	name: [],
		        data: [],
		        itemStyle : { normal: {label : {show: true,formatter: '{b}{d}%'}}},
		        type: 'pie'
		    },
		    {
		    	name: [],
		        data: [],
		        itemStyle : { normal: {label : {show: true,formatter: '{b}{d}%'}}},
		        type: 'pie'
		    },
		    {
		    	name: [],
		        data: [],
		        itemStyle : { normal: {label : {show: true,formatter: '{b}{d}%'}}},
		        type: 'pie',
		    },
		    {
		    	name: [],
		        data: [],
		        itemStyle : { normal: {label : {show: true,formatter: '{b}{d}%'}}},
		        type: 'pie'
		    }]
		};
	
	var companyTypeandJob = new Array();
	companyTypeandJob.push(cityData);
	var date = new Date();
	var year = new Array();
	for(var i = 0 ; i < 5 ; i++){
		year.push(date.getFullYear()-i);
		option.series[i].name=date.getFullYear()-i;
	}
	var s = new Array();
	s.push({2017:false,2016:false,2015:false,2014:false});
	option.legend.data=year;
	option.legend.selected=s[0]
	option.series[0].data=companyTypeandJob[0][0];
	option.series[1].data=companyTypeandJob[0][1];
	option.series[2].data=companyTypeandJob[0][2];
	option.series[3].data=companyTypeandJob[0][3];
	option.series[4].data=companyTypeandJob[0][4];
	myChart.setOption(option);//加载option
}
//历届毕业生人数处理
function successiveGraduationDeal(jsonObj){
	var successiveGraduation = new Array();
	var year = new Array();
	var number = new Array();
	var now = new Date(); 
    for(var i = 0 ; i < 5 ; i++ ){
    	var newYear = now.getFullYear()-4+i;
    	var count = 0;
    	for(var j = 0 ; j < jsonObj.successiveGraduation.length ; j++){
    		if( jsonObj.successiveGraduation[j].year == newYear ){
    			year.push(jsonObj.successiveGraduation[j].year);
    			number.push(jsonObj.successiveGraduation[j].number);
    			break;
    		}else{
    			count++;
    			if(count == jsonObj.successiveGraduation.length){
    				year.push(newYear);
        			number.push(0);
    			}
    			continue;
    		}
    	}
	}
	successiveGraduation.push(year);
	successiveGraduation.push(number);
	return successiveGraduation;
}

function successiveGraduation(cityData){
	var myChart = echarts.init(document.getElementById('successiveGraduation'));
	var option = {
			title: {
		        text: '历届毕业生统计人数'
		    },
		    xAxis: {
		    	splitLine:{  
                    show:false  
                },
		    	boundaryGap : false,
		        type: 'category',
		        data: [],
                name: "(年)"
		    },
		    yAxis: {
		        type: 'value',
		        name: "(人)"
		    },
		    series: [{
		        data: [],
		        itemStyle : { normal: {label : {show: true}}},
		        type: 'line'
		    }]
		};
	
	var successiveGraduation = new Array();
	successiveGraduation.push(cityData);
	option.xAxis.data=successiveGraduation[0][0];
	option.series[0].data=successiveGraduation[0][1];
	myChart.setOption(option);//加载option
}
//三种类型历年人数变化处理
function threeTypeChangeDeal(jsonObj){
	var threeTypeChangeAll = new Array();
	for( var k = 0 ; k < 3 ; k++){
		var threeTypeChange = new Array();
		var year = new Array();
		var number = new Array();
		var now = new Date();
		for(var i = 0 ; i < 5 ; i++ ){
			var newYear = now.getFullYear()-4+i;
	    	var count = 0;
			for( var j = 0 ; j < jsonObj.threeTypeChange[k].length ; j++ ){
				if(jsonObj.threeTypeChange[k][j].year == newYear){
					year.push(jsonObj.threeTypeChange[k][j].year);
					number.push(jsonObj.threeTypeChange[k][j].number);
					break;
				}else{
					count++;
					if(count == jsonObj.threeTypeChange[k].length){
						year.push(newYear);
						number.push(0)
					}
					continue;
				}
			}
		}
		threeTypeChange.push(year);
		threeTypeChange.push(number);
		threeTypeChangeAll.push(threeTypeChange);
	}
	return threeTypeChangeAll;
}

function threeTypeChange(cityData){
	var myChart = echarts.init(document.getElementById('threeTypeChange'));
	var option = {
			title: {
		        text: '就业选择变化'
		    },
		    legend: {
		        data:['就业','继续深造','不确定']
		    },
		    xAxis: {
		    	splitLine:{  
                    show:false  
                },
		    	boundaryGap : false,
		        type: 'category',
		        data: [],
                name: "(年)"
		    },
		    yAxis: {
		        type: 'value',
		        name: "(人)"
		    },
		    series: [{
		    	name: '就业',
		        data: [],
		        itemStyle : { normal: {label : {show: true,position:'top'}}},
		        type: 'line'
		    },
		    {
		    	name: '继续深造',
		        data: [],
		        itemStyle : { normal: {label : {show: true,position:'left'}}},
		        type: 'line'
		    },
		    {
		    	name: '不确定',
		        data: [],
		        itemStyle : { normal: {label : {show: true,position:'right'}}},
		        type: 'line'
		    }]
		};
	
	var threeTypeChange = new Array();
	threeTypeChange.push(cityData);
	option.xAxis.data=threeTypeChange[0][0][0];
	option.series[0].data=threeTypeChange[0][0][1];
	option.series[1].data=threeTypeChange[0][1][1];
	option.series[2].data=threeTypeChange[0][2][1];
	myChart.setOption(option);//加载option
}
//就业率处理
function employmentRateDeal(jsonObj){
	var employmentRate = new Array();
	var now = new Date();
	for(var i = 0 ; i < 5 ; i++ ){
		var boy = new Array();
		var gril = new Array();
		var total = new Array();
		var newYear = now.getFullYear()-4+i;
		var count = 0;
		for( var j = 0 ; j < jsonObj.employmentRate.length ; j++ ){
			count++;
			if( (jsonObj.employmentRate[j].year == newYear) && (jsonObj.employmentRate[j].factor == "男") ){
				boy.push(jsonObj.employmentRate[j].year);
				boy.push(jsonObj.employmentRate[j].number);
				continue;
			}else if( (jsonObj.employmentRate[j].year == newYear) && (jsonObj.employmentRate[j].factor == "女") ){
				gril.push(jsonObj.employmentRate[j].year);
				gril.push(jsonObj.employmentRate[j].number);
				continue;
			}else if( ((jsonObj.employmentRate[j].year == newYear) && (jsonObj.employmentRate[j].factor =="")) ){
				total.push(jsonObj.employmentRate[j].year);
				total.push(jsonObj.employmentRate[j].number);
				continue;
			}else{
				continue;
			}
		}
		if( (boy.length-1) != (2*j) ){
			boy.push(newYear);
			boy.push(0);
		}
		if( (gril.length-1) != j ){
			gril.push(newYear);
			gril.push(0);
		}
		if( (total.length-1) != j ){
			total.push(newYear);
			total.push(0);
		}
		employmentRate.push(boy);
		employmentRate.push(gril);
		employmentRate.push(total);
	}
	return employmentRate;
}
function employmentRate(cityData){
	var myChart = echarts.init(document.getElementById('employmentRate'));
	var option = {
			title: {
		        text: '就业率变化'
		    },
		    legend: {
		        data:['男','女','综合']
		    },
		    xAxis :[{
		    		splitLine:{  
		    			show:false  
		    		},
		            type : 'category',
		            data : []
		        }],
		    yAxis :[
		        {	
		        	splitLine:{  
	                    show:false  
	                },
			    	boundaryGap : false,
		            type : 'value',
		            min: '0',
		            max : '1'
		        }],
		    series : [
		        {
		            name:'男',
		            stack: '男',
		            type:'bar',
		            data:[]
		        },
		        {
		            name:'女',
		            type:'bar',
		            stack: '女',
		            data:[]
		        },
		        {
		            name:'综合',
		            type:'bar',
		            stack: '综合',
		            data:[]
		        }]
	};
	
	var employmentRate = new Array();
	employmentRate.push(cityData);
	var data = new Array();
	var boy = new Array();
	var gril = new Array();
	var total = new Array();
	for( var i = 1 ; i <= employmentRate[0].length ; i++ ){
		if( i % 3 == 1){
			data.push(employmentRate[0][i-1][0]);
			boy.push(employmentRate[0][i-1][1]);
		}
		if(i % 3 == 2){
			gril.push(employmentRate[0][i-1][1]);
		}
		if(i % 3 == 0){
			total.push(employmentRate[0][i-1][1]);
		}
	}
	
	option.xAxis[0].data=data;
	option.series[0].data=boy
	option.series[1].data=gril;
	option.series[2].data=total;
	myChart.setOption(option);//加载option
}
//本专业人数处理
function majorJobRateDeal(jsonObj){
	var majorJobRate = new Array();
	var year = new Array();
	var number = new Array();
	var now = new Date(); 
    for(var i = 0 ; i < 5 ; i++ ){
    	var newYear = now.getFullYear()-4+i;
    	var count = 0;
    	for(var j = 0 ; j < jsonObj.isMajorJob.length ; j++){
    		if( jsonObj.isMajorJob[j].year == newYear ){
    			year.push(jsonObj.isMajorJob[j].year);
    			number.push(jsonObj.isMajorJob[j].number);
    			break;
    		}else{
    			count++;
    			if(count == jsonObj.isMajorJob.length){
    				year.push(newYear);
        			number.push(0);
    			}
    			continue;
    		}
    	}
	}
    majorJobRate.push(year);
    majorJobRate.push(number);
	return majorJobRate;
}

function majorJobRate(cityData){
	var myChart = echarts.init(document.getElementById('majorJobRate'));
	var option = {
			title: {
		        text: '本专业就业率'
		    },
		    xAxis: {
		    	splitLine:{  
                    show:false  
                },
		    	boundaryGap : false,
		        type: 'category',
		        data: [],
                name: "(年)"
		    },
		    yAxis: {
		        type: 'value',
		        name: "(100%)"
		    },
		    series: [{
		        data: [],
		        itemStyle : { normal: {label : {show: true}}},
		        type: 'line'
		    }]
		};
	
	var majorJobRate = new Array();
	majorJobRate.push(cityData);
	option.xAxis.data=majorJobRate[0][0];
	option.series[0].data=majorJobRate[0][1];
	myChart.setOption(option);//加载option
}
//实习与就业人数处理
function trainAndJobDeal(jsonObj){
	var trainAndJob = new Array();
	var year = new Array();
	var number = new Array();
    for(var i = 0 ; i < 12 ; i++ ){
    	var newMonth = 12-11+i;
    	var count = 0;
    	for(var j = 0 ; j < jsonObj.trainAndJob.length ; j++){
    		if( jsonObj.trainAndJob[j].factor == newMonth ){
    			year.push(jsonObj.trainAndJob[j].factor+"个月");
    			number.push({name:jsonObj.trainAndJob[j].factor+"个月",value:jsonObj.trainAndJob[j].number});
    			break;
    		}else{
    			count++;
    			if(count == jsonObj.trainAndJob.length){
    				year.push(newMonth+"个月");
    				//number.push({name:newMonth+"月",value:0})
    			}
    			continue;
    		}
    	}
	}
    trainAndJob.push(year);
    trainAndJob.push(number);
	return trainAndJob;
}

function trainAndJob(cityData){
	var myChart = echarts.init(document.getElementById('trainAndJob'));
	var option = {
		    title : {
		        text: '实习时长与就业',
		        x:'center'
		    },/*
		    tooltip : {
		        trigger: 'item'
		    },*/
		    legend: {
		        y: 40,
		        bottom: 100,
		        orient: 'vertical',
		        x: 0,
		        data: []
		    },
		    series : [
		        {
		            name: '访问来源',
		            type: 'pie',
		            radius : '50%',
		            center: ['50%', '60%'],
		            data:[],
		            itemStyle : { normal: {label : {show: true,formatter: '{b}{d}%'}}},
		        }
		    ]
};
	
	var trainAndJob = new Array();
	trainAndJob.push(cityData);
	option.legend.data=trainAndJob[0][0];
	option.series[0].data=trainAndJob[0][1];
	option.legend.left = 'left';
	myChart.setOption(option);//加载option
}
function getCityInfo(){
	var cityInfo = new Array();
	var successiveGraduation1 = new Array();
	var threeTypeChanege1 = new Array();
	var employmentRate1 = new Array();
	var majorJobRate1 = new Array();
	var trainAndJob1 = new Array();
	var companyTypeandJob1 = new Array();
	var topTenJob1 = new Array();
	$(document).ready(function(){
		$.ajaxSettings.async = false;
		$.post("cityInfoGet.do","",function(data,status){
				var jsonObj = JSON.parse( data );
				successiveGraduation1 = successiveGraduationDeal(jsonObj);
				threeTypeChanege1 = threeTypeChangeDeal(jsonObj);
				employmentRate1 = employmentRateDeal(jsonObj);
				majorJobRate1 = majorJobRateDeal(jsonObj);
				trainAndJob1 = trainAndJobDeal(jsonObj);
				companyTypeandJob1 = companyTypeandJobDeal(jsonObj);
				topTenJob1 = topTenJobDeal(jsonObj);
			});
		$.ajaxSettings.async = true;
	});
	cityInfo.push(successiveGraduation1);
	cityInfo.push(threeTypeChanege1);
	cityInfo.push(employmentRate1);
	cityInfo.push(majorJobRate1);
	cityInfo.push(trainAndJob1);
	cityInfo.push(companyTypeandJob1);
	cityInfo.push(topTenJob1);
	successiveGraduation(cityInfo[0]);
	threeTypeChange(cityInfo[1]);
	employmentRate(cityInfo[2]);
	majorJobRate(cityInfo[3]);
	trainAndJob(cityInfo[4]);
	companyTypeandJob(cityInfo[5]);
	topTenJob(cityInfo[6]);
	
}
function showCityInfo(){
	getCityInfo();
}