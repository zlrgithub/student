function register(){
	window.location.href='http://localhost:8080/student/user/insertUser';
}

function pass() {
	document.getElementById("password").type = "password";
	document.getElementById("password2").type = "password";
}
function check1(){
	var vals = document.getElementById("name").value;
	if(vals.length< 11 ){
		document.getElementById('alr1').innerText='用户名不正确';
	}else{
		document.getElementById('alr1').innerText='';
	}
}
function check2(){
	var vals = document.getElementById("password").value;
	if(vals==''){
		document.getElementById('alr2').innerText='密码不正确';
	}else{
		document.getElementById('alr2').innerText='';
	}
}
function check3(){
	var vals = document.getElementById("password2").value;
	if(vals==''){
		document.getElementById('alr3').innerText='密码不正确';
	}else{
		document.getElementById('alr3').innerText='';
	}
}

function check4(){
	var vals1 = document.getElementById("name").value;
	var vals2 = document.getElementById("password").value;
	var vals3 = document.getElementById("password2").value;
	if(vals1==''||vals2==''||vals3==''){
		alert('请正确填写注册信息');
	}else{
		//表单中不能存在id=submit或name=submit等信息
		$('#ff').submit();  
		//document.getElementById('ff').submit();
	}
}

function turnback(){
	window.location.href='http://localhost:8080/student';
}
$.ready(function() {
    $('.page-container form').submit(function(){
        var username = $(this).find('.username').val();
        var password = $(this).find('.password').val();
        var roleType = $(this).find('.roleType').val();
        if(username == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '27px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.username').focus();
            });
            return false;
        }
        if(password == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '96px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.password').focus();
            });
            return false;
        }
        if(roleType == '') {
            $(this).find('.error').fadeOut('fast', function(){
                $(this).css('top', '96px');
            });
            $(this).find('.error').fadeIn('fast', function(){
                $(this).parent().find('.password').focus();
            });
            return false;
        }
    });

    $('.page-container form .username, .page-container form .password').keyup(function(){
        $(this).parent().find('.error').fadeOut('fast');
    });

});
