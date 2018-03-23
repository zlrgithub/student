var selectInfoList = new Array();
var showDate = new Array();
var flage = null;
function resets(){
	selectInfoList.splice(0,selectInfoList.length);
	showDate.splice(0,showDate.length);
	flage=null;
	showMessage();
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
	getInfo();
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
	                            type: 'broken' // 'curve'|'broken'|'solid'|'dotted'|'dashed'
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

function getInfo(){
	$(document).ready(function(){
		$.ajaxSettings.async = false;
		var selectInfoLists = JSON.stringify(selectInfoList);
		var name ;
		var value ;
		$.post("selectByMe.do",{selectInfos:selectInfoLists},function(data,status){
			var jsonObj = JSON.parse( data );
			name = jsonObj.perCount.name;
			value = jsonObj.perCount.value;
			value2 = jsonObj.perCount2.value;
			showDate.push({name:'root',children: []});
			var x = 1;
			flage = showDate[0];
			while(x==1){
				if(flage.children[0] == null){
					flage.children[0]={name:jsonObj.perCount.name,value:jsonObj.perCount.value,children:[]};
					flage.children[1]={name:jsonObj.perCount2.name,value:jsonObj.perCount2.value,children:[]};
					x++;
				}else{
					flage = flage.children[0];
				}
			}
		});
		showInTable(name,value,value2);
		$.ajaxSettings.async = true;
	});
	showMessage();
}
function showInTable(name,value,value2){
	$("#dg").css("display","");
	var tr1 = $("#name");
	var tr2 = $("#info");
	var tr3 = $("#other");
	var tr4 = $("#prop");
	var prop = value/(Number(value)+Number(value2))
	prop=prop+' ';
	var s = prop.substring(0, 4)
	var th1 = $("<th width='120px;'hight='50px;'>"+name+"</th>");
	var th2 = $("<th width='120px;'hight='50px;'>"+value+"</th>");
	var th3 = $("<th width='120px;'hight='50px;'>"+value2+"</th>");
	var th4 = $("<th width='120px;'hight='50px;'>"+Number(s)*100+"%</th>");
	tr1.append(th1);
	tr2.append(th2);
	tr3.append(th3);
	tr4.append(th4);
}