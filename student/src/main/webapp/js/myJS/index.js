function register(){
	window.location.href='http://localhost:8080/student/user/insertUser'
}

function pass() {
	document.getElementById("password").type = "password"
}
function check(){
	var vals = document.getElementById("username").value;
	if(vals.length<11){
		document.getElementById("alr").innerText='用户名不正确'
	}else{
		document.getElementById("alr").innerText="";
	}
}
function check2(){
	var vals = document.getElementById("password").value;
	if(vals == '' || vals=='Password'){
		document.getElementById("alr2").innerText='密码不正确'
	}else{
		document.getElementById("alr2").innerText="";
	}
}
$.ready(function() {
    $('.page-container form').submit(function(){
        var username = $(this).find('.username').val();
        var password = $(this).find('.password').val();
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
    });

    $('.page-container form .username, .page-container form .password').keyup(function(){
        $(this).parent().find('.error').fadeOut('fast');
    });

});
