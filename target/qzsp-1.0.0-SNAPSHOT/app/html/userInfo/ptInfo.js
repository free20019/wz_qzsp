var ptxx;
var jbrxx;
//登录成功后查询个人信息放到账号信息中
$.ajax({
    type:"post",
    url: basePath + "user/ptdlxx",
    data:{},
    dataType: "json",
    success:function(data){
    	console.log(data[0])
    	list = data[0];
    	ptxx = data[0];
        $("#ptmc").html(data[0].JYZMC);
        $("#td_jbrxm").html(data[0].JBRXM);
        $("#td_jbrlxfs").html(data[0].USER_NAME);
        if(data[0].IS_ADMIN=='0'){
        	$(".panelButton").append('<li class="title">经办人注册</li>'+
        			'<li><button skip="pt_clgl" class="btn-bgImg btn-tab">经办人注册<i class="icon-arrow"></i></button></li>');
        }
        $('.btn-tab').click(function() {
			$('.btn-tab.btn-bgImg.checked').removeClass('checked');
			$('.panel-middleContent').hide();
			$(this).addClass('checked');
			var sikp = $(this).attr('skip');
			$('#' + sikp).show();
//			if(sikp=="pt_yglcx"){
//				clygl_findsj(1);
//			}
		});
        ptfindjbr();
    },
    error: function(){
    }         
 });
//修改手机号码
function pteditphone(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/PtEdit",
        data:'postData={"oldsjhm":"' + $("#jbrlxfs").val() + '","SJHM":"' + $("#old_jbrlxfs").val() +
        '","yzm":"' + $("#jyzyzm").val() + '","type":"0"}',
        dataType: "json",
        success:function(data){
        	console.log(data)
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
function pteditpwd(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/PtEdit",
        data:'postData={"oldmm":"' + hex_md5($("#old_jyzpwd").val()) + '","newmm":"' + hex_md5($("#jyzpwd").val()) +
        '","type":"1","qrmm":"' + hex_md5($("#jyzrepwd").val()) + '"}',
        dataType: "json",
        success:function(data){
        	console.log(data)
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
function pteditinfo(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/PtEdit",
        data:'postData={"SJHM":"' + $("#jbrlxfs").val() + '","yzm":"' + $("#jyzyzm").val() +
        '","type":"2","sfzh":"' + $("#zzjgdmz").val() + '","xm":"' + $("#jbrName").val() + '"}',
        dataType: "json",
        success:function(data){
        	console.log(data)
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
function ptaddjbr(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/PtJbr",
        data:'postData={"SJHM":"' + $("#jbrlxfs").val() + 
				        '","type":"1","xm":"' + $("#jbrName").val() + 
				        '","mm":"' + hex_md5($("#jyzpwd").val()) + 
				        '","qrmm":"' + hex_md5($("#jyzrepwd").val()) + '"}',
        dataType: "json",
        success:function(data){
        	console.log(data)
        	if(data.info=='添加成功'){
				layer.alert('添加成功', function(index){
					layer.closeAll();
					ptfindjbr();
				});       
			}else{
				Pop_up_box(data.info,2);
			}
        },
        error: function(){
        }         
     });
}
//查询经办人
function ptfindjbr(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/PtJbr",
        data:'postData={"type":"0"}',
        dataType: "json",
        success:function(data){
        	console.log(data)
        	var tab = "";
        	jbrxx = data;
        	for(var i=0; i<data.length; i++){
        		tab += '<tr>'+
							'<td>'+(i+1)+'</td>'+
							'<td>'+data[i].JBRXM+'</td>'+
							'<td>'+data[i].USER_NAME+'</td>'+
							'<td>'+
							'<button class="btn btnBlue btnEdit" lx='+i+'>编辑</button>&nbsp;&nbsp;'+
							'<button class="btn btnBlue btnDele" lx='+i+'>解除</button>'+
							'</td>'+
					'</tr>';
        	}
        	$("#jbrbody").html(tab);
        	$(".btnEdit").on('click',function(){
        		var i = $(this).attr('lx');
                var title = '修改经办人',
                    html = jbrHtml('jbr', '' ,{ xm: jbrxx[i].JBRXM, zzjgdmz: "", sjhm: jbrxx[i].USER_NAME});
                layer.open({
                    type:1,
                    title: title,
                    area: ['750px', '480px'],
                    content: html,
                    btn: ['提交', '取消'],
                    yes: function(index) {
                        if(jbrtj()){
                        	pteditjbr(jbrxx[i].USER_NAME);
                        }
                    },
                    btn2: function (index) {
                    }
                });
                jbrzcyz();
                $("#jbrlxfs").removeAttr("readonly");
        	});
        	$('.btnDele').on('click', function () {
            	var i = $(this).attr('lx');
            	layer.confirm(('你确定要接触手机号为'+jbrxx[i].USER_NAME+'的经办人账号吗？'), {
	            		cancel: function(index){
	        			},
	            	    btn: ['确定','取消'] //按钮
	            	}, function(index){
	            		$.ajax({
	            	        type:"post",
	            	        url: basePath + "EditInfo/PtJbr",
	            	        data:'postData={"type":"3","SJHM":"' + jbrxx[i].USER_NAME + '"}',
	            	        dataType: "json",
	            	        success:function(data){
	            	        	console.log(data)
	            	        	if(data.info=='解除成功'){
	            					layer.alert('解除成功', function(index){
	            						layer.closeAll();
	            						ptfindjbr();
	            					});       
	            				}else{
	            					Pop_up_box(data.info,2);
	            				}
	            	        },
	            	        error: function(){
	            	        }         
	            	     });
	                });
            })
        },
        error: function(){
        }         
     });
}
function pteditjbr(user){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/PtJbr",
        data:'postData={"SJHM":"' + $("#jbrlxfs").val() + 
				        '","oldsjhm":"' + user + 
				        '","type":"2","xm":"' + $("#jbrName").val() + 
				        '","mm":"' + hex_md5($("#jyzpwd").val()) + 
				        '","qrmm":"' + hex_md5($("#jyzrepwd").val()) + '"}',
        dataType: "json",
        success:function(data){
        	console.log(data)
        	if(data.info=='修改成功'){
				layer.alert('修改成功', function(index){
					layer.closeAll();
					ptfindjbr();
				});       
			}else{
				Pop_up_box(data.info,2);
			}
        },
        error: function(){
        }         
     });
}