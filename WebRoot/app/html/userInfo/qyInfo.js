var a = 0;
//登录成功后查询企业信息放到账号信息中
$.ajax({
    type:"post",
    url: basePath + "user/grdlxx",
    data:{},
    dataType: "json",
    success:function(data){
//    	console.log(data[0])
    	list = data[0];
    	var qymc = data[0].QYMC;
    	var mc = "";
    	if(qymc.length>10){
    		mc = qymc.substr(0,10)+"...";
    	}else{
    		mc = qymc;
    	}
        $("#qymc").html("<ul style='list-style-type:none;margin-top: 10px;margin-left: -37px;'><li title='"+qymc+"'>"+mc+"</li></ul>");
        $("#frdb").html(data[0].XM);
        $("#jbrcm").html(data[0].JBRXM);
        $("#jbrsjh").html(data[0].USER_NAME);
        $("#zcsj").html(new Date(data[0].ZCRQ).format("yyyy-MM-dd"));
        if(data[0].IS_ADMIN=='0'){
        	$(".buttonList").append('<li><a href="javascript:void(0);" id="xgsjhm" class="xgxxBtn">修改手机号</a></li>'+
        			'<li><a href="javascript:void(0);" id="xgjbrxx" class="xgxxBtn">修改经办人信息</a></li>'+
        			'<li><a href="javascript:void(0);" id="xgqyxx" class="xgxxBtn">修改企业信息</a></li>');
//        	$(".panelButton").append('<li class="title">经办人管理</li>'+
//			'<li><button skip="pt_clgl" class="btn-bgImg btn-tab">经办人管理<i class="icon-arrow"></i></button></li>');
//        	addjbr();
        	$('.btn-tab').click(function() {
        		var thisBtn = $(this);
        		if (thisBtn.attr('skip').indexOf('#') === 0) {
        			window.open('./'+thisBtn.attr('skip').substring(1)+'.html');
        		} else {
        			$('.btn-tab.btn-bgImg.checked').removeClass('checked');
        			$('.panel-middleContent').hide();
        			$(this).addClass('checked');
        			var sikp = $(this).attr('skip');
        			$('#' + sikp).show();
        		}
    		});
        }else{
        	$(".buttonList").append('<li><a href="javascript:void(0);" id="xgsjhm" class="xgxxBtn">修改手机号</a></li>'+
        			'<li><a href="javascript:void(0);" id="xgjbrxx" class="xgxxBtn">修改经办人信息</a></li>');
        }
        $('#xgsjhm').on('click', function () {
            var title = '修改手机号码',
                html = jbrHtml('myEditPhone', '', {sjhm: list.USER_NAME});
            layer.open({
                type:1,
                title: title,
                area: ['750px', '480px'],
                content: html,
                btn: ['提交', '取消'],
                yes: function(index) {
                    if(qy_sjxg()){
                    	xgqysjh();
                    }
                },
                btn2: function (index) {

                }
//                cancel: function (index) {
//                    alert('是取消还是右上角关闭按钮自行查看')
//                }
            });
            qyInfo_yz();
        });
		$('#xgjbrxx').on('click', function () {
            var title = '修改经办人',
                html = jbrHtml('myEdit', '', {sjhm: list.USER_NAME, zzjgdmz: list.JBRSFZH, xm: list.JBRXM});
            layer.open({
                type:1,
                title: title,
                area: ['750px', '480px'],
                content: html,
                btn: ['提交', '取消'],
                yes: function(index) {
                    if(qy_jbr()){
                    	xgqyjbr();
                    }
                },
                btn2: function (index) {
                }
//                cancel: function (index) {
//                    alert('是取消还是右上角关闭按钮自行查看')
//                }
            });
            qyInfo_yz()
        });
		$('#xgqyxx').on('click', function () {
            var title = '修改企业信息',
                html = qyHtml('', {sjhm: list.USER_NAME,wycjyzxm: list.QYMC, zzjgdmz: list.ZJHM, frdbxm: list.XM, frsfzh: list.FRSFZH, lxdz: list.DZ.split("|")[3]});
            layer.open({
                type:1,
                title: title,
                area: ['750px', '480px'],
                content: html,
                btn: ['提交', '取消'],
                yes: function(index) {
                    if(qy_tj()){
                    	xgqyxx();
                    }
                },
                btn2: function (index) {

                }
//                cancel: function (index) {
//                    alert('是取消还是右上角关闭按钮自行查看')
//                }
            });

            $("#city").citySelect({
                url:"../../../resources/js/city.min.js",
                prov:list.DZ.split("|")[0], //省份
                city:list.DZ.split("|")[1], //城市
                dist:list.DZ.split("|")[2], //区县
                nodata:"none" //当子集无数据时，隐藏select
            });
            qyInfo_yz();
        });
    },
    error: function(){
    }         
 });
var jbrxx;
function addjbr(){
	$.ajax({
        type:"post",
        url: basePath + "user/qygljbr",
        data:{},
        dataType: "json",
        success:function(data){
        	console.log(data)
        	if(data.length==0){
        		$("#jbrglbody").html('<tr>'+
						'<td colspan="4" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td>'+
					'</tr>');
        	}else{
        		jbrxx=data;
        		var table = "";
        		for(var i=0; i<data.length; i++){
        			table+='<tr>'+
        					'<td>'+(i+1)+'</td>'+
        					'<td>'+data[i].JBRXM+'</td>'+
        					'<td>'+data[i].USER_NAME+'</td>'+
        					'<td>'+
        					'<button class="btn btnBlue btnEdit" lx='+i+'>编辑</button>&nbsp;&nbsp;'+
        					'<button class="btn btnBlue btnDele" lx='+i+'>解除</button>'+
        					'</td>'+
        			'</tr>';
        		}
        		$("#jbrbody").html(table);
        		$('.btnEdit').on('click', function () {
        			var i = $(this).attr('lx');
                    var title = '编辑经办人',
                        html = jbrHtml('edit', '', {sjhm: jbrxx[i].USER_NAME, zzjgdmz:jbrxx[i].JBRSFZH , xm: jbrxx[i].JBRXM});
                    layer.open({
                        type: 1,
                        title: title,
                        area: ['750px', '480px'],
                        content: html,
                        btn: ['提交', '取消'],
                        yes: function(index) {
                        	if(jbr_tj('0')){
                        		edit(jbrxx[i].USER_NAME);
                        	}
                        },
                        btn2: function (index) {

                        },
                        cancel: function (index) {
//                             alert('是取消还是右上角关闭按钮自行查看')
                        }
                    });
                    $("#jbrlxfs").removeAttr("readonly");
                    qyInfo_yz();
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
		            	        url: basePath + "EditInfo/QyDel",
		            	        data:'postData={"SJHM":"' + jbrxx[i].USER_NAME + '"}',
		            	        dataType: "json",
		            	        success:function(data){
//		            	        	console.log(data)
		            	        	if(data.info=='解除成功'){
		            					layer.alert('解除成功', function(index){
		            						layer.closeAll();
		            						addjbr();
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
        	}
        },
        error: function(){
        }         
     });
}
/**
 * 修改经办人
 */
function edit(user){
	var dataPara = getFormJson("jyz_form");
	dataPara.JYZPWD = hex_md5(dataPara.JYZPWD);
    dataPara.JYZREPWD = hex_md5(dataPara.JYZREPWD);
    dataPara.user = user;
	var datap = JSON.stringify(dataPara);
	$.ajax({
		type: "post",
		url: basePath + "EditInfo/editqyjbr",
		data: {
			"postData": datap
		},
		dataType: "json",
		success: function (data) {
//			console.log(data)
			if(data.info=='添加成功'){
				layer.alert('修改成功', function(index){
					layer.closeAll();
					addjbr();
				});       
			}else{
				Pop_up_box(data.info,2);
			}
		},
		error: function () {
			layer.closeAll('loading');
		}
	});
}
/**
 * 添加经办人图片提交成功后将文字信息提交过去
 */
 var oFrm = document.getElementById("interface_data");
 oFrm.onload  = function() {
 /* 	console.log('oFrm onload...') */
//	 console.log(a)
 	if(a==0)return;
      if (this.readyState && this.readyState != 'complete') return;
      else{
         if (document.all){//IE
                 var sub_con = document.frames["interface_data"].document;
         }else{//Firefox
                 var sub_con = document.getElementById("interface_data").contentDocument;
         }
         sub_con = sub_con.body.innerHTML;  //取得返回值
			if(sub_con.indexOf("OK")>=0){
				var dataPara = getFormJson("jyz_form");
				dataPara.JYZPWD = hex_md5(dataPara.JYZPWD);
			    dataPara.JYZREPWD = hex_md5(dataPara.JYZREPWD);
				var datap = JSON.stringify(dataPara);
				$.ajax({
					type: "post",
					url: basePath + "EditInfo/addqyjbr",
					data: {
						"postData": datap
					},
					dataType: "json",
					success: function (data) {
//						console.log(data)
						if(data.info=='添加成功'){
							layer.alert(data.info, function(index){
								layer.closeAll();
								addjbr();
							});       
						}else{
							Pop_up_box(data.info,2);
						}
					},
					error: function () {
						layer.closeAll('loading');
					}
				});
			}else{
				layer.closeAll('loading');
				var dainfo = sub_con;
				var obj = JSON.parse(dainfo);
				Pop_up_box(obj.info,'2');
			}
   }
 };
//修改手机号
function xgqysjh(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/QyEdit",
        data:'postData={"oldsjhm":"' + $("#jbrlxfs").val() + '","SJHM":"' + $("#old_jbrlxfs").val() +
        '","JYZYZM":"' + $("#jyzyzm").val() + '","type":"0"}',
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
////修改经办人信息
function xgqyjbr(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/QyEdit",
        data:'postData={"zjhm":"' + $("#zzjgdmz").val() + '","xm":"' + $("#qy_jbrName").val() +
        '","type":"1","SJHM":"' + $("#jbrlxfs").val() + '","JYZYZM":"' + $("#jyzyzm").val() +
        '","mm":"' + hex_md5($("#jyzpwd").val()) + '","qrmm":"' + hex_md5($("#jyzrepwd").val()) + '"}',
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
////修改企业信息
function xgqyxx(){
	var dataPara = getFormJson("jyz_form");
    var datap= JSON.stringify(dataPara);
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/QyEdit",
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
/**
*	车辆运输证查询
*/
var qy_currentpage=1;
var qy_pagesize=5;
var qy_resultdata;
var qy_pgzs=0;
qy_findsj(qy_currentpage);
function qy_findsj(obj){
	$.ajax({
		url: basePath + "clysz/qyclsqjl",
		type : 'post',
		data:'postData={"page":"' + obj + '","pageSize":"' + qy_pagesize +
        '","cphm":"' + $("#pt_clblcx_cphm").val() +
        '","blzt":"' + $("#pt_clblcx_blzt").val() + '"}',
		dataType: 'json',
		timeout : 180000,
		success:function(data){
			console.log(data.length)
			var sjxxtab="";
			if(data.length>0){
				for (var i = 0; i < data.length; i++) {
					sjxxtab += "<tr>"+
									"<th>"+(i+1)+"</th>"+
									"<th>"+data[i].CPHM+"</th>"+
									"<th>"+data[i].JBRXM+"</th>"+
									"<th>"+data[i].DQZT+"</th>"+
									"<th><button class='btn btnBlue clcktz' sqbh='"+data[i].SQBH+"'>查看</button></th>"+
								"</tr>";
				}
				$('#qyclbody').html(sjxxtab);
				$(".clcktz").on('click',function(){
	        		var sqbh = $(this).attr('SQBH');
	        		$.ajax({
	        	        type:"post",
	        	        url: basePath + "db/cl_tym",
	        	        data:'postData={"sqbh":"' + sqbh + '"}',
	        	        dataType: "json",
	        	        success:function(data){
	        	        	var info = data.info;
//	        	        	console.log(info)
//	        	        	if(info == '9'||info == '2'){//确认信息
//	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
//		        	        	location.replace('../clsq/shxx.html');
//		        	        	//info == '4'||
//	        	        	}else if(info == '1'){//变更性质
//	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
//		        	        	location.replace('../clsq/bgxz.html');
//	        	        	}else
	        	        	if(info == '5'||info == '6'||info == '7'){//等待发证
	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
		        	        	location.replace('../clsq/ddfz.html');
	        	        	}
//	        	        	else if(info == '3'){//补充资料
//	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
//		        	        	location.replace('../clsq/shsp.html');
//	        	        	}
	        	        },
	        	        error: function(){
	        	        }         
	        	     });
	        	});
			}else{
				$('#qyclbody').html('<tr><td colspan="5" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td></tr>');
			}
			if(data.length>0){
				qy_pgzs = parseInt((data[0].COUNT-1)/qy_pagesize)+1;
				$("#blz_totalpage").html(qy_pgzs);
				$("#blz_totalnum").html(data[0].COUNT);
			}else{
				$("#blz_totalpage").html("0");
				$("#blz_totalnum").html("0");
			}
			$("#blz_currentpage").html(qy_currentpage);
		},
		error:function(data){
		}
	});
}
//首页
function qy_gopage(){
	qy_currentpage=1;
	qy_findsj(qy_currentpage);
}
//上一页
function qy_goxyy(){
	qy_currentpage++;
//	console.log(qy_currentpage,qy_pgzs)
	if(qy_currentpage>qy_pgzs){
		layer.msg("已到末页");
		qy_currentpage=qy_currentpage-1;
		return;
	}
	qy_findsj(qy_currentpage);
}
//下一页
function qy_gosyy(){
	qy_currentpage--;
	if(qy_currentpage<=0){
		layer.msg("已到首页");
		qy_currentpage=qy_currentpage+1;
		return;
	}
	qy_findsj(qy_currentpage);
}
//末页
function qy_goend(){
	qy_currentpage = qy_pgzs;
	qy_findsj(qy_currentpage);
}
//跳页
function qy_tzym(){
	if($('#blz_ym').val()!=""){
		if(qy_pgzs > parseInt($('#blz_ym').val())){
			qy_currentpage = $('#blz_ym').val();
			qy_findsj(qy_currentpage);
		}else{
			hint_info("blz_ym", "数字过大", "3");
		}
	}
}
$("#cldc_query").click(function(){
	url = "../../../clysz/qyclsqjlexcle?postData="
		+ '{"page":"1","pageSize":"100000","cphm":"' + $("#pt_clblcx_cphm").val() +
        '","blzt":"' + $("#pt_clblcx_blzt").val() + '"}', window.open(url)
})

/**
*	代办驾驶员证
*/
function findzjhm(obj){
	var zjhms;
	if($("#pt_grjsyzdb_zjlx").val()=='身份证'){
		if($("#pt_grjsyzdb_zjhm").val()==""){
			Pop_up_box("身份证号码不能为空!","2");
			return false;
		}else if(!regIDCard.test($("#pt_grjsyzdb_zjhm").val())) {
			Pop_up_box("身份证号码格式不正确!","2");
			return false;
		}
	}else{
		if($("#pt_grjsyzdb_zjhm").val()==""){
			Pop_up_box("护照号码不能为空!","2");
			return false;
		}else if($("#pt_grjsyzdb_zjhm").val().length>20) {
			Pop_up_box("护照号码格式不正确!","2");
			return false;
		}
	}
	zjhms = $("#pt_grjsyzdb_zjhm").val();
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/findzjhm",
        data:{"zjhm":zjhms},
        dataType: "json",
        success:function(data){
        	xgqzjhm = zjhms;
//        	$("#pt_grjsyzdb_gj").val("中华人民共和国");
//        	console.log(data)
        	jszsfxg = '0';
        	if(data.length>0){
    			$("#pt_grjsyzdb_xg").show();
    			jszsfxg = '2';
    			if(data[0].XB=='女'){
    				$("#pt_grjsyzdb_xb2").attr("checked","checked");
//        			$("#tradeType1").attr("checked",false);
    			}
    			$("#pt_grjsyzdb_jsyxm").val(data[0].XM);
//        		$("#").val();
//    			$("#pt_grjsyzdb_csrq").val(new Date(data[0].CSRQ).format("yyyy-MM-dd"));
//    			if(data[0].ZJLX=='身份证'){
//    				var tmpStr = data[0].ZJHM.substring(6, 14);
//    				tmpStr = tmpStr.substring(0, 4) + "-" + tmpStr.substring(4, 6) + "-" + tmpStr.substring(6);
//    				$("#pt_grjsyzdb_csrq").val(tmpStr);
//    			}else{
//    			$("#pt_grjsyzdb_csrq").attr('readonly','readonly');
				$("#pt_grjsyzdb_csrq").val(new Date(data[0].CSRQ).format("yyyy-MM-dd"));
//    			}
    			$("#pt_grjsyzdb_sjhm").val(data[0].USER_NAME);
    			$("#pt_grjsyzdb_SHENG").val(data[0].DZ.split('|')[0]);
    			$("#pt_grjsyzdb_SHI").val(data[0].DZ.split('|')[1]);
    			$("#pt_grjsyzdb_QU").val(data[0].DZ.split('|')[2]);
    			$("#pt_grjsyzdb_lxdz").val(data[0].DZ.split('|')[3]);
    			$("#pt_grjsyzdb_sfzcity").citySelect({
    	 	        url:"../../../resources/js/city.min.js",
    	 	        prov:data[0].SFZDZ.split('|')[0], //省份
    	 	        city:data[0].SFZDZ.split('|')[1], //城市
    	 	        dist:data[0].SFZDZ.split('|')[2], //区县
    	 	        nodata:"none" //当子集无数据时，隐藏select
    	 	    });
    			$("#pt_grjsyzdb_SFZSHENG").val(data[0].SFZDZ.split('|')[0]);
    			$("#pt_grjsyzdb_SFZSHI").val(data[0].SFZDZ.split('|')[1]);
    			$("#pt_grjsyzdb_SFZQU").val(data[0].SFZDZ.split('|')[2]);
    			$("#pt_grjsyzdb_sfzdz").val(data[0].SFZDZ.split('|')[3]);
    			$("#pt_grjsyzdb_xg").click(function(){
    				jszsfxg = '1';
    				$(".kjbky").removeAttr("readonly");
    				//$("#pt_grjsyzdb_csrq").attr('readonly','readonly');
    			});
        	}else{
        		if($("#pt_grjsyzdb_zjlx").val()=='身份证'){
        			var tmpStr = $("#pt_grjsyzdb_zjhm").val().substring(6, 14);
    				tmpStr = tmpStr.substring(0, 4) + "-" + tmpStr.substring(4, 6) + "-" + tmpStr.substring(6);
    				$("#pt_grjsyzdb_csrq").val(tmpStr);
        		}
        		$(".kjbky").removeAttr("readonly");
//        		$("#pt_grjsyzdb_csrq").attr('readonly','readonly');
        	}
        },
        error: function(){
        }         
     });
}

/**
* 个人驾驶证申请点击申请代办，将内容保存至数据库
*/
function grjszsh(type){
	layer.load(1);
	var dataPara = getFormJson("pt_grjsyzdb_form");
    dataPara.type = jszsfxg;
    dataPara.xgqzjhm = xgqzjhm;
    if(type==0){
    	dataPara.SQLX == '0';
    }else {
    	dataPara.SQLX == '1';
    }
	var datap = JSON.stringify(dataPara);
	$.ajax({
		type: "post",
		url: basePath + "EditInfo/grjszdb",
		data: {
			"postData": datap
		},
		dataType: "json",
		success: function (data) {
			layer.closeAll('loading');
//			console.log(data)
			if(data.info=='申请代办成功'){
				if(type == 0){
					layer.confirm(('操作成功，请进入驾驶员证申报界面'), {
						cancel : function(index) {
							$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
							$.cookie('set', { duration: .2, name: 'sqlx', value: 'ptdbgrsq'});
							location.replace('../jsysq/tbsqsc.html');
//						window.location.href = '../jsysq/tbsqsc.html';
							return false;
						},
						btn : [ '确定' ] //按钮
					}, function(index) {
						$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
						$.cookie('set', { duration: .2, name: 'sqlx', value: 'ptdbgrsq'});
						location.replace('../jsysq/tbsqsc.html');
					});
				}else{
					layer.confirm(('操作成功，请进入驾驶员证申报界面'), {
						cancel : function(index) {
							$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
							$.cookie('set', { duration: .2, name: 'sqlx', value: 'ptdbgrsq'});
							location.replace('../jsysq/xycsqsc.html');
//						window.location.href = '../jsysq/tbsqsc.html';
							return false;
						},
						btn : [ '确定' ] //按钮
					}, function(index) {
						$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
						$.cookie('set', { duration: .2, name: 'sqlx', value: 'ptdbgrsq'});
						location.replace('../jsysq/xycsqsc.html');
					});
				}
			}else{
				Pop_up_box(data.info,2);
			}
		},
		error: function () {
			layer.closeAll('loading');
		}
	});
}



/**
*	驾驶员证查询
*/
var blz_currentpage=1;
var blz_pagesize=5;
var blz_resultdata;
var blz_pgzs=0;
//$(document).ready(function (e) {
//});
blz_findsj(blz_currentpage);
function blz_findsj(obj){
	$.ajax({
		url: basePath + "db/dbjsycx",
		type : 'post',
		data:'postData={"page":"' + obj + '","pageSize":"' + blz_pagesize +
        '","xm":"' + $("#pt_jsyblz_jsyxm").val() + '","zjhm":"' + $("#pt_jsyblz_zjhm").val() + 
        '","dbr":"","blzt":"' + $("#pt_qjsyblz_blzt").val() + '"}',
		dataType: 'json',
		timeout : 180000,
		success:function(data){
//			console.log(data)
			var sjxxtab="";
			if(data.length>0){
				for (var i = 0; i < data.length; i++) {
					sjxxtab += "<tr>"+
									"<th>"+(i+1)+"</th>"+
									"<th>"+data[i].XM+"</th>"+
									"<th>"+(data[i].SQLX=="0"?"网约车驾驶员证":"巡游车驾驶员证")+"</th>"+
									"<th>"+data[i].JBRXM+"</th>"+
									"<th>"+data[i].DQZT+"</th>"+
									"<th><button class='btn btnBlue jsycktz' sqbh='"+data[i].SQBH+"'>查看</button></th>"+
								"</tr>";
				}
				$('#jsylb').html(sjxxtab);
				$(".jsycktz").on('click',function(){
	        		var sqbh = $(this).attr('SQBH');
	        		$.ajax({
	        	        type:"post",
	        	        url: basePath + "db/tym",
	        	        data:'postData={"sqbh":"' + sqbh + '"}',
	        	        dataType: "json",
	        	        success:function(data){
//	        	        	console.log(data)
	        	        	var info = data.info;
	        	        	if(info == '1'||info == '2'){
                                $.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
	        	        		location.replace('../jsysq/shxx.html');
	        	        	}else if(info == '3'){
                                $.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
	        	        		location.replace('../jsysq/ksyyzm.html');
	        	        	}else if(info == '4'){
                                $.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
	        	        		location.replace('../jsysq/ksjg.html');
	        	        	}
	        	        },
	        	        error: function(){
	        	        }
	        	     });
	        	});
			}else{
				$('#jsylb').html('<tr><td colspan="6" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td></tr>');
			}
			if(data.length>0){
				blz_pgzs = parseInt((data[0].COUNT-1)/blz_pagesize)+1;
				$("#jsyblz_totalpage").html(blz_pgzs);
				$("#jsyblz_totalnum").html(data[0].COUNT);
			}else{
				$("#jsyblz_totalpage").html("0");
				$("#jsyblz_totalnum").html("0");
			}
			$("#jsyblz_currentpage").html(blz_currentpage);
//			$('.tablelist tbody tr:odd').addClass('odd');
		},
		error:function(data){
		}
	});
}
//首页
function blz_gopage(){
	blz_currentpage=1;
	blz_findsj(blz_currentpage);
}
//上一页
function blz_goxyy(){
	blz_currentpage++;
//	console.log(blz_currentpage,blz_pgzs)
	if(blz_currentpage>blz_pgzs){
		layer.msg("已到末页");
		blz_currentpage=blz_currentpage-1;
		return;
	}
	blz_findsj(blz_currentpage);
}
//下一页
function blz_gosyy(){
	blz_currentpage--;
	if(blz_currentpage<=0){
		layer.msg("已到首页");
		blz_currentpage=blz_currentpage+1;
		return;
	}
	blz_findsj(blz_currentpage);
}
//末页
function blz_goend(){
	blz_currentpage = blz_pgzs;
	blz_findsj(blz_currentpage);
}
//某一页
//function blz_myy(obj){
//	blz_currentpage = $(obj).text();
//	$('.btn-warning').removeClass('btn-warning').addClass('btn-info');
//	$(obj).removeClass('btn-info').addClass('btn-warning');
//	blz_findsj(blz_currentpage);
//}
//跳页
function blz_tzym(){
	if($('#jsyblz_ym').val()!=""){
		if(blz_pgzs > parseInt($('#jsyblz_ym').val())){
			blz_currentpage = $('#jsyblz_ym').val();
			blz_findsj(blz_currentpage);
		}else{
			hint_info("jsyblz_ym", "数字过大", "3");
		}
	}
}

//驾驶员申请导出
$("#pt_jsyblz_daochu").click(function(){
	url = "../../../db/dbjsycxexcle?postData="
		+ '{"page":"1","pageSize":"100000","xm":"' + $("#pt_jsyblz_jsyxm").val() + '","zjhm":"' + $("#pt_jsyblz_zjhm").val() + 
        '","dbr":"' + $("#pt_qjsyblz_dbr").val() + '","blzt":"' + $("#pt_qjsyblz_blzt").val() + '"}', window.open(url)
})