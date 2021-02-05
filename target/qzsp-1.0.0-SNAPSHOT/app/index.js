//个人登录
function login(type,user,pwd,code,yzmtp){
	if($("#"+code).val()==""){
		hint_info(code,'验证码不能为空','3');
		$('#'+yzmtp).click();
		return false;
	}
	if($("#"+user).val()==""){
		hint_info(user,'账号不能为空','2');
		$('#'+yzmtp).click();
		return false;
	}
	if($("#"+pwd).val()==""){
		hint_info(pwd,'密码不能为空','2');
		$('#'+yzmtp).click();
		return false;
	}
	$.ajax({
		type: "POST",
		url: basePath + "user/login",
		
		data:'postData={"n":"'+$("#"+user).val()+
		'","p":"'+hex_md5($("#"+pwd).val())+
		'","code":"'+$("#"+code).val()+'","type":"'+type+'"}',
		timeout : 180000,
		dataType: 'json',
		success:function(data){
			$('#yzm-yzm').click();
			if(data.info=='登陆成功'){
				if(type=='0'){
                    $.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
					window.location.href="app/html/userInfo/grInfo.html";
				}else if(type=='2'){
//			        $.cookie('set', { duration: .2, name: 'regsiterType', value: 'pt'});
			        window.location.href="app/html/userInfo/ptInfo.html";
				}else if(type=='1'){
                    $.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
					window.location.href="app/html/userInfo/qyInfo.html";
				}
			}else{
				if(data.info=='验证码不能为空'){
					hint_info(code,data.info,'3');
					$('#'+yzmtp).click();
				}
				if(data.info=='验证码错误'){
					hint_info(code,data.info,'3');
					$('#'+yzmtp).click();
				}
				if(data.info=='用户名或密码错误'){
					hint_info(user,data.info,'2');
					$('#'+yzmtp).click();
				}
				if(data.info=='登录失败请重新登录'){
					Pop_up_box(data.info,2);
					$('#'+yzmtp).click();
				}
			}
		},
		error: function(){
			$('#'+yzmtp).click();
		}         
	});
}
