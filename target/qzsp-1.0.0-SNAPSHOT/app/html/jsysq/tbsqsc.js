/**
 * Created by dywed on 2017/3/15.
 */
// function jdcjszdabhReg(type) {
//     var jszdabh = $('#jdcjszdabh');
//     if ('' === jszdabh.val()) {
//         promInfoTemp(jszdabh.attr('id'), '请输入机动车驾驶证档案编号', type);
//         return false;
//     }
//     return true;
// }
// function cclzrqReg(type) {
//     var cclzrq = $('#cclzrq');
//     if ('' === cclzrq.val()) {
//         promInfoTemp(cclzrq.attr('id'), '请选择日期', type);
//         return false;
//     } else if (!regCsrq.test(cclzrq.val())) {
//         promInfoTemp(cclzrq.attr('id'), '日期格式不正确', type);
//         return false;
//     }
//     return true;
// }
function jsyyz(){
    //机动车驾驶证档案编号
    $("#jdcjszdabh").focus(function(){
        hint_info("jdcjszdabh","请输入机动车驾驶证档案编号","3");
    });
    $("#jdcjszdabh").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jdcjszdabh").val()==""){
            hint_info("jdcjszdabh","机动车驾驶证档案编号不能为空!","3");
            div.addClass('has-error');
        }else if(!regDabh.test($("#jdcjszdabh").val())){
            hint_info("jdcjszdabh","机动车驾驶证档案编号格式不正确!","3");
            div.addClass('has-error');
        }else {
            div.addClass('has-success');
        }
    });
    //领证日期
    $("#cclzrq").focus(function(){
        hint_info("cclzrq","请输入领证日期","3");
    });
    $("#cclzrq").on('blur change', function(){
        // removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#cclzrq").val()==""){
            hint_info("cclzrq","领证日期不能为空!","3");
            div.addClass('has-error');
        }else if(!regDate.test($("#cclzrq").val())){
            hint_info("cclzrq","领证日期格式不正确!","3");
            div.addClass('has-error');
        }
    });
    //准驾车型
    $("#zjcx").focus(function(){
        hint_info("zjcx","请输入准驾车型","3");
    });
    $("#zjcx").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#zjcx").val()==""){
            hint_info("zjcx","准驾车型不能为空!","3");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
//        else if(!regZjcx.test($("#zjcx").val())){
//            hint_info("zjcx","准驾车型格式不正确!","3");
//        }
    });
}
function tbsqsc_inputBoxReg() {
    var jdcjszdabh = $('#jdcjszdabh'),
        cclzrq = $('#cclzrq'),
        zjcx = $('#zjcx');
    //机动车驾驶证档案编号
    if (jdcjszdabh.val() == "" || !regDabh.test(jdcjszdabh.val())) {
        submitRegErrorInputBorderStyle(jdcjszdabh);
    }
    //领证日期
    if (cclzrq.val() == "" || !regDate.test(cclzrq.val())) {
        submitRegErrorInputBorderStyle(cclzrq);
    }
    //准驾车型
    if(zjcx.val()==""){
        submitRegErrorInputBorderStyle(zjcx);
    }
}
function cntjReg() {
    /*****表单提交验证******/
    tbsqsc_inputBoxReg();
    //机动车驾驶证档案编号
    if($("#jdcjszdabh").val()==""){
    	layer.closeAll('loading');
        Pop_up_box("机动车驾驶证档案编号不能为空!","2");
        return false;
    }else if(!regDabh.test($("#jdcjszdabh").val())){
    	layer.closeAll('loading');
        Pop_up_box("机动车驾驶证档案编号格式不正确!","2");
        return false;
    }
    //领证日期
    if($("#cclzrq").val()==""){
    	layer.closeAll('loading');
        Pop_up_box("领证日期不能为空!","2");
        return false;
    }else if(!regDate.test($("#cclzrq").val())){
    	layer.closeAll('loading');
        Pop_up_box("领证日期格式不正确!","2");
        return false;
    }
    //准驾车型
    if($("#zjcx").val()==""){
    	layer.closeAll('loading');
        Pop_up_box("准驾车型不能为空!","2");
        return false;
    }
//    else if(!regZjcx.test($("#zjcx").val())){
//        Pop_up_box("准驾车型格式不正确!","2");
//        return false;
//    }
    /****复选框提交验证****/
    if (!$("input[name='CNTJ']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认取得温州市户籍，或者在本市取得浙江省居住证6个月以上", 2);
        return false;
    }
    if (!$("input[name='CNTJ1']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认未达法定退休年龄，取得相应准驾车型机动车驾驶证并具有3 年以上驾驶经历!", 2);
        return false;
    }
    if (!$("input[name='CNTJ2']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认无交通肇事犯罪、危险驾驶犯罪记录，无吸毒记录，无饮酒后驾驶记录，最近连续3个记分周期内没有记满12分记录!", 2);
        return false;
    }
    if (!$("input[name='CNTJ3']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认无暴力犯罪记录；有其他犯罪记录的应向属地公安机关报备!", 2);
        return false;
    }
    if (!$("input[name='CNTJ4']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认自申请考试之日前3年内未被撤销出租汽车驾驶员从业资格证的记录!", 2);
        return false;
    }
    if (!$("input[name='CNTJ5']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认本人承诺内容!", 2);
        return false;
    }
    //巡游车证或者外地网约车图片
    if($("#xyc").is(':checked')){
        if($('#fileupload_xyccyzgz').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("巡游车证或者外地网约车图片必须上传!","2");
            return false;
        }else{
            var xyccyzgz=$('#fileupload_xyccyzgz').val();
            var xyc = xyccyzgz.substr(xyccyzgz.indexOf('.')+1);
            if(xyc!='jpg'&&xyc!='jpeg'&&xyc!='JPG'&&xyc!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("巡游车证或者外地网约车图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
    }
    if($(".jiguan:checked").val()=='温州籍'){

    	//身份证明原件（正面）
        if($('#fileupload_jsysfzmzm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（正面）图片必须上传!","2");
            return false;
        }else{
            var jmsfzmzm=$('#fileupload_jsysfzmzm').val();
            var bsfzz = jmsfzmzm.substr(jmsfzmzm.indexOf('.')+1);
            if(bsfzz!='jpg'&&bsfzz!='jpeg'&&bsfzz!='JPG'&&bsfzz!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("身份证明原件（正面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //身份证明原件（反面）
        if($('#fileupload_jsysfzmfm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（反面）图片必须上传!","2");
            return false;
        }else{
            var jmsfzmfm=$('#fileupload_jsysfzmfm').val();
            var bsfzf = jmsfzmfm.substr(jmsfzmfm.indexOf('.')+1);
            if(bsfzf!='jpg'&&bsfzf!='jpeg'&&bsfzf!='JPG'&&bsfzf!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("身份证明原件（反面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //机动车驾驶证图片
        if($('#fileupload_jsyjszzb').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("机动车驾驶证图片必须上传!","2");
            return false;
        }else{
            var jsyjszzb=$('#fileupload_jsyjszzb').val();
            var a = jsyjszzb.substr(jsyjszzb.indexOf('.')+1);
            if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("机动车驾驶证图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
    }else{

        //无交通肇事犯罪、危险驾驶犯罪记录、无饮酒后驾驶记录、最近连续3个记分周期内没有记满12分记录证明
        if($('#fileupload_jsysfzmzm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("无交通肇事犯罪、危险驾驶犯罪记录、无饮酒后驾驶记录、最近连续3个记分周期内没有记满12分记录证明图片必须上传!","2");
            return false;
        }else{
            var jsysfzmzm=$('#fileupload_jsysfzmzm').val();
            var a = jsysfzmzm.substr(jsysfzmzm.indexOf('.')+1);
            if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("无交通肇事犯罪、危险驾驶犯罪记录、无饮酒后驾驶记录、最近连续3个记分周期内没有记满12分记录证明只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //无吸毒记录、无暴力犯罪记录证明
        if($('#fileupload_jsysfzmfm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("无吸毒记录、无暴力犯罪记录证明图片必须上传!","2");
            return false;
        }else{
            var jsysfzmfm=$('#fileupload_jsysfzmfm').val();
            var b = jsysfzmfm.substr(jsysfzmfm.indexOf('.')+1);
            if(b!='jpg'&&b!='jpeg'&&b!='JPG'&&b!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("无吸毒记录、无暴力犯罪记录证明图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //身份证明原件（正面）
        if($('#fileupload_jmsfzmzm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（正面）图片必须上传!","2");
            return false;
        }else{
            var jmsfzmzm=$('#fileupload_jmsfzmzm').val();
            var bsfzz = jmsfzmzm.substr(jmsfzmzm.indexOf('.')+1);
            if(bsfzz!='jpg'&&bsfzz!='jpeg'&&bsfzz!='JPG'&&bsfzz!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("身份证明原件（正面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //身份证明原件（反面）
        if($('#fileupload_jmsfzmfm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（反面）图片必须上传!","2");
            return false;
        }else{
            var jmsfzmfm=$('#fileupload_jmsfzmfm').val();
            var bsfzf = jmsfzmfm.substr(jmsfzmfm.indexOf('.')+1);
            if(bsfzf!='jpg'&&bsfzf!='jpeg'&&bsfzf!='JPG'&&bsfzf!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("身份证明原件（反面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //浙江省居住证(正面)
        if($('#fileupload_zjsjzzzm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("浙江省居住证(正面)图片必须上传!","2");
            return false;
        }else{
            var zjsjzzzm=$('#fileupload_zjsjzzzm').val();
            var jzz = zjsjzzzm.substr(zjsjzzzm.indexOf('.')+1);
            if(jzz!='jpg'&&jzz!='jpeg'&&jzz!='JPG'&&jzz!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("浙江省居住证(正面)图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //浙江省居住证(反面)
        if($('#fileupload_zjsjzzfm').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("浙江省居住证(反面)图片必须上传!","2");
            return false;
        }else{
            var zjsjzzfm=$('#fileupload_zjsjzzfm').val();
            var jzf = zjsjzzfm.substr(zjsjzzfm.indexOf('.')+1);
            if(jzf!='jpg'&&jzf!='jpeg'&&jzf!='JPG'&&jzf!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("浙江省居住证(反面)图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
        //机动车驾驶证
        if($('#fileupload_jsyjszzb').val()==''){
        	layer.closeAll('loading');
            Pop_up_box("机动车驾驶证图片必须上传!","2");
            return false;
        }else{
            var jsyjszzb=$('#fileupload_jsyjszzb').val();
            var jdcjsz = jsyjszzb.substr(jsyjszzb.indexOf('.')+1);
            if(jdcjsz!='jpg'&&jdcjsz!='jpeg'&&jdcjsz!='JPG'&&jdcjsz!='JPEG'){
            	layer.closeAll('loading');
                Pop_up_box("机动车驾驶证图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
                return false;
            }
        }
    }
    return true;
}
//温州籍图片验证
function tpyz(){
	//身份证明原件（正面）
    if($('#fileupload_jsysfzmzm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("身份证明原件（正面）图片必须上传!","2");
        return false;
    }else{
        var jmsfzmzm=$('#fileupload_jsysfzmzm').val();
        var bsfzz = jmsfzmzm.substr(jmsfzmzm.indexOf('.')+1);
        if(bsfzz!='jpg'&&bsfzz!='jpeg'&&bsfzz!='JPG'&&bsfzz!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（正面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //身份证明原件（反面）
    if($('#fileupload_jsysfzmfm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("身份证明原件（反面）图片必须上传!","2");
        return false;
    }else{
        var jmsfzmfm=$('#fileupload_jsysfzmfm').val();
        var bsfzf = jmsfzmfm.substr(jmsfzmfm.indexOf('.')+1);
        if(bsfzf!='jpg'&&bsfzf!='jpeg'&&bsfzf!='JPG'&&bsfzf!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（反面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //机动车驾驶证图片
    if($('#fileupload_jsyjszzb').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("机动车驾驶证图片必须上传!","2");
        return false;
    }else{
        var jsyjszzb=$('#fileupload_jsyjszzb').val();
        var a = jsyjszzb.substr(jsyjszzb.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("机动车驾驶证图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    return true;
}
//非温州籍图片验证
function fwz_tpyz(){
    //无交通肇事犯罪、危险驾驶犯罪记录、无饮酒后驾驶记录、最近连续3个记分周期内没有记满12分记录证明
    if($('#fileupload_jsysfzmzm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("无交通肇事犯罪、危险驾驶犯罪记录、无饮酒后驾驶记录、最近连续3个记分周期内没有记满12分记录证明图片必须上传!","2");
        return false;
    }else{
        var jsysfzmzm=$('#fileupload_jsysfzmzm').val();
        var a = jsysfzmzm.substr(jsysfzmzm.indexOf('.')+1);
        if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("无交通肇事犯罪、危险驾驶犯罪记录、无饮酒后驾驶记录、最近连续3个记分周期内没有记满12分记录证明只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //无吸毒记录、无暴力犯罪记录证明
    if($('#fileupload_jsysfzmfm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("无吸毒记录、无暴力犯罪记录证明图片必须上传!","2");
        return false;
    }else{
        var jsysfzmfm=$('#fileupload_jsysfzmfm').val();
        var b = jsysfzmfm.substr(jsysfzmfm.indexOf('.')+1);
        if(b!='jpg'&&b!='jpeg'&&b!='JPG'&&b!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("无吸毒记录、无暴力犯罪记录证明图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //身份证明原件（正面）
    if($('#fileupload_jmsfzmzm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("身份证明原件（正面）图片必须上传!","2");
        return false;
    }else{
        var jmsfzmzm=$('#fileupload_jmsfzmzm').val();
        var bsfzz = jmsfzmzm.substr(jmsfzmzm.indexOf('.')+1);
        if(bsfzz!='jpg'&&bsfzz!='jpeg'&&bsfzz!='JPG'&&bsfzz!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（正面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //身份证明原件（反面）
    if($('#fileupload_jmsfzmfm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("身份证明原件（反面）图片必须上传!","2");
        return false;
    }else{
        var jmsfzmfm=$('#fileupload_jmsfzmfm').val();
        var bsfzf = jmsfzmfm.substr(jmsfzmfm.indexOf('.')+1);
        if(bsfzf!='jpg'&&bsfzf!='jpeg'&&bsfzf!='JPG'&&bsfzf!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("身份证明原件（反面）图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //浙江省居住证(正面)
    if($('#fileupload_zjsjzzzm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("浙江省居住证(正面)图片必须上传!","2");
        return false;
    }else{
        var zjsjzzzm=$('#fileupload_zjsjzzzm').val();
        var jzz = zjsjzzzm.substr(zjsjzzzm.indexOf('.')+1);
        if(jzz!='jpg'&&jzz!='jpeg'&&jzz!='JPG'&&jzz!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("浙江省居住证(正面)图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //浙江省居住证(反面)
    if($('#fileupload_zjsjzzfm').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("浙江省居住证(反面)图片必须上传!","2");
        return false;
    }else{
        var zjsjzzfm=$('#fileupload_zjsjzzfm').val();
        var jzf = zjsjzzfm.substr(zjsjzzfm.indexOf('.')+1);
        if(jzf!='jpg'&&jzf!='jpeg'&&jzf!='JPG'&&jzf!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("浙江省居住证(反面)图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //机动车驾驶证
    if($('#fileupload_jsyjszzb').val()==''){
    	layer.closeAll('loading');
        Pop_up_box("机动车驾驶证图片必须上传!","2");
        return false;
    }else{
        var jsyjszzb=$('#fileupload_jsyjszzb').val();
        var jdcjsz = zjsjzzfm.substr(zjsjzzfm.indexOf('.')+1);
        if(jdcjsz!='jpg'&&jdcjsz!='jpeg'&&jdcjsz!='JPG'&&jdcjsz!='JPEG'){
        	layer.closeAll('loading');
            Pop_up_box("机动车驾驶证图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
            return false;
        }
    }
    //驾驶员本人近期免冠二寸照
//    if($('#fileupload_ycz').val()==''){
//        Pop_up_box("驾驶员本人近期免冠二寸照图片必须上传!","2");
//        return false;
//    }else{
//        var ycz=$('#fileupload_ycz').val();
//        var brzp = ycz.substr(ycz.indexOf('.')+1);
//        if(brzp!='jpg'&&brzp!='jpeg'&&brzp!='JPG'&&brzp!='JPEG'){
//            Pop_up_box("驾驶员本人近期免冠二寸照图片只能上传.jpg或者.JPEG、png格式的图片！!","2");
//            return false;
//        }
//    }
    return true;
}