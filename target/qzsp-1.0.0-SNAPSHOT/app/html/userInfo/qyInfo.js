var a = 0;
//登录成功后查询企业信息放到账号信息中
$.ajax({
    type:"post",
    url: basePath + "user/grdlxx",
    data:{},
    dataType: "json",
    success:function(data){
    	console.log(data[0])
    	list = data[0];
        $("#qymc").html(data[0].QYMC);
        $("#frdb").html(data[0].XM);
        $("#jbrcm").html(data[0].JBRXM);
        $("#jbrsjh").html(data[0].USER_NAME);
        $("#zcsj").html(new Date(data[0].ZCRQ).format("yyyy-MM-dd"));
        var tab = "";
        if(data[0].IS_ADMIN=='0'){
        	$(".buttonList").append('<li><a href="javascript:void(0);" id="xgsjhm" class="xgxxBtn">修改手机号</a></li>'+
        			'<li><a href="javascript:void(0);" id="xgjbrxx" class="xgxxBtn">修改经办人信息</a></li>'+
        			'<li><a href="javascript:void(0);" id="xgqyxx" class="xgxxBtn">修改企业信息</a></li>');
        	tab+='<div class="panel-body userInfo" id="jbrglPanel">'+
					'<div class="title">'+
					'<span>经办人管理</span>'+
					'<div class="xgxxBox">'+
						'<a href="javascript:void(0);" class="btn btnBlue" id="addJBR" style="margin-top: -10px; padding-left: 15px; padding-right: 15px; color: #ffffff;">添加经办人</a>'+
					'</div>'+
				'</div>'+
				'<div class="center" style="min-height: 100px;">'+
					'<div class="textInfoBox">'+
						'<table id="jyzxx_tabel" border="1">'+
							'<thead>'+
							'<tr>'+
								'<th style="width: 6em;">序号</th>'+
								'<th style="width: 16em;">姓名</th>'+
								'<th style="width: 16em;">手机号码</th>'+
								'<th>操作</th>'+
							'</tr>'+
							'</thead>'+
//							'<!--<tr>'+
//								'<td colspan="4" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td>'+
//							'</tr>-->'+
							
							'<tbody id="jbrglbody">'+
//								'<tr>'+
//									'<td>000001</td>'+
//									'<td>刘强</td>'+
//									'<td>13544846811</td>'+
//									'<td>'+
//										'<button class="btn btnBlue btnEdit">编辑</button>&nbsp;&nbsp;'+
//										'<button class="btn btnBlue">解除</button>'+
//									'</td>'+
//								'</tr>'+
							'</tbody>'+
							'<tbody>'+
							'</tbody>'+
						'</table>'+
					'</div>'+
				'</div>'+
			'</div>';
        	$("#jbrgl").html(tab);
        	addjbr();
        	$('#addJBR').on('click', function () {
        		a=1;
                var title = '添加经办人',
    				html = jbrHtml('add', '');
                layer.open({
                    type: 1,
                    title: title,
                    area: ['750px', '480px'],
                    content: html,
                    btn: ['提交', '取消'],
                    yes: function(index) {
                    	if(jbr_tj('1')){
                    		jyz_form.submit();
                    	}
                    },
                    btn2: function (index) {

                    },
                    cancel: function (index) {
//                         alert('是取消还是右上角关闭按钮自行查看')
                    }
                })
                $("#jbrlxfs").removeAttr("readonly");
                bindImageChange();
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
        		$("#jbrglbody").html(table);
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
                    })
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
		            	        url: basePath + "EditInfo/QyDel",
		            	        data:'postData={"SJHM":"' + jbrxx[i].USER_NAME + '"}',
		            	        dataType: "json",
		            	        success:function(data){
		            	        	console.log(data)
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
			console.log(data)
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
	 console.log(a)
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
						console.log(data)
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
////修改经办人信息
function xgqyjbr(){
	$.ajax({
        type:"post",
        url: basePath + "EditInfo/QyEdit",
        data:'postData={"zjhm":"' + $("#zzjgdmz").val() + '","xm":"' + $("#qy_jbrName").val() +
        '","type":"1","SJHM":"' + $("#jbrlxfs").val() + '","YZM":"' + $("#jyzyzm").val() +
        '","mm":"' + hex_md5($("#jyzpwd").val()) + '","qrmm":"' + hex_md5($("#jyzrepwd").val()) + '"}',
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
			console.log(data)
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
	        	        	console.log(info)
	        	        	if(info == '9'||info == '2'){//确认信息
	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
		        	        	location.replace('../clsq/shxx.html');
	        	        	}else if(info == '4'||info == '1'){//变更性质
	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
		        	        	location.replace('../clsq/bgxz.html');
	        	        	}else if(info == '5'||info == '6'||info == '7'){//等待发证
	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
		        	        	location.replace('../clsq/ddfz.html');
	        	        	}else if(info == '3'){//补充资料
	        	        		$.cookie('set', { duration: .2, name: 'regsiterType', value: 'qy'});
		        	        	location.replace('../clsq/shsp.html');
	        	        	}
	        	        },
	        	        error: function(){
	        	        }         
	        	     });
	        	});
			}else{
				$('#clyszbody').html('<tr><td colspan="5" style="height: 80px; font-size: 24px; text-align: center;">暂无数据</td></tr>');
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
	console.log(qy_currentpage,qy_pgzs)
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