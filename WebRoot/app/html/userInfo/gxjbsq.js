$('#go_next').on('click', function(){
    aaa = 1;
	if($("#pt_grjsyzdb_cphm").val()==""){
		Pop_up_box("车牌号码不能为空!","2");
		return;
    }else if(!regLicenseplate2.test($("#pt_grjsyzdb_cphm").val())) {
    	Pop_up_box("车牌号码格式不正确!","2");
		return;
    }

	 if($("#pt_grjsyzdb_syrxm").val()==""){
		 Pop_up_box("车辆所有人名称不能为空!","2");
			return;
    }else if(!regName.test($("#pt_grjsyzdb_syrxm").val())) {
   	 Pop_up_box("车辆所有人名称格式不正确!","2");
		return;
    }
	if($("#pt_grjsyzdb_jsje").val()==""){
		 Pop_up_box("购税缴税金额（原车）不能为空!","2");
			return;
    }else if(!regBxed.test($("#pt_grjsyzdb_jsje").val())) {
   	 Pop_up_box("购税缴税金额（原车）格式不正确!","2");
		return;
    }
	 if($("#pt_grjsyzdb_lxdh").val()==""){
		 Pop_up_box("车辆所有人联系电话不能为空!","2");
			return;
     }else if(!regPhone.test($("#pt_grjsyzdb_lxdh").val())) {
    	 Pop_up_box("车辆所有人联系电话格式不正确!","2");
 		return;
     }
	if($("#pt_grjsyzdb_gcfp").val()==""){
		 Pop_up_box("购车发票金额（原车）不能为空!","2");
			return;
    }else if(!regBxed.test($("#pt_grjsyzdb_gcfp").val())) {
   	 Pop_up_box("购车发票金额（原车）格式不正确!","2");
		return;
    }
	if($("#pt_grjsyzdb_djsj").val()==""){
		Pop_up_box("初次登记日期（新车）不能为空!","2");
		return;
    }else if(!regDate.test($("#pt_grjsyzdb_djsj").val())) {
    	Pop_up_box("初次登记日期（新车）格式不正确!","2");
		return;
    }
	 if($("#pt_grjsyzdb_djsjj").val()==""){
		 Pop_up_box("初次登记日期（原车）不能为空!","2");
			return;
     }else if(!regDate.test($("#pt_grjsyzdb_djsjj").val())) {
    	 Pop_up_box("初次登记日期（原车）格式不正确!","2");
 		return;
     }
	 if($("#pt_grjsyzdb_djsj").val()<$("#pt_grjsyzdb_djsjj").val()){
		 Pop_up_box("初次登记日期（原车）必须早于初次登记日期（新车）!","2");
		return;
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
    //机动车登记证
    if($('#fileupload_jdcdjzs').val()==''){
        Pop_up_box("机动车登记证书第1、2页必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_jdcdjzs').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("机动车登记证书第1、2页只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }
    //营运证书
    if($('#fileupload_yyz').val()==''){
        Pop_up_box("营运证(新车)必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_yyz').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("营运证(新车)只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }
    //车辆购置税缴税发票(原车)
    if($('#fileupload_clgzsjszz').val()==''){
        Pop_up_box("车辆购置税缴税发票(原车)必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_clgzsjszz').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("车辆购置税缴税发票(原车)只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }
    //车辆购置发票(原车)
    if($('#fileupload_jsfp').val()==''){
        Pop_up_box("车辆购置发票(原车)必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_jsfp').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("车辆购置发票(原车)只能上传.jpg或者.JPEG、png格式的图片!","2");
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

    //营运证(原车)
    if($('#fileupload_yyzyc').val()==''){
        Pop_up_box("营运证(原车)必须上传!","2");
        return false;
    }else{
        var jdcdjz=$('#fileupload_yyzyc').val();
        var a = jdcdjz.substr(jdcdjz.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
            Pop_up_box("营运证(原车)只能上传.jpg或者.JPEG、png格式的图片!","2");
            return false;
        }
    }
    aaa = 1;
    clxxtx_form.submit();
    layer.load(1);
})