function change(address) {
	document.getElementById("showView").src =address;
}

function showJobInfo(roleType){
	var jobInfo = document.getElementById("jobInfo");
	if( "学生" == roleType ){
	}else{
		jobInfo.style.display="";
	}
}
