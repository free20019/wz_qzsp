/**
 * html5 file upload
 */

function PicUpload(){

	this.thumbnailW = 80;
	this.thumbnailH = 60;
	this.deletePicW = 16;
	this.picDivH = 60;
	this.maxFiles = 6;
	this.uploadUrl = '/zjzd/UploadServlet';
	this.cancelPicId=[];
	this.filesMap = {};
	this.currentYwid ='';
	this.fileUploadHeight = 60;

	this.ajaxFileUpload = function(ywid,needUpdate){
//		if(ywid == undefined || ywid == ""){
//			return;
//		}
	 	var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(e) {
			if (xhr.readyState == 4 && xhr.status==200) {
		// console.info(xhr.responseText);
//					this.getPics(ywid);
					this.filesMap = {};
					return xhr.responseText;
			}
		};

		/*
		$($(window.top.document).find("input[id^='file0']")).each(
			function(i){
				var files = this.files;
				var formData = new FormData();
				for (var i=0; i<files.length; i++) {
					var flag = true;
					for(var j=0;j<cancelPicId.length;j++){
						if(this.cancelPicId[j]==i){
							flag = false;
							break;
						}
					}
					if(flag){
						formData.append(this.name, files[i]);
					}
				}
				xhr.open('POST', this.uploadUrl +'?ywid='+ywid+"&needUpdate="+(needUpdate==undefined?false:needUpdate))
					xhr.send(formData)
				}
		);

		*/

		var formData = new FormData();
		var filesMapLength = 0;
		for(key in this.filesMap){
			var flag = true;
			for(var i = 0;i<this.cancelPicId.length;i++){
				if(this.cancelPicId[i]==key){
					flag = false;
					break;
				}
			}
			if(flag){
				filesMapLength++;
				formData.append(key, this.filesMap[key]);
			}
		}
		console.log('ywid:\t'+this.currentYwid+',filesMapLength:\t'+filesMapLength)
		if(filesMapLength != 0 ){
			xhr.open('POST', this.uploadUrl +'?ywid='+this.currentYwid+"&needUpdate="+(needUpdate==undefined?false:needUpdate))
			xhr.send(formData)
		}
	}

	this.clearPic = function (){
		$("#show_pic_id").empty();
		this.cancelPicId=[];
		this.filesMap = {};
		this.currentYwid = '';

		if($('#show_pic_id').find('img').length==0){
			hidePicDiv();
			$(window.parent.document).find('#fileUploadId').css('height',1);
		}else{
			showPicDiv();
			$(window.parent.document).find('#fileUploadId').css('height',this.fileUploadHeight);
		}


		window.parent.resize();
	}

	this.deletePic = function(ywid,item){
//		if(ywid == undefined || ywid == ""){
//			return;
//		}
		event.stopPropagation();
		console.log(this.currentYwid+'\t'+item+'\t');
		var r = confirm("确认删除图片");
		if(!r){
			return false;
		}
		var picUpload = this;
		$.get(this.uploadUrl+'?delfile='+item,function(data){
			if(data){
				console.info("delete pic data: "+ data);
				picUpload.getPics(picUpload.currentYwid);
			}
		});

	}


	//作废
	this.getPics = function (ywid){
//		if(ywid == undefined || ywid == ""){
//			return;
//		}
//		if(this.currentYwid != ywid){
//			this.currentYwid = ywid;
//			this.cancelPicId = [];
//			this.filesMap = {};
//		}
		console.info("getPics call..........")
	  	$("#show_pic_id").empty();
		var yywid = this.currentYwid;
		var thumbnailH2 = this.thumbnailH;
		var thumbnailW2 = this.thumbnailW;
		var uploadUrl2 = this.uploadUrl;
		var picUpload2 = this;
		$.get(this.uploadUrl+'?getPicsNameByYwid=xx&ywid='+this.currentYwid,function(data){
			console.log('ywid'+ yywid)
			var ywid = yywid;
			var picUpload = picUpload2;
			var thumbnailW = thumbnailW2;
			var thumbnailH = thumbnailH2;
			var uploadUrl = uploadUrl2;
			if(data){
				$("#show_pic_id").empty();
				$.each(data.split(','),
					function(i,item){
					 $('#show_pic_id').append('<span id="preImgId_'+i+'" style="position: relative;"><img class="thumbnail" name='+item+'  src="'+uploadUrl+'?getthumb='+item+'" width="'+thumbnailW+'px" height="'+thumbnailH+'px" style="margin-left: 5px" /><div class="pic_delete"  id="picDeleteId_'+i+'"></div></span>');
					 $('#preImgId_'+i).bind('click',{picUpload:picUpload,item:item},function(event){
//							picUpload.viewImg(1,item)
							event.data.picUpload.viewImg(2,event.data.item)
					 })
					 $('#picDeleteId_'+i).bind('click',{picUpload:picUpload,name:item,ywid:ywid},function(event){
						var o = event.data;
						o.picUpload.deletePic(o.ywid,o.name)
					 })
					}


				)
				if($('#show_pic_id').find('img').length==0){
					hidePicDiv();
					$(window.parent.document).find('#fileUploadId').css('height',1);
				}else{
					showPicDiv();
					$(window.parent.document).find('#fileUploadId').css('height',this.fileUploadHeight);
				}

				//jQuery('img.thumbnail').imgZoom();
			}else{
				hidePicDiv();
				$(window.parent.document).find('#fileUploadId').css('height',1);
			}
			//window.parent.resize();
		});
	}

	showPicDiv = function (){
		$('#show_pic_id').css('height',this.picDivH +'px');
		$('#show_pic_id').css('display','block');
	}

	hidePicDiv = function (){
		$('#show_pic_id').css('height','0px');
	}

	this.msg = function (mId) {

		var topDiv ='<div id="msg_bg" style="height:'+window.top.innerHeight+'px;z-index: 9999;width: '+(window.top.innerWidth-1)+'px;position: absolute;background-color: #8CA0A2;top: 0;left: 0;opacity: 0.9;"></div>';
		var topMsgBox = '<div id="msg_box" \
		style="position:absolute;height:'+window.top.innerHeight*0.8+'px;left:10%;top:10%;margin-left:auto;margin-right:auto;width:80%;border:2px solid #0000ff;background-color:#FFFFFF;color:#006699;z-index:9999;">\
		<div style="display:block;background-color:#D2D2FF;font-weight:bold;margin:0;padding:0;width:100%;">\
		<div style="margin:0;padding:5px;float:left;width:90%;">图片上传</div>\
		<div style="float:left;width:5%;text-align:right;margin:0;padding:5px 0;">\
		<a href="javascript:close_msg();">×</a></div></div><div style="margin:0;padding:3em;font-size:16px;text-align:center;">\
		<input style="position: absolute;left: 15px;top: 25px;" type="file" name="file0" id="file0" multiple="multiple"><br>\
		<div id="imgs" style="overflow-y: auto;height: 70%;">	</div><p><input id="pre_submit_id" type="button" value="确定" > \
		<input id="pre_submit_cancel" type="button" value="取消" onclick="close_msg();"></p></div></div>';

//		if(this.currentYwid != window.parent.saveId){
//			this.currentYwid = window.parent.saveId;
//			this.cancelPicId = [];
//			this.filesMap = {};
//		}
		$(window.top.document.body).find('#msg_bg').remove();
		$(window.top.document.body).find('#msg_box').remove();
		$(window.top.document.body).append($(topDiv));
		$(window.top.document.body).append($(topMsgBox));
		$(window.top.document.body).find('#imgs').css('height',window.top.innerHeight*0.6+'px')
		$(window.top.document.body).find('#file0').bind('change',{picUpload:this},function(event){
			var picUpload = event.data.picUpload
			picUpload.cancelPicId=[];
			var imgWidth = window.top.document.body.clientWidth*0.3
			for(var i=0;i<this.files.length;i++){
				if(this.files[i].type.indexOf('image')==-1){continue;}
				var url = null ;
				if (window.createObjectURL!=undefined) { // basic
					url = window.createObjectURL(this.files[i]) ;
				} else if (window.URL!=undefined) { // mozilla(firefox)
					url = window.URL.createObjectURL(this.files[i]) ;
				} else if (window.webkitURL!=undefined) { // webkit or chrome
					url = window.webkitURL.createObjectURL(this.files[i]) ;
				}

				picUpload.filesMap[this.files[i].name]=this.files[i];
				var objUrl = url;

				console.log("objUrl = "+objUrl) ;
				if (objUrl) {
					//$('<img name='+this.files[i].name+' style="margin-left:5px;width: '+imgWidth+'px"; src='+objUrl+' id="img1_'+i+'"/>');
					var divWarper = $('<div>',{
						id:'img_warper_id'+i,
						style:'float:left;width:800px'
					})
					var divTop = $('<div>',{});
					var divBottom = $('<div>',{
						style:'height:25px;text-align:left'
					});
					var img = $('<img>',{
						name:this.files[i].name,
						style:'margin-left:5px;width: 800px;font-size:13px',
						src:objUrl,
						id:'img1_'+i
					})

					divBottom.append($('<span>名称:'+this.files[i].name+'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大小:'+Math.round(this.files[i].size/1024*100)/100+'Kb</span><span style="cursor: pointer;margin-left: 20px;" id="img_warper_id'+i+'">删除</span>'));
					divTop.append(img);
					divWarper.append(divTop).append(divBottom);
					$(window.top.document.body).find('#imgs').append(divWarper);
					$('#img_warper_id'+i).bind('click',{picUpload:picUpload,fileName:this.files[i].name,id:'img_warper_id'+i},function(event){
						event.data.picUpload.addCancelPic(event.data.fileName,event.data.id)
					})
				}
			}

		}) ;


	$(window.top.document.body).find('#pre_submit_id').bind('click',{mId:mId,picUpload:this},function(event){
		event.data.picUpload.pre_submit(event)
	})

		// 点击添加图片时，已有的还原展示
	// $("img[id^='img_']").each(function(i,item){
	// var imgWidth = document.body.clientWidth*0.7
	// $('#imgs').append('<img style="width: '+imgWidth+'px"; src='+item.src+'
	// id="img1_'+i+'/>');
	// })

	}

	this.close_msg = function() {
		$(window.top.document.body).find('#msg_bg').css('display','none');
		$(window.top.document.body).find('#msg_box').css('display','none');
	}
	window.top.window.close_msg = this.close_msg;

	this.pre_submit = function(event){

		showPicDiv();
		//$('#show_pic_id').empty();
		var startId = $('#show_pic_id').find('img').length;
		var imgCount = $(window.top.document.body).find("img[id^='img1_']").length;

		if(startId + imgCount > this.maxFiles){
			alert('大于最大图片数:\t'+this.maxFiles+'张')
			return;
		}
		console.log('startId:\t'+startId+'imgCount:\t' + imgCount)
		var thumbnailW = this.thumbnailW;
		var thumbnailH = this.thumbnailH;
		var picUpload = this;
		$(window.top.document.body).find("img[id^='img1_']").each(function(i,item){
			$('#show_pic_id').append('<span  style="position: relative;" id="preImgId_'+startId+'"><img  style="width: '+thumbnailW+'px;height:'+thumbnailH+'px;margin-left: 5px;" src='+item.src+' id="img_'+startId+'"/><div class="pic_cancel" id="preCancelPicId_'+startId+'"></div></span>');

			$('#preImgId_'+startId).bind('click',{picUpload:picUpload},function(event){
				event.data.picUpload.viewImg(1,this)
			})
			$('#preCancelPicId_'+startId).bind('click',{picUpload:picUpload,startId:startId,i:i,name:item.name},function(event){
				var o = event.data;
				o.picUpload.preCancelPic(o.startId,o.i,o.name)
			})
			startId++;
		})

	  	var uploadedLength = $(window.top.document.body).find('#imgs').find('img').length;
	  	if(uploadedLength > this.maxFiles){
			return;
	  	}
		this.close_msg();

		var filesMap = this.filesMap;
		$($(window.top.document).find("input[id^='file0']")).each(
			function(i){
				var files = this.files;
				for (var i=0; i<files.length; i++) {
					filesMap[files[i].name]=files[i];
				}
			}
		);
		if(startId>0){
			$(window.parent.document).find('#fileUploadId').css('height',this.fileUploadHeight);
		}
		//window.parent.resize();
	//	console.log(event.data.mId);
	//	getMarker(event.data.mId).picInfo = $('#show_pic_id').html();
	}


	//从 filesMap 生成
	this.pre_submit2 = function(){
		showPicDiv();
		//$('#show_pic_id').empty();
		var startId = $('#show_pic_id').find('img').length;
		var thumbnailW = this.thumbnailW;
		var thumbnailH = this.thumbnailH;
		var picUpload = this;
		var jslength=0;
		for(var key in this.filesMap){
			jslength++;
		}
		if(jslength == 0){
			return;
		}


		for(key in this.filesMap){
			var url = null ;
			if (window.createObjectURL!=undefined) { // basic
				url = window.createObjectURL(this.filesMap[key]) ;
			} else if (window.URL!=undefined) { // mozilla(firefox)
				url = window.URL.createObjectURL(this.filesMap[key]) ;
			} else if (window.webkitURL!=undefined) { // webkit or chrome
				url = window.webkitURL.createObjectURL(this.filesMap[key]) ;
			}
			$('#show_pic_id').append('<span  style="position: relative;" id="preImgId_'+startId+'"><img  style="width: '+thumbnailW+'px;height:'+thumbnailH+'px;margin-left: 5px;" src='+url+' id="img_'+startId+'"/><div class="pic_cancel" id="preCancelPicId_'+startId+'"></div></span>');

			$('#preImgId_'+startId).bind('click',{picUpload:picUpload},function(event){
				event.data.picUpload.viewImg(1,this)
			})
			$('#preCancelPicId_'+startId).bind('click',{picUpload:picUpload,startId:startId,key:key},function(event){
				var o = event.data;
				o.picUpload.preCancelPic(o.startId,o.startId,o.key)
			})
			startId++;
		}

//		$(this.filesMap).each(function(i,item){
//			//$('#show_pic_id').append('<img  style="width: '+80+'px;height:'+60+'px;margin-left: 5px;"; src='+item.src+' id="img_'+i+'"/>');
//			// console.log(item)
//			//$('#show_pic_id').append('<a id="preImgId_'+startId+'" href="#"><img  style="width: '+this.thumbnailW+'px;height:'+this.thumbnailH+'px;margin-left: 5px;"; src='+item.src+' id="img_'+startId+'"/><div class="pic_delete" style="left: '+((startId+1)*(this.thumbnailW+5)-this.deletePicW)+'px;" onclick="preCancelPic('+startId+','+i+')"></div></a>');
//			$('#show_pic_id').append('<span  style="position: relative;" id="preImgId_'+startId+'"><img  style="width: '+thumbnailW+'px;height:'+thumbnailH+'px;margin-left: 5px;" src='+item.src+' id="img_'+startId+'"/><div class="pic_cancel" id="preCancelPicId_'+startId+'"></div></span>');
//
//			$('#preImgId_'+startId).bind('click',{picUpload:picUpload},function(event){
//				event.data.picUpload.viewImg(1,this)
//			})
//			$('#preCancelPicId_'+startId).bind('click',{picUpload:picUpload,startId:startId,i:i,name:item.name},function(event){
//				var o = event.data;
//				o.picUpload.preCancelPic(o.startId,o.i)
//			})
//			startId++;
//		})
	}


	window.top.window.close_msg2 = this.close_msg2
	this.addCancelPic = function(fileName,warperId){
		this.cancelPicId.push(fileName);
		$(window.top.document).find('#'+warperId).remove();
	}
	window.top.window.addCancelPic = this.addCancelPic

	this.preCancelPic = function(id,inputId,name){
		var imgItem = $('#preImgId_'+id);
		event.stopPropagation();
		if(imgItem){
			imgItem.remove();
		}

		delete this.filesMap[name];

	}

	this.showPicUpload = function(mId){
		this.msg(mId)
	}

	this.viewImg = function(flag,o){
		var picUpload = this;
		var imgSrc = "";
		if(flag == 1){
			var img = $(o).find('img')[0];//location
			imgSrc = img.src;
		}else if(flag == 2){
			imgSrc = this.uploadUrl+'?getfile='+o;
		}
		var w = 800;
		var h=600;
		var left = (window.top.innerWidth-w)/2;
		var top = (window.top.innerHeight-70-h)/2;

		var msgbg2 = $('<div>',{
			click:function(){close_msg2()},
			id:"msg_bg_2",
			style:'height:'+window.top.innerHeight+'px;z-index: 99999;width: '+(window.top.innerWidth-1)+'px;position: absolute;background-color: #000;top: 0;left: 0;opacity: 0.9;'
		})

		var msgbox2 = $('<div>',{
			id:"msg_box_2",
			style:'overflow: hidden;text-align: center;top:'+top+'px;left:'+left+'px;height:'+h+'px;z-index: 99999;width: '+w+'px;position: absolute;'
		})

		var imgItem = $('<img>',{
			id:'viewImgId',
			style:'position: absolute;',
			load:function(){resizeImg(this)},
			src:imgSrc
		}).appendTo(msgbox2);

		var imgGroup = $('<div>',{
			id:'imgGroupId',
			style:'text-align: center;width:680px;height:60px;position: absolute;left:'+(window.top.innerWidth-680)/2+'px;top:'+(window.top.innerHeight-70)+'px'
		})


		$('#show_pic_id').find('img').each(function(i,item){
			var flag2;
			var imgSrc2;
			if(item.src.indexOf('blob')==0){
				flag2=1;
				imgSrc2 = item.src;
			}else{
				flag2=2;
				imgSrc2 = picUpload.uploadUrl+'?getfile='+item.name;
			}
			$(imgGroup).append('<span style="position: relative;z-index: 99999;width: '+picUpload.thumbnailW+'px;height:'+picUpload.thumbnailH+'px;margin: 5px;"><img onclick="viewImg2('+flag2+',\''+imgSrc2+'\',this)"  style="border: 3px solid #181818;width: '+picUpload.thumbnailW+'px;height:'+picUpload.thumbnailH+'px;" src='+imgSrc2+' id="viewimg_'+i+'"/></span>');
		})

		close_msg2();
		$(window.top.document.body).append($(msgbg2));
		$(window.top.document.body).append($(msgbox2));
		$(window.top.document.body).append($(imgGroup));
	}

	this.viewImg2 = function(flag,imgSrc,img){
		var w = 800;
		var h=600;
		var left = (window.top.innerWidth-w)/2;
		var top = (window.top.innerHeight-h)/2


		var imgItem = $('<img>',{
			id:'viewImgId',
			style:'position: absolute;',
			load:function(){resizeImg(this)},
			src:imgSrc
		});


		$(window.top.document).find('#msg_box_2').empty();
		$(window.top.document).find('#msg_box_2').append(imgItem);

		$(window.top.document).find('img[id^=viewimg_]').each(function(i,item){
			item.style.borderColor = '#181818';
		});
		img.style.borderColor = '#ffffff';
	}

	window.top.window.viewImg2 = this.viewImg2

	this.close_msg2 = function() {
		$(window.top.document.body).find('#msg_bg_2').remove();
		$(window.top.document.body).find('#msg_box_2').remove();
		$(window.top.document.body).find('#msg_box_2').remove();
		$(window.top.document.body).find('#imgGroupId').remove();

	}
	window.top.window.close_msg2 = this.close_msg2

	resizeImg =function(tt){
		console.log(tt);
		var pW = 800;//父宽
		var pH = 600;//父高
		var dW = 800;
		var dH = 600;
		var h = tt.height;
		var w = tt.width;
		var bl = w/h;
		var test = $(window.top.document.body).find('#viewImgId')
		if(bl >= 1){
			if(w>pW){
				test.css('width',dW+'px');
				test.css('height' ,dW/bl+'px');
				test.css('left','1px');
				test.css('top',(pH-dW/bl)/2+'px');
			}else{
				test.css('left',(pW-w)/2+'px');
				test.css('top',(pH-h)/2+'px');
			}
		}else{
			if(h>pH){
				test.css('width',dH*bl+'px');
				test.css('height' ,dH+'px');
				test.css('left',(pW-dH*bl)/2+'px');
				test.css('top','1px');
			}else{
				test.css('left',(pW-w)/2+'px');
				test.css('top',(pH-h)/2+'px');
			}
		}
	}
//	window.top.window.resizeImg = resizeImg
//
//	$(window.top.window).resize(function(){
//		console.log('resize....');
//		var msgBg2 = $(window.top.document).find('#msg_bg_2')
//		var msgBox2 = $(window.top.document).find('#msg_box_2');
//		var imgGroupId = $(window.top.document).find('#imgGroupId');
//		msgBg2.css('width',window.top.innerWidth+'px');
//		msgBg2.css('height',window.top.innerHeight+'px');
//
//		msgBox2.css('left',(window.top.innerWidth-msgBox2.width())/2+'px');
//		msgBox2.css('top',(window.top.innerHeight-70-msgBox2.height())/2+'px');
//
//		imgGroupId.css('left',(window.top.innerWidth-imgGroupId.width())/2+'px');
//		imgGroupId.css('top',(window.top.innerHeight-70)+'px');
//	});

}