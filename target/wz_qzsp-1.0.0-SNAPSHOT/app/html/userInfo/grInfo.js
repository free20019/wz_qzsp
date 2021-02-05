//登录成功后查询个人信息放到账号信息中
$.ajax({
    type:"post",
    url: basePath + "user/grdlxx",
    data:{},
    dataType: "json",
    success:function(data){
//    	console.log(data[0])
    	list = data[0];
        $("#td_xm").html(data[0].XM);
        $("#td_sfzh").html(data[0].ZJHM);
        $("#td_sjhm").html(data[0].USER_NAME);
        $("#td_zcrq").html(new Date(data[0].ZCRQ).format("yyyy-MM-dd"));
    },
    error: function(){
    }         
 });

//修改手机号
function xggrsjh(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/gredit",
        data:'postData={"oldsjhm":"' + $("#old_sjhm").val() + '","sjhm":"' + $("#sjhm").val() +
        '","yzm":"' + $("#yzm").val() + '","type":"0"}',
        dataType: "json",
        success:function(data){
//        	console.log(data)
        	if(data.info=='修改成功'){
        		layer.confirm((data.info+',请重新登录！'), {
                    cancel: function(index){
                        window.location.href= basePath+"index.html";
                        return false;
                    },
                    btn: ['确定'] //按钮
                }, function(index){
                    layer.close(index);
                    window.location.href= basePath+"index.html";
                });
        	}else{
        		Pop_up_box(data.info,2);
        	}
        },
        error: function(){
        }         
     });
}
//修改密码
function xggrmm(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/gredit",
        data:'postData={"oldmm":"' + hex_md5($("#old_pwd").val()) + '","newmm":"' + hex_md5($("#pwd").val()) +
        '","type":"1","qrmm":"' + hex_md5($("#repwd").val()) + '"}',
        dataType: "json",
        success:function(data){
//        	console.log(data)
        	if(data.info=='修改成功'){
        		layer.confirm((data.info+',请重新登录！'), {
                    cancel: function(index){
                        window.location.href= basePath+"index.html";
                        return false;
                    },
                    btn: ['确定'] //按钮
                }, function(index){
                    layer.close(index);
                    window.location.href= basePath+"index.html";
                });
        	}else{
        		Pop_up_box(data.info,2);
        	}
        },
        error: function(){
        }         
     });
}
//修改个人信息
function xggrxx(){
	var dataPara = getFormJson("jyz_form");
    dataPara.MM = hex_md5(dataPara.MM);
    var datap= JSON.stringify(dataPara);
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/gredit",
        data:{
            "postData" : datap
        },
        dataType: "json",
        success:function(data){
//        	console.log(data)
        	if(data.info=='修改成功'){
        		layer.confirm((data.info+',请重新登录！'), {
                    cancel: function(index){
                        window.location.href= basePath+"index.html";
                        return false;
                    },
                    btn: ['确定'] //按钮
                }, function(index){
                    layer.close(index);
                    window.location.href= basePath+"index.html";
                });
        	}else{
        		Pop_up_box(data.info,2);
        	}
        },
        error: function(){
        }         
     });
}
//查询当前正在申请的驾驶员
$.ajax({
    type:"post",
    url: basePath + "jsy/jsysqjl",
    data:{
    },
    dataType: "json",
    success:function(data){
//    	console.log(data)
    	if(data.length>0){
    		if(data.length==1){
    			$("#jsysqjl").html('<tr>'+
    					'<td>1</td>'+
    					'<td>'+data[0].XM+'</td>'+
    					'<td>'+(data[0].SQLX=="0"?"网约车驾驶员证":"巡游车驾驶员证")+'</td>'+
    					'<td>'+data[0].DQZT+'</td>'+
    					'<td>'+
    					'<button class="btn btnBlue btnJsysqjl" sqbh="'+data[0].SQBH+'">查看</button>'+
    					'</td>'+
    			'</tr>');
    			if(data[0].DQZT.indexOf('不通过')<0){
    				if(data[0].SQLX=="0"){
    					$("#wycz").remove();
    				}else if(data[0].SQLX=="1"){
    					$("#xycz").remove();
    				}
//    			$(".jsysqan").remove();
    			}
    		}else{
    			var tt = "";
    			for(var i=0; i<data.length; i++){
    				tt += '<tr>'+
								'<td>'+(i+1)+'</td>'+
								'<td>'+data[i].XM+'</td>'+
								'<td>'+(data[i].SQLX=="0"?"网约车驾驶员证":"巡游车驾驶员证")+'</td>'+
								'<td>'+data[i].DQZT+'</td>'+
								'<td>'+
								'<button class="btn btnBlue btnJsysqjl" sqbh="'+data[i].SQBH+'">查看</button>'+
								'</td>'+
						'</tr>';
    			}
    			$("#jsysqjl").html(tt);
    			if(data[0].DQZT.indexOf('不通过')<0){
    				if(data[0].SQLX=="0"){
    					$("#wycz").remove();
    				}else if(data[0].SQLX=="1"){
    					$("#xycz").remove();
    				}
//    			$(".jsysqan").remove();
    			}
    			if(data[1].DQZT.indexOf('不通过')<0){
    				if(data[1].SQLX=="0"){
    					$("#wycz").remove();
    				}else if(data[1].SQLX=="1"){
    					$("#xycz").remove();
    				}
    			}
    		}
    		$(".btnJsysqjl").on('click',function(){
        		var sqbh = $(this).attr('SQBH');
        		$.ajax({
        	        type:"post",
        	        url: basePath + "db/tym",
        	        data:'postData={"sqbh":"' + sqbh + '"}',
        	        dataType: "json",
        	        success:function(data){
//        	        	console.log(data)
        	        	var info = data.info;
        	        	if(info == '1'||info == '2'){
                            $.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
        	        		location.replace('../jsysq/shxx.html');
        	        	}else if(info == '3'){
                            $.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
        	        		location.replace('../jsysq/ksyyzm.html');
        	        	}else if(info == '4'){
                            $.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
        	        		location.replace('../jsysq/ksjg.html');
        	        	}
        	        },
        	        error: function(){
        	        }         
        	     });
        	});
    	}else{
    		$("#jsysqjl").html('<tr><td colspan="5" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td></tr>');
    	}
    },
    error: function(){
    }         
 });

//查询当前正在申请的车辆
$.ajax({
    type:"post",
    url: basePath + "clysz/clsqjl",
    data:{
    },
    dataType: "json",
    success:function(data){
//    	console.log(data)
    	if(data.length>0){
    		var tab = "";
    		for(var i=0;i<data.length;i++){
    			tab+='<tr>'+
                '<td>'+(i+1)+'</td>'+
                '<td>'+data[i].XM+'</td>'+
                '<td>'+data[i].CPHM+'</td>'+
                '<td>'+data[i].DQZT+'</td>'+
                '<td>'+
                    '<button class="btn btnBlue btnClsqjl" sqbh="'+data[i].SQBH+'">查看</button>'+
                '</td>'+
            '</tr>'
    		}
    		$("#clsqjl").html(tab);
    		$(".btnClsqjl").on('click',function(){
	    		var sqbh = $(this).attr('SQBH');
	    		$.ajax({
	    	        type:"post",
	    	        url: basePath + "db/cl_tym",
	    	        data:'postData={"sqbh":"' + sqbh + '"}',
	    	        dataType: "json",
	    	        success:function(data){
	    	        	var info = data.info;
//	    	        	console.log(info)
//	    	        	if(info == '9'||info == '2'){//确认信息
//	    	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
//	        	        	location.replace('../clsq/shxx.html');
//	        	        		//info == '4' || 
//	    	        	}else if(info == '1'){//变更性质
//	    	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
//	        	        	location.replace('../clsq/bgxz.html');
//	    	        	}else 
	    	        	if(info == '5'||info == '6'||info == '7'){//等待发证
	    	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
	        	        	location.replace('../clsq/ddfz.html');
	    	        	}
//	    	        	else if(info == '3'){//补充资料
//	    	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'gr'});
//	        	        	location.replace('../clsq/shsp.html');
//	    	        	}
	    	        },
	    	        error: function(){
	    	        }         
	    	     });
        	});
    	}else{
    		$("#clsqjl").html('<tr><td colspan="5" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td></tr>');
    	}
    },
    error: function(){
    }         
 });