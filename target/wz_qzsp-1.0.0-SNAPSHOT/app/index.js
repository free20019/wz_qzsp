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
$.ajax({
	type: "POST",
	url: basePath + "user/indexinfo",
	data:{},
	timeout : 180000,
	dataType: 'json',
	success:function(data){
		var id = 0;
		for(var i=0; i<data.length; i++){
			if(data[i].TYPE == '0'){
				$("#clzhxnjcz").append('<li>'+
											'<dl>'+
											'<dt>'+data[i].NAME+'</dt>'+
											'<dd><b>地址:</b>'+data[i].ADDRESS+'</dd>'+
										'</dl>'+
									'</li>');
			}else if(data[i].TYPE == '1'){
				$("#yyxkck").append('<li style="border: none; padding:0px 16px;"><b>'+data[i].NAME+'</b></li><li style="border: none; padding:8px 16px; color:#333"><b>地址:</b>'+data[i].ADDRESS+'</li>');
			}else if(data[i].TYPE == '2'){
				++id;
				$("#cyzgksdd").append('<li style="border: none; padding:8px 16px;"><span style="font-weight:bold;">'+id+'，'+data[i].NAME+'</span>'+data[i].ADDRESS+'</li>');
			}
		}
	},
	error: function(){
	}
});
$.ajax({
	type: "POST",
	url: basePath + "user/findzcfg",
	data:{},
	timeout : 180000,
	dataType: 'json',
	success:function(data){
		if(data.length>5){
			for(var i=0; i<5; i++){
				$("#index-zcfg").append('<div class="panel-oneSpanUl"><i class="icon-discGreen"></i><a href="'+data[i].FJNAME+'">'+data[i].BT+'</a><span class="t-datetime">'+fomart_time1(new Date(data[i].FSSJ))+'</span></div>');
			}
		}else{
			for(var i=0; i<data.length; i++){
				$("#index-zcfg").append('<div class="panel-oneSpanUl"><i class="icon-discGreen"></i><a href="'+data[i].FJNAME+'">'+data[i].BT+'</a><span class="t-datetime">'+fomart_time1(new Date(data[i].FSSJ))+'</span></div>');
			}
		}
		
	},
	error: function(){
	}         
});
$.ajax({
	type: "POST",
	url: basePath + "user/findtp",
	data:{},
	timeout : 180000,
	dataType: 'json',
	success:function(data){
		console.log(data)
		if(data.length>4){
			for(var i=0; i<4; i++){
				$(".items").append('<li><a href="'+data[i].FJNAME+'" title=\''+data[i].BT+'\'><img src="user/pic?id='+data[i].ID+'"></a></li>');
			}
		}else{
			for(var i=0; i<data.length; i++){
				$(".items").append('<li><a href="'+data[i].FJNAME+'" title=\''+data[i].BT+'\'><img src="user/pic?id='+data[i].ID+'"></a></li>');
			}
		}
		$('#demo3').slideBox({
			duration : 0.3,//滚动持续时间，单位：秒
			easing : 'linear',//swing,linear//滚动特效
			delay : 5,//滚动延迟时间，单位：秒
			hideClickBar : false,//不自动隐藏点选按键
			clickBarRadius : 10
		});
	},
	error: function(){
	}         
});
$.ajax({
	type: "POST",
	url: basePath + "user/findtzgg",
	data:{},
	timeout : 180000,
	dataType: 'json',
	success:function(data){
		console.log(data)
		var tab = "";
		if(data.length<5){
			for (var int = 0; int < data.length; int++) {
				if(data[int].NR.length<5){
					tab += '<div class="panel-oneSpanUl"><i class="icon-discYellow"></i><a href="'+data[int].FJNAME+'">'+data[int].BT+'</a><span class="t-datetime">'+fomart_time1(new Date(data[int].FSSJ))+'</span></div>';
				}else{
					tab += '<div class="panel-oneSpanUl" onclick = "tzggbt(\''+data[int].ID+'\')"><i class="icon-discYellow"></i><a href="#">'+data[int].BT+'</a><span class="t-datetime">'+fomart_time1(new Date(data[int].FSSJ))+'</span></div>';
				}
			}
		}else{
			for (var int = 0; int < 5; int++) {
				if(data[int].NR.length<5){
					tab += '<div class="panel-oneSpanUl"><i class="icon-discYellow"></i><a href="'+data[int].FJNAME+'">'+data[int].BT+'</a><span class="t-datetime">'+fomart_time1(new Date(data[int].FSSJ))+'</span></div>';
				}else{
					tab += '<div class="panel-oneSpanUl" onclick = "tzggbt(\''+data[int].ID+'\')"><i class="icon-discYellow"></i><a href="#">'+data[int].BT+'</a><span class="t-datetime">'+fomart_time1(new Date(data[int].FSSJ))+'</span></div>';
				}
			}
		}
		$("#index-tzgg").html(tab);
	},
	error: function(){
	}         
});
function tzggbt(obj){
	$.ajax({
		type: "POST",
		url: basePath + "user/tzggsession",
		data:{"info":obj},
		timeout : 180000,
		dataType: 'json',
		success:function(data){
			console.log(data)
			window.location.href = "gzgg.html";
		},
		error: function(){
		}         
	});
}