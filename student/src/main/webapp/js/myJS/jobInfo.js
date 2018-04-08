var proview = 0;
var next = 1;
	
$(document).ready(function(){
	$('#proview').click(function(){
		if(proview != 0){
			proview--;
			next--;
			a();
		}else{
			proview = 4;
			next = 5;
		}
	});
});
$(document).ready(function(){
	$('#next').click(function(){
		if(next <= 5){
			proview++;
			next++;
			a();
		}else{
			proview=0;
			next=1;
		}
	});
});

function a () {
	var jsonObj = null;
	$.post("showBusiInfo.do", {low:JSON.stringify(proview),height:JSON.stringify(next)},function(data, status) {
		jsonObj = JSON.parse(data);
		if ( jsonObj!= null && jsonObj.length>0 ){
			$('#tb').empty();
			for (var i = 0; i < jsonObj.length; i++) {
				if(jsonObj.length[i+1]!=null){
					var tr = $("<tr><td class = \"td2\">" + jsonObj[i].createtime + "</td>"+
							"<td class = \"td3\"><a href='"+jsonObj[i].jobIntruduce+"'>"+jsonObj[i].jobName+"</td>"+
							"<td class = \"td2\">" + jsonObj[i+1].createtime + "</td>"+
							"<td class = \"td3\"><a href='"+jsonObj[i].jobIntruduce+"'>"+jsonObj[i].jobName+"</td></tr><tr></tr");
					$('#tb').append(tr);
				}else{
					var tr = $("<tr><td class = \"td2\">" + jsonObj[i].createtime + "</td>"+
							"<td class = \"td3\"><a href='"+jsonObj[i].jobIntruduce+"'>"+jsonObj[i].jobName+"</td>"+
							"<td class = \"td2\"></td><td class = \"td3\"></td></tr><tr></tr");
					$('#tb').append(tr);
				}
			}
		}else{
		}
	});
}
	

function jobTotal () {
	var jsonObj = null;
	$.ajaxSettings.async = false;
	$.post("showJobInfoTotal.do", {low:JSON.stringify(proview),height:JSON.stringify(next)},function(data, status) {
		jsonObj = JSON.parse(data);
	});
	$.ajaxSettings.async = true;
	return jsonObj;
}
function c(){
	var ss = jobTotal();
	$('#box').paging({
	    initPageNo: 1, // 初始页码
	    totalPages:ss.page, //总页数
	    totalCount: '合计'+ss.total+'条数据', // 条目总数
	    slideSpeed: 600, // 缓动速度。单位毫秒 
	    callback: function(page) { // 回调函数 
	        console.log(page);
	        $('#tb2').empty();
	       $.post("showJobInfo.do",{page:JSON.stringify(page)},function(data, status) {
	    		jsonObj = JSON.parse(data);
	    		if ( jsonObj!= null && jsonObj.length>0 ){
	    			var bar = $("<tr><td class=\"td4\">公司名称</td><td class=\"td4\">岗位</td>"
						+"<td class=\"td4\">招聘人数</td><td class=\"td4\">薪资</td>"
						+"<td class=\"td4\">Email</td><td class=\"td4\">电话</td>"
						+"<td class=\"td4\">结束时间</td></tr>")
					$('#tb2').append(bar)
	    			for( var i = 0 ;i<jsonObj.length ; i++ ){
	    				var tr = $("<tr><td class=\"td4\">"+jsonObj[i].jobIntruduce+"</td>" +
	    						"<td class=\"td4\">"+jsonObj[i].jobName+"</td>" +
	    						"<td class=\"td4\">"+jsonObj[i].number+"</td>" +
	    						"<td class=\"td4\">"+jsonObj[i].salary+"</td>" +
	    						"<td class=\"td4\">"+jsonObj[i].jobOrder+"</td>" +
	    						"<td class=\"td4\">"+jsonObj[i].publish+"</td>" +
	    						"<td class=\"td4\">"+jsonObj[i].endtime+"</td></tr>");
	    				$('#tb2').append(tr)
	    				if( i == (jsonObj.length-1) && i != 9 ){
	    					for(var j =0;j<(Number(9)-i);j++ ){
	    						var tr2 = $("<tr><td class=\"td4\"></td>" +
	    	    						"<td class=\"td4\"></td>" +
	    	    						"<td class=\"td4\"></td>" +
	    	    						"<td class=\"td4\"></td>" +
	    	    						"<td class=\"td4\"></td>" +
	    	    						"<td class=\"td4\"></td>" +
	    	    						"<td class=\"td4\"></td></tr>");
	    						$('#tb2').append(tr2);
	    					}
	    				}
	    			}
	    		}else{
	    		}
	    	});
	    }
	})
}