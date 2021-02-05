/************平台代办驾驶员证表单验证****************/
//身份证验证
function sfzReg(a,vala,valb){
    if($("#"+a).val()==""){
        hint_info(a,vala,"3");
    }else if(!regIDCard.test($("#"+a).val())){
        hint_info("a",valb,"3");
    }
}
//护照验证
function hzReg(id, val1, val2) {
    if ($("#" + id).val() == ""){
        hint_info(id, val1,"3");
    }else if(!regGwPassport.test($("#" + id).val())){
        hint_info(id, val2,"3");
    }
}
$("#pt_grjsyzdb_zjhm").focus(function(){
    hint_info("pt_grjsyzdb_zjhm","请输入证件号码","1");
});
$("#pt_grjsyzdb_zjhm").blur(function(){
    var zjlx=$("#pt_grjsyzdb_zjlx").val();
    if(zjlx=="身份证"){
        sfzReg('pt_grjsyzdb_zjhm','证件号码不能为空','证件号码格式不正确');
    } else{
        hzReg('pt_grjsyzdb_zjhm', '证件号码不能为空', '证件号码格式不正确!');
    }
});
//驾驶员姓名
$("#pt_grjsyzdb_jsyxm").focus(function(){
    hint_info("pt_grjsyzdb_jsyxm","请输入驾驶员姓名","2");
});
$("#pt_grjsyzdb_jsyxm").blur(function(){
    if($("#pt_grjsyzdb_jsyxm").val()==""){
        hint_info("pt_grjsyzdb_jsyxm","驾驶员姓名不能为空!","2");
    }else if(!regName_zw.test($("#pt_grjsyzdb_jsyxm").val())) {
        hint_info("pt_grjsyzdb_jsyxm","驾驶员姓名格式不正确!","2");
    }
});
//国籍
$("#pt_grjsyzdb_gj").focus(function(){
    hint_info("pt_grjsyzdb_gj","请输入国籍","2");
});
$("#pt_grjsyzdb_gj").blur(function(){
    if($("#pt_grjsyzdb_gj").val()==""){
        hint_info("pt_grjsyzdb_gj","国籍不能为空!","2");
    }else if(!regGj.test($("#pt_grjsyzdb_gj").val())) {
        hint_info("pt_grjsyzdb_gj","国籍格式不正确!","2");
    }
});
//出生日期
//$("#pt_grjsyzdb_csrq").focus(function(){
//    hint_info("pt_grjsyzdb_csrq","请选择出生日期","2");
//});
//$("#pt_grjsyzdb_csrq").blur(function(){
//    if($("#pt_grjsyzdb_csrq").val()==""){
//        hint_info("pt_grjsyzdb_csrq","出生日期不能为空!","2");
//    }else if(!regCsrq.test($("#pt_grjsyzdb_csrq").val())) {
//        hint_info("pt_grjsyzdb_csrq","出生日期格式不正确!","2");
//    }
//});
//手机号码
$("#pt_grjsyzdb_sjhm").focus(function(){
    hint_info("pt_grjsyzdb_sjhm","请输入手机号码","2");
});
$("#pt_grjsyzdb_sjhm").blur(function(){
    if($("#pt_grjsyzdb_sjhm").val()==""){
        hint_info("pt_grjsyzdb_sjhm","手机号码不能为空!","2");
    }else if(!regPhone.test($("#pt_grjsyzdb_sjhm").val())) {
        hint_info("pt_grjsyzdb_sjhm","手机号码格式不正确!","2");
    }
});
//居住地址
$("#pt_grjsyzdb_lxdz").focus(function(){
    hint_info("pt_grjsyzdb_lxdz","请输入居住地址","2");
});
$("#pt_grjsyzdb_lxdz").blur(function(){
    var v1=$("#pt_grjsyzdb_lxdz").val();
    var lhg1=v1.length;
    if(lhg1>150){
        hint_info("pt_grjsyzdb_lxdz","居住地址不能超过150个文字!","2");
    }else if(lhg1==0){
        hint_info("pt_grjsyzdb_lxdz","居住地址不能为空!","2");
    }
});
//身份证地址
$("#pt_grjsyzdb_sfzdz").focus(function(){
    hint_info("pt_grjsyzdb_sfzdz","请输入身份证地址","2");
});
$("#pt_grjsyzdb_sfzdz").blur(function(){
    var a=$("#pt_grjsyzdb_sfzdz").val();
    var a1=a.length;
    if(a1>150){
        hint_info("pt_grjsyzdb_sfzdz","身份证地址超过150个文字!","2");
    }else if(a1==0){
        hint_info("pt_grjsyzdb_sfzdz","身份证地址不能为空!","2");
    }
});
//驾驶员证提交验证
function jsy_tj(){
    //证件号码
    var zjlx=$("#pt_grjsyzdb_zjlx").val();
    if(zjlx=="身份证"){
    	if($("#pt_grjsyzdb_zjhm").val()==""){
            Pop_up_box("证件号码不能为空","2");
            return false;
        }else if(!regIDCard.test($("#pt_grjsyzdb_zjhm").val())){
            Pop_up_box("证件号码格式不正确!","2");
            return false;
        }
    } else{
    	if($("#pt_grjsyzdb_zjhm").val()==""){
            Pop_up_box("证件号码不能为空","2");
            return false;
        }else if(!regGwPassport.test($("#pt_grjsyzdb_zjhm").val())){
            Pop_up_box("证件号码格式不正确!","2");
            return false;
        }
    }
    //驾驶员姓名
    if($("#pt_grjsyzdb_jsyxm").val()==""){
        Pop_up_box("驾驶员姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#pt_grjsyzdb_jsyxm").val())) {
        Pop_up_box("驾驶员姓名格式不正确!","2");
        return false;
    }
    //出生日期
    if($("#pt_grjsyzdb_csrq").val()==""){
        Pop_up_box("出生日期不能为空!","2");
        return false;

    }else if(!regCsrq.test($("#pt_grjsyzdb_csrq").val())) {
        Pop_up_box("出生日期格式不正确!","2");
        return false;
    }
    //手机号码
    if($("#pt_grjsyzdb_sjhm").val()==""){
        Pop_up_box("手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#pt_grjsyzdb_sjhm").val())) {
        Pop_up_box("手机号码格式不正确!","2");
        return false;
    }
    //居住地址
    var v1=$("#pt_grjsyzdb_lxdz").val();
    var lhg1=v1.length;
    if(lhg1>150){
        Pop_up_box("居住地址不能超过150个文字!","2");
        return false
    }else if(lhg1==0){
        Pop_up_box("居住地址不能为空!","2");
        return false
    }
    //身份证地址
    var a=$("#pt_grjsyzdb_sfzdz").val();
    var a1=a.length;
    if(a1>150){
        Pop_up_box("身份证地址超过150个文字!","2");
        return false
    }else if(a1==0){
        Pop_up_box("身份证地址不能为空!","2");
        return false
    }
    if (!$("input[name='cn']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认本平台承诺!", 2);
        return false;
    }
    return true;
}
/**********平台代办----个人车辆运输证************/
//机动车所有人证件号码
$("#pt_gryszdb_zjhm").focus(function(){
    hint_info("pt_gryszdb_zjhm","请输入法人代表证件号码","1");
});
$("#pt_gryszdb_zjhm").blur(function(){
    var zjlx=$("#pt_gryszdb_zjlx").val();
    if(zjlx=="身份证"){
        sfzReg('pt_gryszdb_zjhm','证件号码不能为空','证件号码格式不正确!');
    } else{
        hzReg('pt_gryszdb_zjhm', '证件号码不能为空', '证件号码格式不正确!');
    }
});
//机动车所有人姓名
$("#pt_gryszdb_jsyxm").focus(function(){
    hint_info("pt_gryszdb_jsyxm","请输入驾驶员姓名","2");
});
$("#pt_gryszdb_jsyxm").blur(function(){
    if($("#pt_gryszdb_jsyxm").val()==""){
        hint_info("pt_gryszdb_jsyxm","驾驶员姓名不能为空!","2");
    }else if(!regName_zw.test($("#pt_gryszdb_jsyxm").val())) {
        hint_info("pt_gryszdb_jsyxm","驾驶员姓名格式不正确!","2");
    }
});
//国籍
$("#pt_gryszdb_gj").focus(function(){
    hint_info("pt_gryszdb_gj","请输入国籍","2");
});
$("#pt_gryszdb_gj").blur(function(){
    if($("#pt_gryszdb_gj").val()==""){
        hint_info("pt_gryszdb_gj","国籍不能为空!","2");
    }else if(!regGj.test($("#pt_gryszdb_gj").val())) {
        hint_info("pt_gryszdb_gj","国籍格式不正确!","2");
    }
});
//出生日期
$("#pt_gryszdb_csrq").focus(function(){
    hint_info("pt_gryszdb_csrq","请选择出生日期","2");
});
$("#pt_gryszdb_csrq").blur(function(){
    if($("#pt_gryszdb_csrq").val()==""){
        hint_info("pt_gryszdb_csrq","出生日期不能为空!","2");
    }else if(!regCsrq.test($("#pt_gryszdb_csrq").val())) {
        hint_info("pt_gryszdb_csrq","出生日期格式不正确!","2");
    }
});
//手机号码
$("#pt_gryszdb_sjhm").focus(function(){
    hint_info("pt_gryszdb_sjhm","请输入手机号码","2");
});
$("#pt_gryszdb_sjhm").blur(function(){
    if($("#pt_gryszdb_sjhm").val()==""){
        hint_info("pt_gryszdb_sjhm","手机号码不能为空!","2");
    }else if(!regPhone.test($("#pt_gryszdb_sjhm").val())) {
        hint_info("pt_gryszdb_sjhm","手机号码格式不正确!","2");
    }
});
//联系地址
$("#pt_gryszdb_lxdz").focus(function(){
    hint_info("pt_gryszdb_lxdz","请输入联系地址","2");
});
$("#pt_gryszdb_lxdz").blur(function(){
    var val1=$("#pt_gryszdb_lxdz").val();
    var lgh=val1.length;
    if(lgh>150){
        hint_info("pt_gryszdb_lxdz","联系地址不能超过150个文字","2");
    }else if(lgh==0){
        hint_info("pt_gryszdb_lxdz","联系地址不能为空","2");
    }
});
//个人车辆运输证提交验证
function grclys_tj(){
    //机动车所有人证件号码
    $("#pt_grjsyzdb_zjhm").blur(function(){
        var zjlx=$("#pt_gryszdb_zjlx").val();
        if(zjlx=="身份证"){
        	if($("#pt_gryszdb_zjhm").val()==""){
                Pop_up_box("证件号码不能为空","2");
                return false;
            }else if(!regIDCard.test($("#pt_gryszdb_zjhm").val())){
                Pop_up_box("证件号码格式不正确!","2");
                return false;
            }
        } else{
        	if($("#pt_gryszdb_zjhm").val()==""){
                Pop_up_box("证件号码不能为空","2");
                return false;
            }else if(!regGwPassport.test($("#pt_gryszdb_zjhm").val())){
                Pop_up_box("证件号码格式不正确!","2");
                return false;
            }
        }
    });
    //机动车所有人姓名
    if($("#pt_gryszdb_jsyxm").val()==""){
        Pop_up_box("驾驶员姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#pt_gryszdb_jsyxm").val())) {
        Pop_up_box("驾驶员姓名格式不正确!","2");
        return false;
    }
    //出生日期
    if($("#pt_gryszdb_csrq").val()==""){
        Pop_up_box("出生日期不能为空!","2");
        return false;

    }else if(!regCsrq.test($("#pt_gryszdb_csrq").val())) {
        Pop_up_box("出生日期格式不正确!","2");
        return false;
    }
    //手机号码
    if($("#pt_gryszdb_sjhm").val()==""){
        Pop_up_box("手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#pt_gryszdb_sjhm").val())) {
        Pop_up_box("手机号码格式不正确!","2");
        return false;
    }
    //联系地址pt_gryszdb_sfzdz
    var val1=$("#pt_gryszdb_lxdz").val();
    var lgh=val1.length;
    if(lgh>150){
        Pop_up_box("联系地址不能超过150个文字","2");
        return false;
    }else if(lgh==0){
        Pop_up_box("联系地址不能为空","2");
        return false;
    }
    var val2=$("#pt_gryszdb_sfzdz").val();
    var lgh1=val2.length;
    if(lgh1>150){
        Pop_up_box("身份证地址不能超过150个文字","2");
        return false;
    }else if(lgh1==0){
        Pop_up_box("身份证地址不能为空","2");
        return false;
    }
    if (!$("input[name='cn1']").is(':checked')) {
    	layer.closeAll('loading');
        Pop_up_box("先确认本平台承诺!", 2);
        return false;
    }
    return true;
}
/************企业车辆运输证*************/
//证件号码
$("#pt_qyyszdb_zzjgdmzh").focus(function(){
    hint_info("pt_qyyszdb_zzjgdmzh","请输入证件号码","1");
});
$("#pt_qyyszdb_zzjgdmzh").blur(function(){
        if($("#pt_qyyszdb_zzjgdmzh").val()==""){
            hint_info("pt_qyyszdb_zzjgdmzh","企业营业执照（五证合一）不能为空!","1");
        }else if(!regzzjgdm.test($("#pt_qyyszdb_zzjgdmzh").val())) {
            hint_info("pt_qyyszdb_zzjgdmzh","企业营业执照（五证合一）格式不正确!","1");
        }
});
//企业名称
$("#pt_qyyszdb_qymc").focus(function(){
    hint_info("pt_qyyszdb_qymc","请输入企业名称","2");
});
$("#pt_qyyszdb_qymc").blur(function(){
    if($("#pt_qyyszdb_qymc").val()==""){
        hint_info("pt_qyyszdb_qymc","企业名称不能为空!","2");
    }else if(!regFwjgmc.test($("#pt_qyyszdb_qymc").val())) {
        hint_info("pt_qyyszdb_qymc","企业名称格式不正确!","2");
    }
});
//法人代表姓名
$("#pt_qyyszdb_frxm").focus(function(){
    hint_info("pt_qyyszdb_frxm","请输入法人代表姓名","2");
});
$("#pt_qyyszdb_frxm").blur(function(){
    if($("#pt_qyyszdb_frxm").val()==""){
        hint_info("pt_qyyszdb_frxm","法人代表姓名不能为空!","2");
    }else if(!regName_zw.test($("#pt_qyyszdb_frxm").val())) {
        hint_info("pt_qyyszdb_frxm","法人代表姓名格式不正确!","2");
    }
});
//法人身份证号
$("#pt_qyyszdb_frzjhm").focus(function(){
    hint_info("pt_qyyszdb_frzjhm","请输入法人身份证号","2");
});
$("#pt_qyyszdb_frzjhm").blur(function(){
    if($("#pt_qyyszdb_frzjhm").val()==""){
        hint_info("pt_qyyszdb_frzjhm","法人身份证不能为空!","2");
    }else if(!regIDCard.test($("#pt_qyyszdb_frzjhm").val())) {
        hint_info("pt_qyyszdb_frzjhm","法人身份证格式不正确!","2");
    }
});
//企业联系人
$("#pt_qyyszdb_jbrxm").focus(function(){
    hint_info("pt_qyyszdb_jbrxm","请输入企业联系人姓名","2");
});
$("#pt_qyyszdb_jbrxm").blur(function(){
    if($("#pt_qyyszdb_jbrxm").val()==""){
        hint_info("pt_qyyszdb_jbrxm","企业联系人姓名不能为空!","2");
    }else if(!regName_zw.test($("#pt_qyyszdb_jbrxm").val())) {
        hint_info("pt_qyyszdb_jbrxm","企业联系人姓名格式不正确!","2");
    }
});
//企业联系人手机号码
$("#pt_qyyszdb_jbrsjhm").focus(function(){
    hint_info("pt_qyyszdb_jbrsjhm","请输入企业联系人手机号码","2");
});
$("#pt_qyyszdb_jbrsjhm").blur(function(){
    if($("#pt_qyyszdb_jbrsjhm").val()==""){
        hint_info("pt_qyyszdb_jbrsjhm","企业联系人手机号码不能为空!","2");
    }else if(!regPhone.test($("#pt_qyyszdb_jbrsjhm").val())) {
        hint_info("pt_qyyszdb_jbrsjhm","企业联系人手机号码格式不正确!","2");
    }
});
//居住地址
$("#pt_qyyszdb_lxdz").focus(function(){
    hint_info("pt_qyyszdb_lxdz","请输入联系地址","2");
});
$("#pt_qyyszdb_lxdz").blur(function(){
    var val1=$("#pt_qyyszdb_lxdz").val();
    var lgh=val1.length;
    if(lgh>150){
        hint_info("pt_qyyszdb_lxdz","联系地址不能超过150个文字","2");
    }else if(lgh==0){
        hint_info("pt_qyyszdb_lxdz","联系地址不能为空","2");
    }
});
//企业车辆运输证提交
function qycl_tj(){
    //证件号码
        if($("#pt_qyyszdb_zzjgdmzh").val()==""){
            Pop_up_box("企业营业执照（五证合一）不能为空!","2");
            return false;
        }else if(!regzzjgdm.test($("#pt_qyyszdb_zzjgdmzh").val())) {
            Pop_up_box("企业营业执照（五证合一）格式不正确!","2");
            return false;
        }
    //企业名称
    if($("#pt_qyyszdb_qymc").val()==""){
        Pop_up_box("企业名称不能为空!","2");
        return false;
    }else if(!regFwjgmc.test($("#pt_qyyszdb_qymc").val())) {
        Pop_up_box("企业名称格式不正确!","2");
        return false;
    }
    //法人代表姓名
    if($("#pt_qyyszdb_frxm").val()==""){
        Pop_up_box("法人代表姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#pt_qyyszdb_frxm").val())) {
        Pop_up_box("法人代表姓名格式不正确!","2");
        return false;
    }
    //法人身份证号
    if($("#pt_qyyszdb_frzjhm").val()==""){
        Pop_up_box("法人身份证不能为空!","2");
        return false;
    }else if(!regIDCard.test($("#pt_qyyszdb_frzjhm").val())) {
        Pop_up_box("法人身份证格式不正确!","2");
        return false;
    }
    //企业联系人
    if($("#pt_qyyszdb_jbrxm").val()==""){
        Pop_up_box("企业联系人姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#pt_qyyszdb_jbrxm").val())) {
        Pop_up_box("企业联系人姓名格式不正确!","2");
        return false;
    }
    //企业联系人手机号码
    if($("#pt_qyyszdb_jbrsjhm").val()==""){
        Pop_up_box("企业联系人手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#pt_qyyszdb_jbrsjhm").val())) {
        Pop_up_box("企业联系人手机号码格式不正确!","2");
        return false;
    }
    //居住地址
    var val1=$("#pt_qyyszdb_lxdz").val();
    var lgh=val1.length;
    if(lgh>150){
        Pop_up_box("联系地址不能超过150个文字","2");
        return false;
    }else if(lgh==0){
        Pop_up_box("联系地址不能为空","2");
        return false;
    }
    if(qyclyszdb=='0'){
    	//组织机构代码证或企业营业执照（五证合一）文件上传
    	if($('#fileupload_zzjgdmzzp').val()==''){
    		Pop_up_box("组织机构代码证或企业营业执照（五证合一）图片必须提交！","2");
    		return false;
    	}else{
    		var zzjgdmzzp=$('#fileupload_zzjgdmzzp').val();
    		var a = zzjgdmzzp.substr(zzjgdmzzp.indexOf('.')+1);
    		if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='PNG'&&a!='png'){
    			Pop_up_box("组织机构代码证或企业营业执照（五证合一）图片只能上传.jpg或者.JPEG、png格式的图片！" +
    					"","2");
    			return false;
    		}
    	}
    }
    if (!$(".pt_qyyszdb_gx")[0].checked) {
    	Pop_up_box("请确认本平台承诺内容！","2");
        return false
    }
    return true;
}
/*****************驾驶员证状态查询********************/
//驾驶员姓名
$("#pt_jsyblz_jsyxm").focus(function(){
    hint_info("pt_jsyblz_jsyxm","请输入驾驶员姓名","2");
});
$("#pt_jsyblz_jsyxm").blur(function(){
    if($("#pt_jsyblz_jsyxm").val()==""){
        hint_info("pt_jsyblz_jsyxm","驾驶员姓名不能为空!","2");
    }else if(!regName_zw.test($("#pt_jsyblz_jsyxm").val())) {
        hint_info("pt_jsyblz_jsyxm","驾驶员姓名格式不正确!","2");
    }
});
//证件号码
$("#pt_jsyblz_zjhm").focus(function(){
    hint_info("pt_jsyblz_zjhm","请输入证件号码","2");
});
$("#pt_jsyblz_zjhm").blur(function(){
    if($("#pt_jsyblz_zjhm").val()==""){
        hint_info("pt_jsyblz_zjhm","证件号码不能为空!","2");
    }else if(!regIDCard.test($("#pt_jsyblz_zjhm").val())) {
        hint_info("pt_jsyblz_zjhm","证件号码格式不正确!","2");
    }
});
//代办人
$("#pt_qjsyblz_dbr").focus(function(){
    hint_info("pt_qjsyblz_dbr","请输入代办人","2");
});
$("#pt_qjsyblz_dbr").blur(function(){
    if($("#pt_qjsyblz_dbr").val()==""){
        hint_info("pt_qjsyblz_dbr","代办人不能为空!","2");
    }else if(!regName_zw.test($("#pt_qjsyblz_dbr").val())) {
        hint_info("pt_qjsyblz_dbr","代办人格式不正确!","2");
    }
});
/*******运输证状态查询*******/
//车牌号码
//$("#pt_clblcx_cphm").focus(function(){
//    hint_info("pt_clblcx_cphm","请输入车牌号码","2");
//});
//$("#pt_clblcx_cphm").blur(function(){
//    if($("#pt_clblcx_cphm").val()==""){
//        hint_info("pt_clblcx_cphm","车牌号码不能为空!","2");
//    }else if(!regLicenseplate1.test($("#pt_clblcx_cphm").val())) {
//        hint_info("pt_clblcx_cphm","车牌号码格式不正确!","2");
//    }
//});
//车辆所有人
$("#pt_clblcx_clsyr").focus(function(){
    hint_info("pt_clblcx_clsyr","请输入车辆所有人","2");
});
$("#pt_clblcx_clsyr").blur(function(){
    if($("#pt_clblcx_clsyr").val()==""){
        hint_info("pt_clblcx_clsyr","车辆所有人不能为空!","2");
    }else if(!regName_zw.test($("#pt_clblcx_clsyr").val())) {
        hint_info("pt_clblcx_clsyr","车辆所有人格式不正确!","2");
    }
});
//代办人
$("#pt_qyyszdb_dbr").focus(function(){
    hint_info("pt_qyyszdb_dbr","请输入代办人","2");
});
$("#pt_qyyszdb_dbr").blur(function(){
    if($("#pt_qyyszdb_dbr").val()==""){
        hint_info("pt_qyyszdb_dbr","代办人不能为空!","2");
    }else if(!regName_zw.test($("#pt_qyyszdb_dbr").val())) {
        hint_info("pt_qyyszdb_dbr","代办人格式不正确!","2");
    }
});
//组织机构代码证号
$("#pt_clblcx_zzjgdmzh").focus(function(){
    hint_info("pt_clblcx_zzjgdmzh","请输入组织机构代码","2");
});
$("#pt_clblcx_zzjgdmzh").blur(function(){
    if($("#pt_clblcx_zzjgdmzh").val()==""){
        hint_info("pt_clblcx_zzjgdmzh","组织机构代码不能为空!","2");
    }else if(!regName_zw.test($("#pt_clblcx_zzjgdmzh").val())) {
        hint_info("pt_clblcx_zzjgdmzh","组织机构代码格式不正确!","2");
    }
});
//证件号码
$("#pt_clblcx_zjhm").focus(function(){
    hint_info("pt_clblcx_zjhm","请输入证件号码","2");
});
$("#pt_clblcx_zjhm").blur(function(){
    if($("#pt_clblcx_zjhm").val()==""){
        hint_info("pt_clblcx_zjhm","证件号码不能为空!","2");
    }else if(!regIDCard.test($("#pt_jsyblz_zjhm").val())) {
        hint_info("pt_clblcx_zjhm","证件号码格式不正确!","2");
    }
});
/************平台代办----修改页面*************/
function ptyz(){
    //旧手机验证码
    var jyzyzm = $('#jyzyzm');
    jyzyzm.focus(function () {
        hint_info('jyzyzm','请输入验证码','2');
    }).blur(function () {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if ($(this).val() == "") {
            hint_info('jyzyzm', '验证码不能为空!', '2');
            div.addClass('has-error');
        } else if (!regyzm.test($(this).val())) {
            hint_info('jyzyzm', '验证码格式不正确!', '2');
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //手机号码
    var jbrlxfs = $('#jbrlxfs');
    if (jbrlxfs.get(0) && !isReadOnly(jbrlxfs)) {
        jbrlxfs.focus(function() {
            hint_info('jbrlxfs','请输入手机号码','2');
        }).blur(function () {
            removeInputBorderStyle($(this));
            var div = $(this).parent();
            if(jbrlxfs.val()==""){
                hint_info("jbrlxfs","手机号码不能为空!","2");
                div.addClass('has-error');
            }else if(!regPhone.test(jbrlxfs.val())) {
                hint_info("jbrlxfs","手机号码格式不正确!","2");
                div.addClass('has-error');
            }else {
                div.addClass('has-success');
            }
        });
    }
    //新手机号码
    var oldjbrlxfs = $("#old_jbrlxfs");
    if (oldjbrlxfs.get(0) && !isReadOnly(oldjbrlxfs)) {
        oldjbrlxfs.focus(function() {
            hint_info('oldjbrlxfs','请输入新手机号码','2');
        }).blur(function () {
            removeInputBorderStyle($(this));
            var div = $(this).parent();
            if(oldjbrlxfs.val()==""){
                hint_info('old_jbrlxfs','新手机号码不能为空!','2');
                div.addClass('has-error');
            }else if(!regPhone.test(oldjbrlxfs.val())) {
                hint_info('old_jbrlxfs','新手机号码格式不正确!','2');
                div.addClass('has-error');
            }else {
                div.addClass('has-success');
            }
        });
    }
    //新手机验证码
    var jyzyzm2 = $('#jyzyzm2');
    jyzyzm2.focus(function(){
        hint_info('jyzyzm2','请输入验证码!','2');
    }).blur(function () {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if ('' === $("#jyzyzm2").val()) {
            hint_info('jyzyzm2', '验证码不能为空!', '2');
            div.addClass('has-error');
        } else if (!regyzm.test($("#jyzyzm2").val())) {
            hint_info('jyzyzm2', '验证码格式不正确!', '2');
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //旧密码
    var oldjyzpwd = $('#old_jyzpwd');
    oldjyzpwd.focus(function () {
        hint_info('old_jyzpwd','请输入密码，两次密码必须相同 ','2');
    }).blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if ('' === $(this).val()) {
            hint_info('old_jyzpwd', '密码不能为空', '2');
            div.addClass('has-error');
        } else if (!regPassword.test($(this).val())) {
            hint_info('old_jyzpwd', '密码格式不正确', '2');
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //密码
    function pwdReg() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var pwd = $('#jyzpwd').val();
        if ('' === pwd) {
            hintInfo('jyzpwd', '请输入确认密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：a11111');
            div.addClass('has-error');
            return false;
        } else if(!regPassword.test(pwd)) {
            hintInfo('jyzpwd', '密码格式不正确');
            div.addClass('has-error');
            return false;
        }else {
            div.addClass('has-success');
        }
        return true;
    }
    //确认密码
    function repwdReg() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var pwd = $('#jyzpwd').val();
        var repwd = $('#jyzrepwd').val();
        if ('' === repwd){
            hintInfo('jyzrepwd', '请输入确认密码');
            div.addClass('has-error');
        } else if (repwd !== pwd) {
            hintInfo('jyzrepwd', '两次密码输入的不一致');
            div.addClass('has-error');
            return false;
        }else {
            div.addClass('has-success');
        }
        return true;
    }
    $('#jyzpwd').on('focus', function () {
        hintInfo('jyzpwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：a11111');
    }).on('blur', pwdReg);
    $('#jyzrepwd').on('focus', function () {
        hintInfo('jyzrepwd', '请输入确认密码');
    }).on('blur', repwdReg);
    //身份证号码
    $('#zzjgdmz').focus(function () {
        hintInfo('zzjgdmz', '请输入证件号码');
    }).blur(function() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if('' === $(this).val()){
            hintInfo('zzjgdmz', '证件号码不能为空！');
            div.addClass('has-error');
        }else if(!regIDCard.test($(this).val())) {
            hintInfo('zzjgdmz', '证件号码格式不正确！');
            div.addClass('has-error');
        }else {
            div.addClass('has-success');
        }
    });
    //姓名
    $('#jbrName').focus(function () {
        hintInfo('jbrName', '请输入姓名');
    }).blur(function () {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if ('' === $(this).val()) {
            hintInfo('jbrName', '姓名不能为空！');
            div.addClass('has-error');
        } else if (!regName_zw.test($(this).val())) {
            hintInfo('jbrName', '姓名格式不正确！');
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
}
function infopt_xgtjInputBoxReg() {
    var zzjgdmz = $('#zzjgdmz'),
        jbrName = $('#jbrName'),
        jbrlxfs = $('#jbrlxfs'),
        jyzyzm = $('#jyzyzm');
    //身份证号码
    if ('' === zzjgdmz.val() || !regIDCard.test(zzjgdmz.val())) {
        submitRegErrorInputBorderStyle(zzjgdmz);
    } else {
        successInputBorderStyle(zzjgdmz);
    }
    //姓名
    if ('' === jbrName.val() || !regName_zw.test(jbrName.val())) {
        submitRegErrorInputBorderStyle(jbrName);
    } else {
        successInputBorderStyle(jbrName);
    }
    //手机号码
    if ('' === jbrlxfs.val() || !regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
    //新手机验证码
    if ('' === jyzyzm.val() || !regyzm.test(jyzyzm.val())) {
        submitRegErrorInputBorderStyle(jyzyzm);
    } else {
        successInputBorderStyle(jyzyzm);
    }
}
//修改经办人
function xgtj(){
    infopt_xgtjInputBoxReg();
    //身份证号码
    if($("#zzjgdmz").val()==""){
        Pop_up_box("证件号码不能为空!","2");
        return false;
    }else if(!regIDCard.test($("#zzjgdmz").val())) {
        Pop_up_box("证件号码格式不正确!","2");
        return false;
    }
    //姓名
    if($("#jbrName").val()==""){
        Pop_up_box("姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#jbrName").val())) {
        Pop_up_box("姓名格式不正确!","2");
        return false;
    }
    //手机号码
        if($("#jbrlxfs").val()==""){
            Pop_up_box("手机号码不能为空!","2");
            return false;
        }else if(!regPhone.test($("#jbrlxfs").val())) {
            Pop_up_box("手机号码格式不正确!","2");
            return false;
        }
    //新手机验证码
        if($("#jyzyzm").val()==""){
            Pop_up_box("验证码不能为空!","2");
            return false;
        }else if(!regyzm.test($("#jyzyzm").val())) {
            Pop_up_box("验证码格式不正确!","2");
            return false;
        }
        return true;
}
function infopt_sjhmInputBoxReg() {
    var jbrlxfs = $('#jbrlxfs'),
        jyzyzm = $('#jyzyzm'),
        oldjbrlxfs = $('#old_jbrlxfs');
    //旧手机号码
    if ('' === jbrlxfs.val() || !regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
    //旧手机验证码
    if ('' === jyzyzm.val() || !regyzm.test(jyzyzm.val())) {
        submitRegErrorInputBorderStyle(jyzyzm);
    } else {
        successInputBorderStyle(jyzyzm);
    }
    //新手机号码
    if ('' === oldjbrlxfs.val() || !regPhone.test(oldjbrlxfs.val())) {
        submitRegErrorInputBorderStyle(oldjbrlxfs);
    } else {
        successInputBorderStyle(oldjbrlxfs);
    }
}
//修改手机号码
function pt_sjhm(){
    infopt_sjhmInputBoxReg();
    //旧手机验证码
    if($("#jyzyzm").val()==""){
        Pop_up_box("验证码不能为空!","2");
        return false;
    }else if(!regyzm.test($("#jyzyzm").val())) {
        Pop_up_box("验证码格式不正确!","2");
        return false;
    }
    //旧手机验证码
    if($("#jyzyzm").val()==""){
        Pop_up_box("验证码不能为空!","2");
        return false;
    }else if(!regyzm.test($("#jyzyzm").val())) {
        Pop_up_box("验证码格式不正确!","2");
        return false;
    }
    //手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("手机号码格式不正确!","2");
        return false;
    }
    return true;
}
function infopt_xgmmInputBoxReg() {
    var oldjyzpwd = $('#old_jyzpwd'),
        jyzpwd = $('#jyzpwd'),
        jyzrepwd = $('#jyzrepwd');
    //旧密码
    if ('' === oldjyzpwd.val() || !regPassword.test(oldjyzpwd.val())) {
        submitRegErrorInputBorderStyle(oldjyzpwd);
    } else {
        successInputBorderStyle(oldjyzpwd);
    }
    //旧手机验证码
    if ('' === jyzpwd.val() || !regPassword.test(jyzpwd.val())) {
        submitRegErrorInputBorderStyle(jyzpwd);
    } else {
        successInputBorderStyle(jyzpwd);
    }
    //新手机号码
    if ('' === jyzrepwd.val() || !regPassword.test(jyzrepwd.val())) {
        submitRegErrorInputBorderStyle(jyzrepwd);
    } else {
        successInputBorderStyle(jyzrepwd);
    }
}
//修改密码
function pt_mm(){
    infopt_xgmmInputBoxReg();
    //旧密码
    if($("#old_jyzpwd").val()==""){
        Pop_up_box("密码不能为空!","2");
        return false;
    }else if(!regPassword.test($("#old_jyzpwd").val())) {
        Pop_up_box("密码格式不正确!","2");
        return false;
    }
    //密码
    var pwd = $('#jyzpwd').val();
    if ('' === pwd) {
        Pop_up_box( '请输入密码');
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box( '密码格式不正确');
        return false;
    }
    //确认密码
    var repwd = $('#jyzrepwd').val();
    if (repwd !== pwd) {
        Pop_up_box( '两次密码输入的不一致');
        return false;
    }
    return true;
}


/**********个人修改页面*************/
//个人车辆申请修改信息验证
function grInfo_yz(){
    //姓名
    $("#jdcName").focus(function(){
        hint_info("jdcName","请输入姓名","2");
    });
    $("#jdcName").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jdcName").val()==""){
            hint_info("jdcName","姓名不能为空!","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#jdcName").val())) {
            hint_info("jdcName","姓名格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //国籍
    $("#gj").focus(function(){
        hint_info("gj","请输入国籍","2");
    });
    $("#gj").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#gj").val()==""){
            hint_info("gj","国籍不能为空!","2");
            div.addClass('has-error');
        }else if(!regGj.test($("#gj").val())) {
            hint_info("gj","国籍格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //证件号码
    $("#zjhm").focus(function(){
        hint_info("zjhm","请输入证件号码","2");
    });
    $("#zjhm").blur(function(){
        documentType($('#zjlx_select'), $(this));
    });
    //出生日期
    $("#csrq").focus(function(){
        hint_info("csrq","请选择出生日期","2");
    });
    $("#csrq").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#csrq").val()==""){
            hint_info("csrq","出生日期不能为空!","2");
            div.addClass('has-error');
        }else if(!regCsrq.test($("#csrq").val())) {
            hint_info("csrq","出生日期格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //新手机号
    $("#sjhm").focus(function(){
        hint_info("sjhm","请输入手机号码","2");
    });
    $("#sjhm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#sjhm").val()==""){
            hint_info("sjhm","手机号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regPhone.test($("#sjhm").val())) {
            hint_info("sjhm","手机号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //旧手机验证码
    $("#yzm").focus(function(){
        hint_info("yzm","请输入验证码","2");
    });
    $("#yzm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#yzm").val()==""){
            hint_info("yzm","验证码不能为空!","2");
            div.addClass('has-error');
        }else if(!regyzm.test($("#yzm").val())) {
            hint_info("yzm","验证码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //新手机验证码
    $("#yzm2").focus(function(){
        hint_info("yzm2","请输入验证码","2");
    });
    $("#yzm2").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#yzm2").val()==""){
            hint_info("yzm2","验证码不能为空!","2");
            div.addClass('has-error');
        }else if(!regyzm.test($("#yzm2").val())) {
            hint_info("yzm2","验证码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //密码
    function pwdReg() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var pwd = $('#pwd').val();
        if ('' === pwd) {
            hintInfo('pwd', '请输入密码');
            div.addClass('has-error');
            return false;
        } else if(!regPassword.test(pwd)) {
            hintInfo('pwd', '密码格式不正确');
            div.addClass('has-error');
            return false;
        } else {
            div.addClass('has-success');
        }
        return true;
    }
    //确认密码
    function repwdReg() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var pwd = $('#pwd').val();
        var repwd = $('#repwd').val();
        if ('' === repwd) {
            hintInfo('repwd', '请如入确认密码');
            div.addClass('has-error');
            return false;
        } else if (repwd !== pwd) {
            hintInfo('repwd', '两次密码输入的不一致');
            div.addClass('has-error');
            return false;
        } else {
            div.addClass('has-success');
        }
        return true;
    }
    $('#pwd').on('focus', function () {
        hintInfo('pwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：a11111');
    }).on('blur', pwdReg);
    $('#repwd').on('focus', function () {
        hintInfo('repwd', '请输入确认密码');
    }).on('blur', repwdReg);
    //旧密码
    $("#old_pwd").focus(function(){
        hint_info("old_pwd","请输入密码","2");
    });
    $("#old_pwd").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#old_pwd").val()==""){
            hint_info("old_pwd","密码不能为空!","2");
            div.addClass('has-error');
        }else if(!regPassword.test($("#old_pwd").val())) {
            hint_info("old_pwd","密码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //居住地址
    $("#lxdz").focus(function(){
        hint_info("lxdz","请输入联系地址","2");
    });
    $("#lxdz").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var val1=$("#lxdz").val();
        var lgh=val1.length;
        if(lgh>150){
            hint_info("lxdz","联系地址不能超过150个文字","2");
            div.addClass('has-error');
        }else if(lgh==0){
            hint_info("lxdz","联系地址不能为空","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //身份证地址
    $("#sfzdz").focus(function(){
        hint_info("sfzdz","请输入联系地址","2");
    });
    $("#sfzdz").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var val2=$("#sfzdz").val();
        var lgh1=val2.length;
        if(lgh1>150){
            hint_info("sfzdz","联系地址不能超过150个文字","2");
            div.addClass('has-error');
        }else if(lgh1==0){
            hint_info("sfzdz","联系地址不能为空","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
}
//个人车辆申请提交
function infogr_xggrxxInputBoxReg() {
    var jdcName = $('#jdcName'),
        gj = $('#gj'),
        zjlx_select = $('#zjlx_select'),
        zjhm = $('#zjhm'),
        pwd = $('#pwd'),
        lxdz = $('#lxdz'),
        sfzdz = $('#sfzdz');

    //姓名
    if(''===jdcName.val()||!regName_zw.test(jdcName.val())) {
        submitRegErrorInputBorderStyle(jdcName);
    } else {
        successInputBorderStyle(jdcName);
    }
    //国籍
    if(''===gj.val()||!regGj.test(gj.val())) {
        submitRegErrorInputBorderStyle(gj);
    } else {
        successInputBorderStyle(gj);
    }
    //证件号码
    documentType(zjlx_select, zjhm);

    /*//出生日期
    if($("#csrq").val()==""){
        Pop_up_box("出生日期不能为空!","2");
        return false;
    }else if(!regCsrq.test($("#csrq").val())) {
        Pop_up_box("出生日期格式不正确!","2");
        return false;
    }*/
    //密码
    if ('' === pwd||!regPassword.test(pwd)) {
        submitRegErrorInputBorderStyle(pwd);
    } else {
        successInputBorderStyle(pwd);
    }
    //居住地址
    if (lxdz.val().length == 0) {
        Pop_up_box("居住地址不能为空", "2");
        return false;
    } else if (lxdz.val().length < 3 && lxdz.val().length > 0) {
        Pop_up_box("居住地址格式不对", "2");
        return false;
    } else if (lxdz.val().length > 150) {
        Pop_up_box("居住地址不能超过150个文字", "2");
        return false;
    }
    //身份证地址
    if (sfzdz.val().length == 0) {
        Pop_up_box("身份证地址不能为空", "2");
        return false;
    } else if (sfzdz.val().length < 3 && sfzdz.val().length > 0) {
        Pop_up_box("身份证地址格式不对", "2");
        return false;
    } else if (sfzdz.val().length > 150) {
        Pop_up_box("身份证地址不能超过150个文字", "2");
        return false;
    }
}
function gr_tj(){
    infogr_xggrxxInputBoxReg();
    //姓名
    if($("#jdcName").val()==""){
        Pop_up_box("姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#jdcName").val())) {
        Pop_up_box("姓名格式不正确!","2");
        return false;
    }
    //国籍
    if($("#gj").val()==""){
        Pop_up_box("国籍不能为空!","2");
        return false;
    }else if(!regGj.test($("#gj").val())) {
        Pop_up_box("国籍格式不正确!","2");
        return false;
    }
    //证件号码
    var zjlx=$("#zjlx_select").val();
    if(zjlx=='身份证'){
        if($("#zjhm").val()==""){
            Pop_up_box("证件号码不能为空","2");
            return false;
        }else if(!regIDCard.test($("#zjhm").val())){
            Pop_up_box("证件号码格式不正确","2");
            return false;
        }
    }else if(zjlx=='护照'){
        if($("#zjhm").val()==''){
            Pop_up_box("证件号码不能为空","2");
            return false;
        }else if(!regGwPassport.test($("#zjhm").val())){
            Pop_up_box("证件号码格式不正确",'2');
            return false;
        }

    }else if(zjlx=='军官证'){
        Pop_up_box('暂不支持');
        return false;
    }else if(zjlx=='士兵证'){
        Pop_up_box('暂不支持');
        return false;
    }
    /*//出生日期
    if($("#csrq").val()==""){
        Pop_up_box("出生日期不能为空!","2");
        return false;
    }else if(!regCsrq.test($("#csrq").val())) {
        Pop_up_box("出生日期格式不正确!","2");
        return false;
    }*/
    //密码
    var pwd = $('#pwd').val();
    if ('' === pwd) {
        Pop_up_box( '请输入密码');
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box( '密码格式不正确');
        return false;
    }
    //居住地址
    var val1=$("#lxdz").val();
    var lgh=val1.length;
    if(lgh>150){
        Pop_up_box("居住地址不能超过150个文字","2");
        return false;
    }else if(lgh<3&&lgh>0){
        Pop_up_box("居住地址格式不对","2");
        return false;
    }else if(lgh==0){
        Pop_up_box("居住地址不能为空","2");
        return false;
    }
    //身份证地址
    var val2=$("#sfzdz").val();
    var lgh1=val2.length;
    if(lgh1>150){
        Pop_up_box("身份证地址不能超过150个文字","2");
        return false;
    }else if(lgh1<3&&lgh>0){
        Pop_up_box("身份证地址格式不对","2");
        return false;
    }else if(lgh1==0){
        Pop_up_box("身份证地址不能为空","2");
        return false;
    }
    return true;
}
//修改手机信息
function infogr_sjxgInputBoxReg() {
    var oldsjhm = $('#old_sjhm'),
        yzm = $('#yzm'),
        sjhm = $('#sjhm');

    //旧手机号码
    if ('' === oldsjhm.val() || !regPhone.test(oldsjhm.val())) {
        submitRegErrorInputBorderStyle(oldsjhm);
    } else {
        successInputBorderStyle(oldsjhm);
    }
    if ('' === yzm.val() || !regyzm.test(yzm.val())) {
        submitRegErrorInputBorderStyle(yzm);
    } else {
        successInputBorderStyle(yzm);
    }
    //手机号码
    if ('' === sjhm.val() || !regPhone.test(sjhm.val())) {
        submitRegErrorInputBorderStyle(sjhm);
    } else {
        successInputBorderStyle(sjhm);
    }
}
function sjxg() {
    infogr_sjxgInputBoxReg();
    //验证码
    if ($("#yzm").val() == "") {
        hint_info("yzm", "验证码不能为空!", "2");
        Pop_up_box('验证码不能为空', '2');
        return false;
    } else if (!regyzm.test($("#yzm").val())) {
        hint_info("yzm", "验证码格式不正确!", "2");
        Pop_up_box('验证码格式不正确', '2');
        return false;
    }
    //手机号码
    if ($("#sjhm").val() == "") {
        hint_info("sjhm", "手机号码不能为空!", "2");
        Pop_up_box("手机号码不能为空", "2");
        return false;
    } else if (!regPhone.test($("#sjhm").val())) {
        hint_info("sjhm", "手机号码格式不正确!", "2");
        Pop_up_box("手机号码格式不正确", "2");
        return false;
    }
    return true;
}
//修改密码
function infogr_mmxgInputBoxReg() {
    var old_pwd = $('#old_pwd'),
        pwd = $('#pwd'),
        repwd = $('#repwd');

    //旧密码
    if(''===old_pwd.val()||!regPassword.test(old_pwd.val())) {
        submitRegErrorInputBorderStyle(old_pwd);
    } else {
        successInputBorderStyle(old_pwd);
    }
    //密码
    if ('' === pwd||!regPassword.test(pwd)) {
        submitRegErrorInputBorderStyle(pwd);
    } else {
        successInputBorderStyle(pwd);
    }
    //确认密码
    if (''===repwd||repwd !== pwd) {
        submitRegErrorInputBorderStyle(repwd);
    } else {
        successInputBorderStyle(repwd);
    }
}
function mmxg(){
    infogr_mmxgInputBoxReg();
    //旧密码
    if($("#old_pwd").val()==""){
        Pop_up_box("密码不能为空!","2");
        return false;
    }else if(!regPassword.test($("#old_pwd").val())) {
        Pop_up_box("密码格式不正确!","2");
        return false;
    }
    //密码
    var pwd = $('#pwd').val();
    if ('' === pwd) {
        Pop_up_box( '请输入密码');
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box( '密码格式不正确');
        return false;
    }
    //确认密码
    function repwdReg() {
        var pwd = $('#pwd').val();
        var repwd = $('#repwd').val();
        if (repwd !== pwd) {
            Pop_up_box( '两次密码输入的不一致');console.info('123')
            return false;
        }
        return true;
    }
    return true;
}
/****企业修改页面****/
//企业车辆申请修改验证
function qyInfo_yz(){
    //身份证号码
    $("#zzjgdmz").focus(function(){
        hint_info("zzjgdmz","请输入身份证号码","2");
    });
    $("#zzjgdmz").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($(this).val()==""){
            hint_info("zzjgdmz","身份证号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regIDCard.test($(this).val())) {
            hint_info("zzjgdmz","身份证号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //姓名
    $("#qy_jbrName").focus(function(){
        hint_info("qy_jbrName","请输入姓名","2");
    });
    $("#qy_jbrName").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#qy_jbrName").val()==""){
            hint_info("qy_jbrName","姓名不能为空!","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#qy_jbrName").val())) {
            hint_info("qy_jbrName","姓名格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //手机号码
    $("#jbrlxfs").focus(function(){
        hint_info("jbrlxfs","请输入手机号码","2");
    });
    $("#jbrlxfs").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jbrlxfs").val()==""){
            hint_info("jbrlxfs","手机号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regPhone.test($("#jbrlxfs").val())) {
            hint_info("jbrlxfs","手机号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //旧手机号码
    $("#old_jbrlxfs").focus(function(){
        hint_info("old_jbrlxfs","请输入手机号码","2");
    });
    $("#old_jbrlxfs").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#old_jbrlxfs").val()==""){
            hint_info("old_jbrlxfs","手机号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regPhone.test($("#old_jbrlxfs").val())) {
            hint_info("old_jbrlxfs","手机号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //旧验证码
    $("#jyzyzm").focus(function(){
        hint_info("jyzyzm","请输入验证码","2");
    });
    $("#jyzyzm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jyzyzm").val()==""){
            hint_info("jyzyzm","验证码不能为空!","2");
            div.addClass('has-error');
        }else if(!regyzm.test($("#jyzyzm").val())) {
            hint_info("jyzyzm","验证码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //验证码
    $("#jyzyzm2").focus(function(){
        hint_info("jyzyzm2","请输入验证码","2");
    });
    $("#jyzyzm2").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jyzyzm2").val()==""){
            hint_info("jyzyzm2","验证码不能为空!","2");
            div.addClass('has-error');
        }else if(!regyzm.test($("#jyzyzm2").val())) {
            hint_info("jyzyzm2","验证码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //密码
    function pwdReg() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var pwd = $('#jyzpwd').val();
        if ('' === pwd) {
            hintInfo('jyzpwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：a11111','2');
            div.addClass('has-error');
            return false;
        } else if(!regPassword.test(pwd)) {
            hintInfo('jyzpwd', '密码格式不正确','2');
            div.addClass('has-error');
            return false;
        } else {
            div.addClass('has-success');
        }
        return true;
    }
    //确认密码
    function repwdReg() {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var pwd = $('#jyzpwd').val();
        var repwd = $('#jyzrepwd').val();
        if ('' === repwd) {
            hintInfo('jyzrepwd', '请输入确认密码','2');
            div.addClass('has-error');
            return false;
        }
        if (repwd !== pwd) {
            hintInfo('jyzrepwd', '两次密码输入的不一致','2');
            div.addClass('has-error');
            return false;
        } else {
            div.addClass('has-success');
        }
        return true;
    }
    $('#jyzpwd').on('focus', function () {
        hintInfo('jyzpwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：a11111');
    }).on('blur', pwdReg);
    $('#jyzrepwd').on('focus', function () {
        hintInfo('jyzrepwd', '请输入确认密码');
    }).on('blur', repwdReg);
    //企业名称
    $("#wycjyzxm").focus(function(){
        hint_info("wycjyzxm","请输入企业名称","2");
    });
    $("#wycjyzxm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#wycjyzxm").val()==""){
            hint_info("wycjyzxm","企业名称不能为空!","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#wycjyzxm").val())) {
            hint_info("wycjyzxm","企业名称格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //证件号码
    $('#zjhm').focus(function(){
        hintInfo('zjhm', '请输入证件号码');
    }).blur(function(){
        documentType($('#zjlx_select'), $(this));
    });
    //法定代表人姓名
    $("#frdbxm").focus(function(){
        hint_info("frdbxm","请输入姓名","2");
    });
    $("#frdbxm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#frdbxm").val()==""){
            hint_info("frdbxm","姓名不能为空!","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#frdbxm").val())) {
            hint_info("frdbxm","姓名格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });

    //法定代表人证件号码
    $('#frsfzh').focus(function(){
        hintInfo('frsfzh', '请输入证件号码')
    }).blur(function(){
        documentType($('#zjlx_select'), $(this));
    });
    //企业联系地址
    $("#qylxdz").focus(function(){
        hint_info("qylxdz","请输入联系地址","2");
    });
    $("#qylxdz").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var val2=$("#qylxdz").val();
        var lgh1=val2.length;
        if(lgh1>150){
            hint_info("qylxdz","联系地址不能超过150个文字","2");
            div.addClass('has-error');
        }else if(lgh1==0){
            hint_info("qylxdz","联系地址不能为空","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
}
//企业车辆申请提交
function zctx_qy_tjInputBoxReg() {
    var jbrlxfs = $('#jbrlxfs'),
        jyzyzm = $('#jyzyzm'),
        wycjyzxm = $('#wycjyzxm'),
        qy_zjhm = $('#qy_zjhm'),
        zzjgdmz = $('#zzjgdmz'),
        frdbxm = $('#frdbxm'),
        zjlx_select = $('#zjlx_select'),
        frsfzh = $('#frsfzh'),
        qylxdz = $('#qylxdz');
    //手机号码
    if ('' === jbrlxfs.val() || !regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
    //验证码
    if ('' === jyzyzm.val() || !regyzm.test(jyzyzm.val())) {
        submitRegErrorInputBorderStyle(jyzyzm);
    } else {
        successInputBorderStyle(jyzyzm);
    }
    //企业名称
    if ('' === wycjyzxm.val() || !regFwjgmc.test(wycjyzxm.val())) {
        submitRegErrorInputBorderStyle(wycjyzxm);
    } else {
        successInputBorderStyle(wycjyzxm);
    }
    //证件类型
    documentType(qy_zjhm, zzjgdmz);
    //法定代表人姓名
    if ('' === frdbxm.val() || !regName_zw.test(frdbxm.val())) {
        submitRegErrorInputBorderStyle(frdbxm);
    } else {
        successInputBorderStyle(frdbxm);
    }
    //法定代表人证件号码
    documentType(zjlx_select, frsfzh);
    //企业联系地址
    if (qylxdz === 0 || qylxdz > 150) {
        submitRegErrorInputBorderStyle(qylxdz);
    } else {
        successInputBorderStyle(qylxdz);
    }
}
function qy_tj(){
    zctx_qy_tjInputBoxReg();
    //企业名称
    if($("#wycjyzxm").val()==""){
        Pop_up_box("企业名称不能为空!","2");
        return false;
    }else if(!regFwjgmc.test($("#wycjyzxm").val())) {
        Pop_up_box("企业名称格式不正确!","2");
        return false;
    }
    //证件号码
    var zjlx=$("#zjlx_select").val();
    if(zjlx=='组织机构代码证'){
        Pop_up_box('证件号码不能为空','2');
        return false;
    }else if(zjlx=='企业营业执照（五证合一）'){
        Pop_up_box('暂不支持','2');
        return false;
        // hz('zjhm','证件号码不能为空','证件号码格式不正确');
    }else if(zjlx=='军官证'){
        Pop_up_box('暂不支持','2');
        return false;
    }else if(zjlx=='士兵证'){
        Pop_up_box('暂不支持','2');
        return false;
    }
    //法定代表人姓名
    if($("#frdbxm").val()==""){
        Pop_up_box("姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#frdbxm").val())) {
        Pop_up_box("姓名格式不正确!","2");
        return false;
    }
    //法定代表人证件号码
    var zjlx=$("#frsfzh").val();
    if(zjlx=='组织机构代码证'){
        Pop_up_box('证件号码不能为空','2');
        return false;
    }else if(zjlx=='护照'){
        Pop_up_box('证件号码不能为空','2');
        return false;
    }
    //企业联系地址
    var val2=$("#qylxdz").val();
    var lgh1=val2.length;
    if(lgh1>150){
        Pop_up_box("联系地址不能超过150个文字","2");
        return false;
    }else if(lgh1==0){
        Pop_up_box("联系地址不能为空","2");
        return false;
    }
    return true;
}
//修改手机号码
function infoqy_xgsjhminputBoxReg() {
    var old_jbrlxfs = $('#old_jbrlxfs'),
        jyzyzm = $('#jyzyzm'),
        jbrlxfs = $('#jbrlxfs');
    //旧手机号码
    if ('' === old_jbrlxfs.val() || !regPhone.test(old_jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(old_jbrlxfs);
    } else {
        successInputBorderStyle(old_jbrlxfs);
    }
    //旧验证码
    if ('' === jyzyzm.val() || !regyzm.test(jyzyzm.val())) {
        submitRegErrorInputBorderStyle(jyzyzm);
    } else {
        successInputBorderStyle(jyzyzm);
    }
    //手机号码
    if ('' === jbrlxfs.val() || !regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
}
function qy_sjxg(){
    infoqy_xgsjhminputBoxReg();
    //旧手机号码
    if($("#old_jbrlxfs").val()==""){
        Pop_up_box("手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#old_jbrlxfs").val())) {
        Pop_up_box("手机号码格式不正确!","2");
        return false;
    }
    //旧验证码
    if($("#jyzyzm").val()==""){
        Pop_up_box("验证码不能为空!","2");
        return false;
    }else if(!regyzm.test($("#jyzyzm").val())) {
        Pop_up_box("验证码格式不正确!","2");
        return false;
    }
    //手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("","手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("","手机号码格式不正确!","2");
        return false;
    }
    return true;
}
//修改经办人信息
function infoqy_xgjbrxxInputBoxReg() {
    var zzjgdmz = $('#zzjgdmz'),
        qy_jbrName = $('#qy_jbrName'),
        jbrlxfs = $('#jbrlxfs'),
        jyzyzm = $('#jyzyzm'),
        jyzpwd = $('#jyzpwd'),
        jyzrepwd = $('#jyzrepwd');

    //身份证号码
    if(''===zzjgdmz.val()||!regIDCard.test(zzjgdmz.val())) {
        submitRegErrorInputBorderStyle(zzjgdmz);
    } else {
        successInputBorderStyle(zzjgdmz);
    }
    //姓名
    if(''===qy_jbrName.val()||!regName_zw.test(qy_jbrName.val())) {
        submitRegErrorInputBorderStyle(qy_jbrName);
    } else {
        successInputBorderStyle(qy_jbrName);
    }
    //手机号码
    if(''===jbrlxfs.val()||!regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
    //验证码
    if(''===jyzyzm.val()||!regyzm.test(jyzyzm.val())) {
        submitRegErrorInputBorderStyle(jyzyzm);
    } else {
        successInputBorderStyle(jyzyzm);
    }
    //密码
    if ('' === jyzpwd||!regPassword.test(jyzpwd)) {
        submitRegErrorInputBorderStyle(jyzpwd);
    } else {
        successInputBorderStyle(jyzpwd);
    }
    //确认密码
    if (''===jyzrepwd||jyzrepwd !== jyzpwd) {
        submitRegErrorInputBorderStyle(jyzrepwd);
    } else {
        successInputBorderStyle(jyzrepwd);
    }
}
function qy_jbr(){
    infoqy_xgjbrxxInputBoxReg();
    //身份证号码
    if($("#zzjgdmz").val()==""){
        Pop_up_box("身份证号码不能为空!","2");
        return false;
    }else if(!regIDCard.test($("#zzjgdmz").val())) {
        Pop_up_box("身份证号码格式不正确!","2");
        return false;
    }
    //姓名
    if($("#qy_jbrName").val()==""){
        Pop_up_box("","姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#qy_jbrName").val())) {
        Pop_up_box("","姓名格式不正确!","2");
        return false;
    }
    //手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("","手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("","手机号码格式不正确!","2");
        return false;
    }
    //验证码
    if($("#jyzyzm").val()==""){
        Pop_up_box("验证码不能为空!","2");
        return false;
    }else if(!regyzm.test($("#jyzyzm").val())) {
        Pop_up_box("验证码格式不正确!","2");
        return false;
    }
    //密码
    var pwd = $('#jyzpwd').val();
    if ('' === pwd) {
        Pop_up_box( '请输入密码','2');
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box( '密码格式不正确','2');
        return false;
    }
    //确认密码
    var pwd = $('#jyzpwd').val();
    var repwd = $('#jyzrepwd').val();
    if (repwd !== pwd) {
        Pop_up_box('两次密码输入的不一致','2');
        return false;
    }
    return true;
}
//添加经办人
function infoqy_tjjbrInputBoxReg() {
    var zzjgdmz = $('#zzjgdmz'),
        qy_jbrName = $('#qy_jbrName'),
        jbrlxfs = $('#jbrlxfs'),
        jyzpwd = $('#jyzpwd'),
        jyzrepwd = $('#jyzrepwd');

    //身份证号码
    if ('' === zzjgdmz.val() || !regIDCard.test(zzjgdmz.val())) {
        submitRegErrorInputBorderStyle(zzjgdmz);
    } else {
        successInputBorderStyle(zzjgdmz);
    }
    //姓名
    if ('' === qy_jbrName.val() || !regName_zw.test(qy_jbrName.val())) {
        submitRegErrorInputBorderStyle(qy_jbrName);
    } else {
        successInputBorderStyle(qy_jbrName);
    }
    //手机号码
    if ('' === jbrlxfs.val() || !regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
    //密码
    if ('' === jyzpwd || !regPassword.test(jyzpwd)) {
        submitRegErrorInputBorderStyle(jyzpwd);
    } else {
        successInputBorderStyle(jyzpwd);
    }
    //确认密码
    if ('' === jyzrepwd || jyzrepwd !== jyzpwd) {
        submitRegErrorInputBorderStyle(jyzrepwd);
    } else {
        successInputBorderStyle(jyzrepwd);
    }
}
function jbr_tj(type){
    infoqy_tjjbrInputBoxReg();
    //身份证号码
    if($("#zzjgdmz").val()==""){
        Pop_up_box("身份证号码不能为空!","2");
        return false;
    }else if(!regIDCard.test($("#zzjgdmz").val())) {
        Pop_up_box("身份证号码格式不正确!","2");
        return false;
    }
    //姓名
    if($("#qy_jbrName").val()==""){
        Pop_up_box("姓名不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#qy_jbrName").val())) {
        Pop_up_box("姓名格式不正确!","2");
        return false;
    }
    //手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("手机号码格式不正确!","2");
        return false;
    }
    //密码
    var pwd = $('#jyzpwd').val();
    if ('' === pwd) {
        Pop_up_box('请输入密码','2');
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box('密码格式不正确','2');
        return false;
    }
    //确认密码
    var pwd = $('#jyzpwd').val();
    var repwd = $('#jyzrepwd').val();
    if (repwd !== pwd) {
        Pop_up_box('两次密码输入的不一致','2');
        return false;
    }
    if(type=='1'){
        if($('#fileupload_jbrsfzm').val()==''){
            Pop_up_box("经办人身份证明（正面）图片必须提交！","2");
            return false;
        }else{
            var zzjgdmzzp=$('#fileupload_jbrsfzm').val();
            var a = zzjgdmzzp.substr(zzjgdmzzp.indexOf('.')+1);
            if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='png'&&a!='PNG'){
                Pop_up_box("经办人身份证明（正面）图片只能上传.jpg或者.JPEG、png格式的图片！","2");
                return false;
            }
        }
        if($('#fileupload_jbrsfzmfm').val()==''){
            Pop_up_box("经办人身份证明（反面）图片必须提交！","2");
            return false;
        }else{
            var zzjgdmzzp=$('#fileupload_jbrsfzmfm').val();
            var a = zzjgdmzzp.substr(zzjgdmzzp.indexOf('.')+1);
            if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'&&a!='PNG'&&a!='png'){
                Pop_up_box("经办人身份证明（反面）图片只能上传.jpg或者.JPEG、png格式的图片！","2");
                return false;
            }
        }
    }
    return true;
}
/***经办人注册***/
//经办人注册验证
function jbrzcyz(){
    //经办人姓名
    $("#jbrName").focus(function(){
        hint_info("jbrName","请输入经办人姓名","2");
    });
    $("#jbrName").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jbrName").val()==""){
            hint_info("jbrName","经办人姓名不能为空！","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#jbrName").val())) {
            hint_info("jbrName","经办人姓名格式不正确！","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //经办人手机号码
    $("#jbrlxfs").focus(function(){
        hint_info("jbrlxfs","请输入经办人手机号码","2");
    });
    $("#jbrlxfs").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jbrlxfs").val()==""){
            hint_info("jbrlxfs","经办人手机号码不能为空！","2");
            div.addClass('has-error');
        }else if(!regPhone.test($("#jbrlxfs").val())) {
            hint_info("jbrlxfs","经办人手机号码格式不正确！","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //验证码
    $("#jyzyzm").focus(function(){
        hint_info("jyzyzm","请输入验证码","2");
    });
    $("#jyzyzm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jyzyzm").val()==""){
            hint_info("jyzyzm","验证码不能为空！","2");
            div.addClass('has-error');
        }else if(!regyzm.test($("#jyzyzm").val())) {
            hint_info("jyzyzm","验证码格式不正确！","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //密码
    $("#jyzpwd").focus(function(){
        hint_info("jyzpwd","请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：a11111","2");
    });
    $("#jyzpwd").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jyzpwd").val()==""){
            hint_info("jyzpwd","密码不能为空！","2");
            div.addClass('has-error');
        }else if(!regPassword.test($("#jyzpwd").val())) {
            hint_info("jyzpwd","密码格式不正确！","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //确认密码
    $("#jyzrepwd").focus(function(){
        hint_info("jyzrepwd","请再次输入密码","2");
    });
    $("#jyzrepwd").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        var password1=$("#jyzrepwd").val();
        var password=$("#jyzpwd").val();
        if($("#jyzrepwd").val()==""){
            hint_info("jyzrepwd","确认密码不能为空！","2");
            div.addClass('has-error');
        }else if(password1!==password) {
            hint_info("jbrzc_qrmm","两次密码输入不相同！","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
}
function infoTj_ptInputBoxReg() {
    var jbrName = $('#jbrName'),
        jbrlxfs = $('#jbrlxfs'),
        jyzpwd = $('#jyzpwd'),
        jyzrepwd = $('#jyzrepwd');
    //经办人姓名
    if ('' === jbrName.val() || !regName.test(jbrName.val())) {
        submitRegErrorInputBorderStyle(jbrName);
    } else {
        successInputBorderStyle(jbrName);
    }
    //经办人手机号码
    if ('' === jbrlxfs.val() || !regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    } else {
        successInputBorderStyle(jbrlxfs);
    }
    //密码
    if ('' === jyzpwd.val() || !regPassword.test(jyzpwd.val())) {
        submitRegErrorInputBorderStyle(jyzpwd);
    } else {
        successInputBorderStyle(jyzpwd);
    }
    //确认密码
    if ('' === jyzrepwd.val() || jyzrepwd !== jyzpwd) {
        submitRegErrorInputBorderStyle(jyzrepwd);
    } else {
        successInputBorderStyle(jyzrepwd);
    }
}
//经办人提交验证
function jbrtj(){
    infoTj_ptInputBoxReg();
    //经办人姓名
    if($("#jbrName").val()==""){
        Pop_up_box("经办人姓名不能为空！","2");
        return false;
    }else if(!regName.test($("#jbrName").val())) {
        Pop_up_box("经办人姓名格式不正确！","2");
        return false;
    }
    //经办人手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("经办人手机号码不能为空！","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("经办人手机号码格式不正确！","2");
        return false;
    }
    //验证码
//    if($("#jyzyzm").val()==""){
//        Pop_up_box("验证码不能为空！","2");
//        return false;
//    }else if(!regyzm.test($("#jyzyzm").val())) {
//        Pop_up_box("验证码格式不正确！","2");
//        return false;
//    }
    //密码
    if($("#jyzpwd").val()==""){
        Pop_up_box("密码不能为空！","2");
        return false;
    }else if(!regPassword.test($("#jyzpwd").val())) {
        Pop_up_box("密码格式不正确！","2");
        return false;
    }
    //确认密码
    var password1=$("#jyzrepwd").val();
    var password=$("#jyzpwd").val();
    if($("#jyzrepwd").val()==""){
        Pop_up_box("确认密码不能为空！","2");
        return false;
    }else if(password1!==password) {
        Pop_up_box("两次密码输入不相同！","2");
        return false;
    }
    return true;
}
