/**
 * Created by dywed on 2017/3/14.
 */
function jbcNameReg() {
    var jdcName = $('#jdcName').val();
    removeInputBorderStyle($(this));
    var div = $(this).parent();
    if ('' === jdcName) {
        hintInfo('jdcName', '请输入姓名');
        div.addClass('has-error');
        return false;
    } else if(!regName_zw.test(jdcName)) {
        hintInfo('jdcName', '姓名格式不正确');
        div.addClass('has-error');
        return false;
    } else {
        div.addClass('has-success');
        return true;
    }
}
function zjhmReg(thisOne) {
    var zjhm = thisOne.val();
    var zjlx = $('#zjlx_select').val();
    removeInputBorderStyle(thisOne);
    var div = thisOne.parent();
    if ('' === zjhm) {
        hintInfo('zjhm', '请输入证件号码');
        div.addClass('has-error');
        return false;
    } else {
        if ('居民身份证' === zjlx) {
            if (!regIDCard.test(zjhm)) {
                hintInfo('zjhm', '居民身份证格式不正确');
                div.addClass('has-error');
                return false;
            } else {
                div.addClass('has-success');
            }
        } else if ('护照' === zjlx) {
            if (!regPtPassport.test(zjhm)) {
                hintInfo('zjhm', '护照格式不正确');
                div.addClass('has-error');
                return false;
            } else {
                div.addClass('has-success');
            }
        } else if ('军官证' === zjlx) {
            /*if(!regName_zw.test(zjhm)) {
                hintInfo('zjhm', '姓名格式不正确');
                div.addClass('has-error');
                return false;
            }*/
            hintInfo('zjhm', '暂不支持');
            return false;
        } else if ('士兵证' === zjlx) {
            /*if(!regName_zw.test(zjhm)) {
                hintInfo('zjlx', '姓名格式不正确');
                div.addClass('has-error');
                return false;
            }*/
            hintInfo('zjhm', '暂不支持');
            return false;
        }
    }
    return true;
}

function sjhmReg() {
    var sjhm = $("#sjhm").val();
    removeInputBorderStyle($(this));
    var div = $(this).parent();
    if (sjhm == "") {
        hint_info('sjhm', '手机号码不能为空', 1);
        div.addClass('has-error');
        return false;
    } else if (!regPhone.test($("#sjhm").val())) {
        hint_info('sjhm', '手机号码格式不正确', 1);
        div.addClass('has-error');
        return false;
    } else {
        div.addClass('has-success');
    }
    return true;
}
function yzmReg() {
    var yzm = $("#yzm").val();
    removeInputBorderStyle($(this));
    var div = $(this).parent();
    if (yzm == "") {
        hint_info('yzm', '请输入验证码', 1);
        div.addClass('has-error');
        return false;
    } else if (4 !== yzm.length) {
        hint_info('yzm', '验证码格式不正确', 1);
        div.addClass('has-error');
        return false;
    } else {
        div.addClass('has-success');
    }
    return true;
}
function pwdReg() {
    var pwd = $('#pwd').val();
    removeInputBorderStyle($(this));
    var div = $(this).parent();
    if ('' === pwd) {
        hintInfo('pwd', '请输入密码');
        div.addClass('has-error');
        return false;
    } else if (!regPassword.test(pwd)) {
        hintInfo('pwd', '密码格式不正确');
        div.addClass('has-error');
        return false;
    } else {
        div.addClass('has-success');
    }
    return true;
}
function repwdReg() {
    var pwd = $('#pwd').val();
    var repwd = $('#repwd').val();
    removeInputBorderStyle($(this));
    var div = $(this).parent();
    if ('' === repwd) {
        hintInfo('repwd', '请输入确认密码');
        div.addClass('has-error');
    } else if (repwd !== pwd) {
        hintInfo('repwd', '两次密码输入的不一致');
        div.addClass('has-error');
        return false;
    } else {
        div.addClass('has-success');
    }
    return true;
}

$(function () {
    $('#jdcName').on('focus', function () {
        hintInfo('jdcName', '请输入姓名 例：张三');
    }).on('blur', jbcNameReg);
    $('#zjhm').on('focus', function () {
        var zjlx = $('#zjlx_select').val();
        if ('居民身份证' === zjlx) {
            hintInfo('zjhm', '请输入15位或18位身份证');
        } else if ('护照' === zjlx) {
            hintInfo('zjhm', '请输入9位以14或15开头的普通护照');
        } else if ('军官证' === zjlx) {
            hintInfo('zjhm', '暂不支持');
        } else if ('士兵证' === zjlx) {
            hintInfo('zjhm', '暂不支持');
        }
    }).on('blur', function() {
        if (!zjhmReg($(this))) {
            return false;
        }
    }).on('keyup', function () {
        var zjlx = $('#zjlx_select').val();
        if (9 === $(this).val().length) {
            if ('护照' === zjlx) {
                zjhmReg($(this))
            }
        } else if (18 === $(this).val().length) {
            if ('居民身份证' === zjlx) {
                var zjhm = $(this).val();
                var y = zjhm.substring(6, 14).substring(0,4),
                    m = zjhm.substring(6, 14).substring(4,6),
                    d = zjhm.substring(6, 14).substring(6,8);
                var csrq = $('#csrq').val(y + '-' + m + '-' + d);
                removeInputBorderStyle(csrq);
                var div = csrq.parent();
                if($("#csrq").val()==""){
                    hint_info("csrq","出生日期不能为空!","2");
                    div.addClass('has-error');
                }else if(!regDate.test($("#csrq").val())) {
                    hint_info("csrq","出生日期日期格式不正确!","2");
                    div.addClass('has-error');
                } else {
                    div.addClass('has-success');
                }
                zjhmReg($(this))
            }
        } else if(18 < $(this).val().length){
            zjhmReg($(this))
        }
    });
    $('#sjhm').on('focus', function () {
        hint_info('sjhm', '请输入手机号码 例：13566666666', 1);
    }).on('blur', sjhmReg);
    $('#yzm').on('focus', function () {
        hint_info('yzm', '请输入手机号码 例：13566666666', 1);
    }).on('blur', yzmReg);
    $('#pwd').on('focus', function () {
        hintInfo('pwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：张三');
    }).on('blur', pwdReg);
    $('#repwd').on('focus', function () {
        hintInfo('repwd', '请输入确认密码');
    }).on('blur', repwdReg);
});
function zctx_inputBoxReg() {
    var jdcName = $('#jdcName'),
        zjlx = $('#zjlx_select').val(),
        zjhm = $('#zjhm'),
        csrq = $('#csrq'),
        sjhm = $('#sjhm'),
        yzm = $('#yzm'),
        pwd = $('#pwd'),
        repwd = $('#repwd'),
        lxdz = $('#lxdz'),
        sfzdz = $('#sfzdz');
    //姓名
    if (jdcName.val() == "" || !regDabh.test(jdcName.val())) {
        submitRegErrorInputBorderStyle(jdcName);
    }
    //证件号码
    if ('居民身份证' === zjlx) {
        if (zjhm.val() == '' || !regIDCard.test(zjhm.val())) {
            submitRegErrorInputBorderStyle(zjhm);
        }
    } else if ('护照' === zjlx) {
        if(zjhm.val() == '' || !regPtPassport.test(zjhm)) {
            submitRegErrorInputBorderStyle(zjhm);
        }
    }
    //出生日期
    if (csrq.val() == "" || !regDate.test(csrq.val())) {
        submitRegErrorInputBorderStyle(csrq);
    }
    //手机号码
    if (sjhm.val() == '' || !regPhone.test(sjhm.val())) {
        submitRegErrorInputBorderStyle(sjhm);
    }
    //验证码
    if ('' === yzm.val() || 4 !== yzm.val().length) {
        submitRegErrorInputBorderStyle(yzm);
    }
    //密码
    if ('' === pwd.val() || !regPassword.test(pwd.val())) {
        submitRegErrorInputBorderStyle(pwd);
    }
    if ('' === repwd.val() || repwd.val() !== pwd.val()) {
        submitRegErrorInputBorderStyle(repwd);
    }
    //居住之地
    if(lxdz.val()==""||!regfwjgdz.test(lxdz.val())) {
        submitRegErrorInputBorderStyle(lxdz)
    }
    //身份证地址
    if(sfzdz.val()==""||!regfwjgdz.test(sfzdz.val())) {
        submitRegErrorInputBorderStyle(sfzdz)
    }
}
//个人提交验证
function gr_tj(){
    zctx_inputBoxReg();
    //姓名
    var jdcName = $('#jdcName').val();
    if ('' === jdcName) {
        hintInfo('jdcName', '请输入姓名');
        Pop_up_box("请输入姓名","2");
        return false;
    } else if(!regName_zw.test(jdcName)) {
        hintInfo('jdcName', '姓名格式不正确');
        Pop_up_box("姓名格式不正确","2");
        return false;
    }
    //证件号码
    var zjlx = $('#zjlx_select').val();
    if ('居民身份证' === zjlx) {
        var zjhm = $('#zjhm').val(),
            zjlx = $('#zjlx_select').val();
        if(!regIDCard.test(zjhm)) {
            Pop_up_box("居民身份证格式不正确","2");
            return false;
        }
    } else if ('护照' === zjlx) {
        if(!regPtPassport.test(zjhm)) {
            Pop_up_box("护照格式不正确","2");
            return false;
        }
    } else if ('军官证' === zjlx) {
        hintInfo('zjhm', '暂不支持');
        Pop_up_box("暂不支持","2");
        return false;
    } else if ('士兵证' === zjlx) {
        hintInfo('zjhm', '暂不支持');
        Pop_up_box("暂不支持","2");
        return false;
    }
    //出生日期
    if($("#csrq").val()==""){
        Pop_up_box("出生日期不能为空","2");
        return false;
    }else if(!regDate.test($("#csrq").val())) {
        Pop_up_box("出生日期日期格式不正确","2");
        return false;
    }
    //手机号码
    var sjhm = $("#sjhm").val();
    if (sjhm == "") {
        Pop_up_box("手机号码不能为空","3");
        return false;
    } else if (!regPhone.test($("#sjhm").val())) {
        Pop_up_box("手机号码格式不正确","2");
        return false;
    }
    //验证码
    var yzm = $('#yzm').val();
    if('' === yzm){
        Pop_up_box("请输入验证码");
    }else if (4 !== yzm.length) {
        Pop_up_box("验证码格式不正确");
    }
    //密码
    var pwd = $('#pwd').val();
    var repwd = $('#repwd').val();
    if ('' === pwd) {
        hintInfo('pwd', '请输入密码');
        Pop_up_box("请输入密码");
        return false;
    } else if(!regPassword.test(pwd)) {
        //确认密码
        Pop_up_box("密码格式不正确","2");
        return false;
    }
    if (repwd !== pwd) {
        Pop_up_box("两次密码输入的不一致","2");
        return false;
    }
    //居住之地
    if($("#lxdz").val()==""){
        Pop_up_box("现住地址不能为空","2");
        return false;
    }else if(!regfwjgdz.test($("#lxdz").val())) {
        Pop_up_box("现住地址格式不正确","2");
        return false;
    }
    //身份证地址
    if($("#sfzdz").val()==""){
        Pop_up_box("身份证详细地址不能为空","2");
        return false;
    }else if(!regfwjgdz.test($("#sfzdz").val())) {
        Pop_up_box("身份证详细地址格式不正确","2");
        return false;
    }
    var dataPara = getFormJson("zc_form");
    dataPara.MM = hex_md5(dataPara.MM);
    dataPara.reMM = hex_md5(dataPara.reMM);
    var datap= JSON.stringify(dataPara);
    $.ajax({
        type:"post",
        url: basePath + "register/insert_gruser",
        //提交的数据
        data:{
            "postData" : datap
        },
        dataType: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success:function(data){
        	console.log("success")
            layer.closeAll('loading');
            if(data.info=='注册成功'){
            	layer.confirm((data.info+',请登录！'), {
            		cancel: function(index){
            			layer.closeAll('loading');
            			window.location.href= basePath+"index.html";
            			return false; 
        			},
            	    btn: ['确定'] //按钮
            	}, function(index){
            		layer.closeAll('loading');
            		layer.close(index);
            		window.location.href= basePath+"index.html";
                });
            }else{
            	layer.closeAll('loading');
                Pop_up_box(data.info,2);
            }
        },
        //调用出错执行的函数
        error: function(){
        	console.log("error")
        	layer.closeAll('loading');
            //请求出错处理
        }
    });
}
//企业验证
function qyyz(){
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
        }else if(!regFwjgmc.test($("#wycjyzxm").val())) {
            hint_info("wycjyzxm","企业名称格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //统一社会信用代码
    $("#tyshxydm").focus(function(){
        hint_info("tyshxydm","请输入统一社会信用代码","2");
    }).blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#tyshxydm").val()==""){
            hint_info("tyshxydm","统一社会信用代码不能为空!","2");
            div.addClass('has-error');
        }else if(!regFwjgmc.test($("#tyshxydm").val())) {
            hint_info("tyshxydm","统一社会信用代码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //证件号码
    $("#zzjgdmz").focus(function(){
        hint_info("zzjgdmz","请输入证件号码","2");
    });
    $("#zzjgdmz").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#zzjgdmz").val()==""){
            hint_info("zzjgdmz","证件号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regzzjgdm.test($("#zzjgdmz").val())) {
            hint_info("zzjgdmz","证件号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //法人代表姓名
    $("#frdbxm").focus(function(){
        hint_info("frdbxm","请输入法人代表姓名（分公司输入负责人姓名）","2");
    });
    $("#frdbxm").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#frdbxm").val()==""){
            hint_info("frdbxm","法人代表姓名不能为空!","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#frdbxm").val())) {
            hint_info("frdbxm","法人代表姓名格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //法人代表证件号码
    function sfz(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#frsfzh").val()==""){
            hint_info('frsfzh',"证件号码不能为空","2");
            div.addClass('has-error');
        }else if(!regIDCard.test($("#frsfzh").val())){
            hint_info("frsfzh","证件号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    }
    function hz(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#frsfzh").val()==""){
            hint_info('frsfzh',"证件号码不能为空","2");
            div.addClass('has-error');
        }else if(!regGwPassport.test($("#frsfzh").val())){
            hint_info("frsfzh","证件号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    }
    $("#frsfzh").focus(function(){
        hint_info("frsfzh","请输入法人代表证件号码","2");
    });
    $("#frsfzh").blur(function(){
        var zjlx=$("#zjlx_select").val();
        if(zjlx=="居民身份证"){
            sfz();
        } else{
            hz();
        }
    });
    //企业联系地址
    $("#qylxdz").focus(function(){
        hint_info("qylxdz","请输入企业联系地址","2");
    });
    $("#qylxdz").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#qylxdz").val()==""){
            hint_info("qylxdz","企业联系地址不能为空!","2");
            div.addClass('has-error');
        }else if(!regfwjgdz.test($("#qylxdz").val())) {
            hint_info("qylxdz","企业联系地址格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //企业联系电话
    $('#qylxdh').on('focus', function () {
        hint_info("qylxdh","请输入企业联系电话","2");
    }).on('blur', function () {
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#qylxdh").val()==""){
            hint_info("qylxdh","企业联系电话不能为空!","2");
            div.addClass('has-error');
        }else if(!regfwjgdz.test($("#qylxdh").val())) {
            hint_info("qylxdh","企业联系电话格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //法定代表人证件号码
    $("#frsfzh").focus(function(){
        hint_info("frsfzh","请输入法定代表人证件号码","2");
    }).blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#frsfzh").val()==""){
            hint_info("frsfzh","法定代表人证件号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regIDCard.test($("#frsfzh").val())) {
            hint_info("frsfzh", "法定代表人证件号码格式不正确!", "2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //经办人姓名
    $("#jbrName").focus(function(){
        hint_info("jbrName","请输入经办人名称","2");
    });
    $("#jbrName").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#jbrName").val()==""){
            hint_info("jbrName","经办人名称不能为空!","2");
            div.addClass('has-error');
        }else if(!regName_zw.test($("#jbrName").val())) {
            hint_info("jbrName","经办人名称格式不正确!","2");
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
            hint_info("jbrlxfs","经办人手机号码不能为空!","2");
            div.addClass('has-error');
        }else if(!regPhone.test($("#jbrlxfs").val())) {
            hint_info("jbrlxfs","经办人手机号码格式不正确!","2");
            div.addClass('has-error');
        } else {
            div.addClass('has-success');
        }
    });
    //验证码
    $("#jyzyzm").focus(function(){
        hint_info("jyzyzm","请输入四位数字的验证码","2");
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
    //密码
    function pwdReg() {
        var pwd = $('#jyzpwd').val();
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if ('' === pwd) {
            hintInfo('jyzpwd', '请输入密码');
            div.addClass('has-error');
            return false;
        } else if (!regPassword.test(pwd)) {
            hintInfo('jyzpwd', '密码格式不正确');
            div.addClass('has-error');
            return false;
        } else {
            div.addClass('has-success');
        }
        return true;
    }
    function repwdReg() {
        var pwd = $('#jyzpwd').val();
        var repwd = $('#jyzrepwd').val();
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if ('' === repwd) {
            hintInfo('jyzpwd', '请输入确认密码');
            div.addClass('has-error');
            return false;
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
        hintInfo('jyzpwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：张三');
    }).on('blur', pwdReg);
    $('#jyzrepwd').on('focus', function () {
        hintInfo('jyzrepwd', '请输入确认密码');
    }).on('blur', repwdReg);
}
function zctx_qy_tjInputBoxReg() {
    var wycjyzxm = $('#wycjyzxm'),
        tyshxydm = $('#tyshxydm'),
        zzjgdmz = $('#zzjgdmz'),
        frdbxm = $('#frdbxm'),
        zjlx_select = $('#zjlx_select'),
        frsfzh = $('#frsfzh'),
        qylxdz = $('#qylxdz'),
        qylxdh = $('#qylxdh'),
        jbrName = $('#jbrName'),
        jbrlxfs = $('#jbrlxfs'),
        jyzyzm = $('#jyzyzm'),
        jyzpwd = $('#jyzpwd'),
        jyzrepwd = $('#jyzrepwd');
    //企业名称
    if(wycjyzxm.val()==""||!regFwjgmc.test(wycjyzxm.val())) {
        submitRegErrorInputBorderStyle(wycjyzxm);
    }
    //统一社会信用代码
    if(tyshxydm.val()==""||!regFwjgmc.test(tyshxydm.val())) {
        submitRegErrorInputBorderStyle(tyshxydm);
    }
    //证件号码
    if(zzjgdmz.val()==""|!regFwjgmc.test(zzjgdmz.val())) {
        submitRegErrorInputBorderStyle(zzjgdmz);
    }
    //法人代表姓名
    if(frdbxm.val()==""||!regName_zw.test(frdbxm.val())) {
        submitRegErrorInputBorderStyle(frdbxm);
    }
    //法人代表证件号码
    if('居民身份证' === zjlx_select.val()) {
        if(frsfzh.val()==""||!regIDCard.test(frsfzh.val())){
            submitRegErrorInputBorderStyle(frsfzh);
        }
    }
    if('护照' === zjlx_select.val()) {
        if(frsfzh.val()==""||!regGwPassport.test(frsfzh.val())){
            submitRegErrorInputBorderStyle(frsfzh);
        }
    }
    //企业联系地址
    if(qylxdz.val()==""||!regfwjgdz.test(qylxdz.val())) {
        submitRegErrorInputBorderStyle(qylxdz);
    }
    //企业联系电话
    if(qylxdh.val()==""||!regPhone.test(qylxdh.val())) {
        submitRegErrorInputBorderStyle(qylxdh);
    }
    //经办人姓名
    if(jbrName.val()==""||!regName_zw.test(jbrName.val())) {
        submitRegErrorInputBorderStyle(jbrName);
    }
    //经办人手机号码
    if(jbrlxfs.val()==""||!regPhone.test(jbrlxfs.val())) {
        submitRegErrorInputBorderStyle(jbrlxfs);
    }
    //验证码
    if(jyzyzm.val()==""||!regyzm.test(jyzyzm.val())) {
        submitRegErrorInputBorderStyle(jyzyzm);
    }
    //密码
    if ('' === jyzpwd.val()||!regPassword.test(jyzpwd.val())) {
        submitRegErrorInputBorderStyle(jyzpwd);
    }
    //确认密码
    if ('' === jyzrepwd.val()||jyzrepwd.val() !== jyzpwd.val()) {
        submitRegErrorInputBorderStyle(jyzrepwd);
    }
}
//企业提交
function qy_tj(){
    zctx_qy_tjInputBoxReg();
    //企业名称
    if($("#wycjyzxm").val()==""){
        Pop_up_box("企业名称不能为空","2");
        return false;
    }else if(!regFwjgmc.test($("#wycjyzxm").val())) {
        Pop_up_box("企业名称格式不正确","2");
        return false;
    }
    //统一社会信用代码
    if(tyshxydm.val() == "") {
        Pop_up_box("统一社会信用代码不能为空","2");
        return false;
    } else if (!regName.test(tyshxydm.val())) {
        Pop_up_box("统一社会信用代码格式不正确","2");
        return false;
    }
    //证件号码
    if($("#zzjgdmz").val()==""){
        Pop_up_box("证件号码不能为空","2");
        return false;
    }else if(!regFwjgmc.test($("#zzjgdmz").val())) {
        Pop_up_box("证件号码格式不正确","2");
        return false;
    }
    //法人代表姓名
    if($("#frdbxm").val()==""){
        Pop_up_box("法人代表姓名不能为空!","2");
        return false
    }else if(!regName_zw.test($("#frdbxm").val())) {
        Pop_up_box("法人代表姓名格式不正确!","2");
        return false;
    }
    //法人代表证件号码
    if($("#frsfzh").val()==""){
        Pop_up_box("证件号码不能为空","2");
        return false;
    }else if(!regIDCard.test($("#frsfzh").val())){
        Pop_up_box("证件号码格式不正确!","2");
        return false;
    }
    if($("#frsfzh").val()==""){
        Pop_up_box("证件号码不能为空","2");
        return false;
    }else if(!regGwPassport.test($("#frsfzh").val())){
        Pop_up_box("证件号码格式不正确!","2");
        return false;
    }
    //企业联系地址
    if($("#qylxdz").val()==""){
        Pop_up_box("企业联系地址不能为空!","2");
        return false;
    }else if(!regfwjgdz.test($("#qylxdz").val())) {
        Pop_up_box("企业联系地址格式不正确!","2");
        return false;
    }//企业联系电话
    if($('qylxdh').val()==""){
        Pop_up_box("企业联系电话不能为空!","2");
        return false;
    }else if(!regPhone.test($('qylxdh').val())) {
        Pop_up_box("企业联系电话格式不正确!","2");
        return false;
    }
    //经办人姓名
    if($("#jbrName").val()==""){
        Pop_up_box("经办人名称不能为空!","2");
        return false;
    }else if(!regName_zw.test($("#jbrName").val())) {
        Pop_up_box("经办人名称格式不正确!","2");
        return false;
    }
    //经办人手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("经办人手机号码不能为空!","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("经办人手机号码格式不正确!","2");
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
        hintInfo('jyzpwd', '请输入密码');
        Pop_up_box("请输入密码");
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box("密码格式不正确","2");
        return false;
    }
    //确认密码
    var repwd = $('#jyzrepwd').val();
    if ('' === repwd) {
        hintInfo('jyzrepwd', '请输入确认密码');
        Pop_up_box("请输入确认密码");
        return false;
    } else if(!regPassword.test(repwd)) {
        Pop_up_box("确认密码格式不正确","2");
        return false;
    }
    if (repwd !== pwd) {
        Pop_up_box("两次密码输入的不一致","2")
        return false;
    }
    
    if($('#fileupload_zzjgdmzzp').val()==''){
		Pop_up_box("组织机构代码证或企业营业执照（五证合一）图片必须提交！","2");
		return false;
	}else{
		var zzjgdmzzp=$('#fileupload_zzjgdmzzp').val();
		var a = zzjgdmzzp.substr(zzjgdmzzp.indexOf('.')+1);
		if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
			Pop_up_box("组织机构代码证或企业营业执照（五证合一）图片只能上传.jpg或者.JPEG格式的图片！","2");
			return false;
		}
	}
    if($('#fileupload_jbrsfzm').val()==''){
		Pop_up_box("机动车所有人身份证明(正面)图片必须提交！","2");
		return false;
	}else{
		var jbrsfzm=$('#fileupload_jbrsfzm').val();
		var a = jbrsfzm.substr(jbrsfzm.indexOf('.')+1);
		if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
			Pop_up_box("机动车所有人身份证明(正面)图片只能上传.jpg或者.JPEG格式的图片！","2");
			return false;
		}
	}
    if($('#fileupload_jbrsfzmfm').val()==''){
		Pop_up_box("机动车所有人身份证明(反面)图片必须提交！","2");
		return false;
	}else{
		var jbrsfzmfm=$('#fileupload_jbrsfzmfm').val();
		var a = jbrsfzmfm.substr(jbrsfzmfm.indexOf('.')+1);
		if(a!='jpg'&&a!='jpeg'&&a!='JPG'&&a!='JPEG'){
			Pop_up_box("机动车所有人身份证明(反面)图片只能上传.jpg或者.JPEG格式的图片！","2");
			return false;
		}
	}
	$("#zc_form").submit();
}
//平台验证
function ptzc(){
    //组织机构代码
    $("#zzjgdm").focus(function(){
        hint_info("zzjgdm","请输入组织机构代码","2");
    });
    $("#zzjgdm").blur(function(){
        if($("#zzjgdm").val()==""){
            hint_info("zzjgdm","组织机构代码不能为空!","2");
        }else if(!regzzjgdm.test($("#zzjgdm").val())) {
            hint_info("zzjgdm","组织机构代码格式不正确!","2");
        }
    });
    //经办人姓名
    $("#jbrName").focus(function(){
        hint_info("jbrName","请输入经办人姓名","2");
    });
    $("#jbrName").blur(function(){
        if($("#jbrName").val()==""){
            hint_info("jbrName","经办人姓名不能为空!","2");
        }else if(!regName_zw.test($("#jbrName").val())) {
            hint_info("jbrName","经办人姓名格式不正确!","2");
        }
    });
    //经办人手机号码
    $("#jbrlxfs").focus(function(){
        hint_info("jbrlxfs","请输入经办人手机号码","2");
    });
    $("#jbrlxfs").blur(function(){
        if($("#jbrlxfs").val()==""){
            hint_info("jbrlxfs","经办人手机号码不能为空!","2");
        }else if(!regPhone.test($("#jbrlxfs").val())) {
            hint_info("jbrlxfs","经办人手机号码格式不正确!","2");
        }
    });
    //验证码
    $("#jyzyzm").focus(function(){
        hint_info("jyzyzm","请输入验证码","2");
    });
    $("#jyzyzm").blur(function(){
        if($("#jyzyzm").val()==""){
            hint_info("jyzyzm","验证码码不能为空!","2");
        }else if(!regyzm.test($("#jyzyzm").val())) {
            hint_info("jyzyzm","验证码码格式不正确!","2");
        }
    });
    //密码
    function pwdReg() {
        var pwd = $('#jyzpwd').val();
        if ('' === pwd) {
            hintInfo()('jyzpwd', '请输入密码');
            return false;
        } else if(!regPassword.test(pwd)) {
            hintInfo('jyzpwd', '密码格式不正确');
            return false;
        }
        // return true;
    }
    function repwdReg() {
        var pwd = $('#jyzpwd').val();
        var repwd = $('#jyzrepwd').val();
        if (repwd !== pwd) {
            hintInfo('jyzrepwd', '两次密码输入的不一致');
            return false;
        }
        // return true;
    }
    $('#jyzpwd').on('focus', function () {
        hintInfo('jyzpwd', '请输入密码 格式：以字母开头，可用符号~!@#$%^&*，密码长度5-16位 例：张三');
    }).on('blur', pwdReg);
    $('#jyzrepwd').on('focus', function () {
        hintInfo('jyzrepwd', '请输入确认密码');
    }).on('blur', repwdReg)
}
//平台提交验证
function pt_tj(){
	if(nfzc != 0){
		Pop_up_box("请先验证企业名称及组织机构代码证后再提交注册！","2");
		return false;
	}
    //组织机构代码
    if($("#zzjgdm").val()==""){
        Pop_up_box("组织机构代码不能为空","2");
        return false;
    }else if(!regzzjgdm.test($("#zzjgdm").val())) {
        Pop_up_box("组织机构代码格式不正确","2");
        return false;
    }
    //经办人姓名
    if($("#jbrName").val()==""){
        Pop_up_box("经办人姓名不能为空","2");
        return false;
    }else if(!regName_zw.test($("#jbrName").val())) {
        Pop_up_box("经办人姓名格式不正确","2");
        return false;
    }
    //经办人手机号码
    if($("#jbrlxfs").val()==""){
        Pop_up_box("经办人手机号码不能为空","2");
        return false;
    }else if(!regPhone.test($("#jbrlxfs").val())) {
        Pop_up_box("经办人手机号码格式不正确","2");
        return false;
    }
    //验证码
    if($("#jyzyzm").val()==""){
        Pop_up_box("验证码不能为空");
        return false;
    }else if(!regyzm.test($("#jyzyzm").val())) {
        Pop_up_box("验证码码格式不正确","2");
        return false;
    }
    //密码
    var pwd = $('#jyzpwd').val();
    if ('' === pwd) {
        Pop_up_box("请输入密码","2");
        return false;
    } else if(!regPassword.test(pwd)) {
        Pop_up_box("密码格式不正确","2");
        return false;
    }
    //确认密码
    var repwd = $('#jyzrepwd').val();
    if (repwd !== pwd) {
        alert('1111 ')
        Pop_up_box('两次密码输入的不一致',"2");
        return false;
    }
    var dataPara = getFormJson("zc_form");
    dataPara.JYZPWD = hex_md5(dataPara.JYZPWD);
    dataPara.JYZREPWD = hex_md5(dataPara.JYZREPWD);
    var datap= JSON.stringify(dataPara);
    $.ajax({
        type:"post",
        url: basePath + "register/insert_ptjbr",
        //提交的数据
        data:{
            "postData" : datap
        },
        dataType: "json",//"xml", "html", "script", "json", "jsonp", "text".
        //成功返回之后调用的函数
        success:function(data){
        	console.log("success")
            layer.closeAll('loading');
            if(data.info=='注册成功'){
            	layer.confirm((data.info+',请登录！'), {
            		cancel: function(index){
            			layer.closeAll('loading');
            			window.location.href= basePath+"index.html";
            			return false; 
        			},
            	    btn: ['确定'] //按钮
            	}, function(index){
            		layer.closeAll('loading');
            		layer.close(index);
            		window.location.href= basePath+"index.html";
                });
            }else{
            	layer.closeAll('loading');
                Pop_up_box(data.info,2);
            }
        },
        //调用出错执行的函数
        error: function(){
        	console.log("error")
        	layer.closeAll('loading');
            //请求出错处理
        }
    });
}
