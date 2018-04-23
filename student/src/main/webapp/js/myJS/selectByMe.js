$(document).ready(function(){
	$().ready(function(){
		$.post("selectByMeIndex.do","",function(data,status){
			var jsonObj = JSON.parse(data);
			for(var i = 0 ; i < jsonObj.schoolNames.length; i++){
				var opt = $('<option>'+jsonObj.schoolNames[i]+'</option>')
				$("#school").append(opt);
			}
			for(var i = 0 ; i < jsonObj.majorNames.length; i++){
				var opt = $('<option>'+jsonObj.majorNames[i]+'</option>')
				$("#major").append(opt);
			}
		});
	});
});

var selectInfoList = new Array();
var showDate = new Array();
var flage = null;
var count = 0;
function resets(){
	selectInfoList.splice(0,selectInfoList.length);
	$("input").removeAttr("disabled");
	$("select").removeAttr("disabled");
	showDate.splice(0,showDate.length);
	flage=null;
	showDate.push({name:'ResultTree',children: []});
	showMessage();
    count = 0;
    $("#dg").empty();
}
function selectList(data){
	if( selectInfoList.length !=0 ){
		for(var i = 0 ; i < selectInfoList.length ; i++ ){
			if( selectInfoList[i].name == data.id ){
				selectInfoList[i].value=$(data).val();
				data.disabled = true;
				break;
			}else{
				if( i == (selectInfoList.length-1) ){
					selectInfoList.push({name:data.id,value:$(data).val()})
					data.disabled = true;
					break;
				}
			}
		}
	}else{
		selectInfoList.push({name:data.id,value:$(data).val()})
		data.disabled = true;
	}
	getInfo($(data).val());
}

function showMessage(){
	var myChart = echarts.init(document.getElementById('showView'));
	var option = {
	        tooltip: {
	            trigger: 'item',
	            triggerOn: 'mousemove'
	        },
	        series: [
	            {
	                type: 'tree',
	                data: [showDate[0]],
	                x: '7%',
	                bottom: '1%',
	                right: '20%',
	                symbolSize: 7,
	                orient: 'horizontal',
	                label: {
	                    normal: {
	                        position: 'left',
	                        verticalAlign: 'middle',
	                        align: 'right',
	                        fontSize: 9
	                    }
	                },
	                leaves: {
	                    label: {
	                        normal: {
	                            position: 'right',
	                            verticalAlign: 'middle',
	                            align: 'left'
	                        }
	                    }
	                },
	                itemStyle: {
	                    normal: {
	                        lineStyle: {
	                            color: '#000',
	                            width: 1,
	                            type: 'curve' // 'curve'|'broken'|'solid'|'dotted'|'dashed'
	                        }
	                    }
	                },
	                rootLocation: {x: 100, y: '60%'}, 
	                nodePadding:50,
	                expandAndCollapse: true,
	                animationDuration: 550,
	                animationDurationUpdate: 750
	            }
	        ]
	    };
	myChart.setOption(option);//加载option
}

function getInfo(selectName){
	$(document).ready(function(){
		$.ajaxSettings.async = false;
		var selectInfoLists = JSON.stringify(selectInfoList);
		//var name ;
		var value ;
		var value2 ;
		$.post("selectByMe.do",{selectInfos:selectInfoLists},function(data,status){
			var jsonObj = JSON.parse( data );
			//name = jsonObj.perCount.name;
			value = jsonObj.perCount.value;
			value2 = jsonObj.perCount2.value;
			if(count == 0){
				var tr1 = $("<tr id = 'name'><td>查询条件：</td></tr>");
				var tr2 = $("<tr id = 'info'><td>符合条件人数：</td></tr>");
				var tr3 = $("<tr id = 'other'><td>不符合条件人数：</td></tr>");
				var tr4 = $("<tr id = 'prop'><td>该条件下占比：</td></tr>");
				var tr5 = $("<tr id = 'propAll'><td>总人数占比：</td></tr>")
				$("#dg").append(tr1);
				$("#dg").append(tr2);
				$("#dg").append(tr3);
				$("#dg").append(tr4);
				$("#dg").append(tr5);
				count = Number(value)+Number(value2);
			}
			var x = 1;
			showDate.push({name:'ResultTree',children: []});
			flage = showDate[0];
			while(x==1){
				if(flage.children[0] == null){
					flage.children[0]={name:selectName,value:jsonObj.perCount.value,children:[]};
					flage.children[1]={name:'非'+selectName,value:jsonObj.perCount2.value,children:[]};
					x++;
				}else{
					flage = flage.children[0];
				}
			}
		});
		showInTable(selectName,value,value2,count);
		$.ajaxSettings.async = true;
	});
	showMessage();
}
function showInTable(name,value,value2,count){
	
	$("#dg").css("display","");
	var prop = value/(Number(value)+Number(value2))
	prop=prop+' ';
	var s = prop.substring(0, 4);
	var propAll = value/count;
	propAll=propAll+' ';
	var ss = propAll.substring(0, 4);
	var th1 = $("<td width='120px;'hight='50px;'>"+name+"</td>");
	var th2 = $("<td width='120px;'hight='50px;'>"+value+"</td>");
	var th3 = $("<td width='120px;'hight='50px;'>"+value2+"</td>");
	var th4 = $("<td width='120px;'hight='50px;'>"+Number(s)*100+"%</td>");
	var th5 = $("<td width='120px;'hight='50px;'>"+Number(ss)*100+"%</td>");
	$("#name").append(th1);
	$("#info").append(th2);
	$("#other").append(th3);
	$("#prop").append(th4);
	$("#propAll").append(th5);
}