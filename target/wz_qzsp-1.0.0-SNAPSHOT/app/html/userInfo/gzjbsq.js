$('#go_next').on('click', function(){
    aaa = 1;
	if($("#pt_grjsyzdb_cphm").val()==""){
		Pop_up_box("车牌号码不能为空!","2");
		return;
    }else if(!regLicenseplate2.test($("#pt_grjsyzdb_cphm").val())) {
    	Pop_up_box("车牌号码格式不正确!","2");
		return;
    }
	if($("#pt_grjsyzdb_ccdjrq").val()==""){
		Pop_up_box("车辆初次登记日期不能为空!","2");
		return;
    }else if(!regDate.test($("#pt_grjsyzdb_ccdjrq").val())) {
    	Pop_up_box("车辆初次登记日期格式不正确!","2");
		return;
    }
	 if($("#pt_grjsyzdb_syrxm").val()==""){
		 Pop_up_box("车辆所有人名称不能为空!","2");
			return;
     }else if(!regName.test($("#pt_grjsyzdb_syrxm").val())) {
    	 Pop_up_box("车辆所有人名称格式不正确!","2");
 		return;
     }
	 if($("#pt_grjsyzdb_lxdh").val()==""){
		 Pop_up_box("车辆所有人联系电话不能为空!","2");
			return;
     }else if(!regPhone.test($("#pt_grjsyzdb_lxdh").val())) {
    	 Pop_up_box("车辆所有人联系电话格式不正确!","2");
 		return;
     }
	 if($("#pt_grjsyzdb_gzsj").val()==""){
		 Pop_up_box("改装时间不能为空!","2");
			return;
     }else if(!regDate.test($("#pt_grjsyzdb_gzsj").val())) {
    	 Pop_up_box("改装时间格式不正确!","2");
 		return;
     }
	 if($("#pt_grjsyzdb_ccdjrq").val()>$("#pt_grjsyzdb_gzsj").val()){
		Pop_up_box("改装时间必须迟于车辆初次登记日期!","2");
 		return;
	 }
	 var xszrq = new Date($("#pt_grjsyzdb_ccdjrq").val());
	 var gzrq = new Date($("#pt_grjsyzdb_gzsj").val());
	 if(xszrq < new Date('2016-12-31')){
		 if(gzrq>new Date('2019-12-31')){
			Pop_up_box("按规定行驶证登记日期2016年12月31日前的，应于2019年12月31日前改装!","2");
	 		return;
		 }
	 }
	if($('input[name="jszfzjg"]:checked').val() == '0'){
		 //正面
	    if($('#fileupload_jdcsfzm').val()==''){
	        Pop_up_box("机动车所有人身份证明(正面)必须上传!","2");
	        return false;
	    }else{
	        var jdcsfzmz=$('#fileupload_jdcsfzm').val();
	        var a = jdcsfzmz.substr(jdcsfzmz.indexOf('.')+1);
	        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
	            Pop_up_box("机动车身份证明(正面)只能上传.jpg或者.JPEG、png格式的图片！","2");
	            return false;
	        }
	    }
	    //机动车所有人身份证明文件(反面)
	    if($('#fileupload_jdcsfzmfm').val()==''){
	        Pop_up_box("机动车所有人身份证明(反面)必须上传!","2");
	        return false;
	    }else{
	        var jdcsfzmf=$('#fileupload_jdcsfzmfm').val();
	        var a = jdcsfzmf.substr(jdcsfzmf.indexOf('.')+1);
	        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
	            Pop_up_box("机动车身份证明(正面)只能上传.jpg或者.JPEG、png格式的图片！","2");
	            return false;
	        }
	    }
	}else{
		 if($('#fileupload_qyyyzz').val()==''){
		        Pop_up_box("组织机构代码证或企业营业执照（五证合一）必须上传!","2");
		        return false;
		    }else{
		        var jdcsfzmf=$('#fileupload_qyyyzz').val();
		        var a = jdcsfzmf.substr(jdcsfzmf.indexOf('.')+1);
		        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
		            Pop_up_box("组织机构代码证或企业营业执照（五证合一）只能上传.jpg或者.JPEG、png格式的图片！","2");
		            return false;
		        }
		    }
	}
    //营运证书
    if($('#fileupload_yyz').val()==''){
        Pop_up_box("营运证书必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_yyz').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("营运证书只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }
    //行驶证
    if($('#fileupload_xxszzm').val()==''){
        Pop_up_box("机动车行驶证（主页和副页的正面）必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_xxszzm').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("机动车行驶证（主页和副页的正面）只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }

    //特种证明
    if($('#fileupload_tzzm').val()==''){
        Pop_up_box("特种设备使用登记证图片必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_tzzm').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("特种设备使用登记证图片只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }
    aaa = 1;
    clxxtx_form.submit();
//    layer.load(1);
})