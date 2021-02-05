//车辆识别代码验证
    $("#clsbdh_q").focus(function(){
        hint_info("clsbdh_q","车辆识别代码格式:有数字和大写字母组成.例如:LGAX5DF49E3004357","3");
    });
    $("#clsbdh_q").blur(function(){
        if($("#clsbdh_q").val()==""){
            hint_info("clsbdh_q","车辆识别代码不能为空!","3");
        }else if(!regClsbh.test($("#clsbdh_q").val())) {
            hint_info("clsbdh_q","车辆识别代码格式不正确!","3");
        }
    });
    //核定载客为
//     $("#hdzkw").focus(function(){
//         hint_info("hdzkw","请输入核定载客位。例如：“5”","3");
//     });
//     $("#hdzkw").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#hdzkw").val()==""){
//             hint_info("hdzkw","核定载客位不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regHdzkw.test($("#hdzkw").val())){
//             hint_info("hdzkw","核定载客位格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //注册日期验证
//     $("#jdczcrq").focus(function(){
//         hint_info("jdczcrq","机动车注册日期格式:必须选择当天日期之前或者当天日期,例如:2015-12-12","2");
//     });
//     $("#jdczcrq").blur(function(){
//         var div = $(this).parent();
//         if($("#jdczcrq").val()==""){
//             hint_info("jdczcrq","机动车注册日期不能为空!","2");
//             div.addClass('has-error');
//         }else if(!regDate.test($("#jdczcrq").val())) {
//             hint_info("jdczcrq","机动车注册日期格式不正确!","2");
//             div.addClass('has-error');
//         }
//     });
    //车牌号码验证
//     $("#sqclhp").focus(function(){
//         hint_info("sqclhp","车牌号:浙C+数字或大写英文字母组成的五个字符,例如:浙C12345","3");
//     });
//     $("#sqclhp").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#sqclhp").val()==""){
//             hint_info("sqclhp","车牌号码不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regLicenseplate1.test($("#sqclhp").val())){
//             hint_info("sqclhp","车牌号码格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车辆类型
//     $("#xllx").focus(function(){
//         hint_info("xllx","请输入车辆类型。例如“小型客车”","3");
//     });
//     $("#xllx").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#xllx").val()==""){
//             hint_info("xllx","车辆类型不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regLicenseplate1.test($("#xllx").val())){
//             hint_info("xllx","车辆类型格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //发动机号
//     $("#fdjh").focus(function(){
//         hint_info("fdjh","请输入发动机号。例如“f30f000729”","3");
//     });
//     $("#fdjh").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#fdjh").val()==""){
//             hint_info("fdjh","发动机号不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regFdjh.test($("#fdjh").val())){
//             hint_info("fdjh","发动机号格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车辆厂牌
//     $("#ppxh").focus(function(){
//         hint_info("ppxh","请输入车辆厂牌。列入“红旗”","3");
//     });
//     $("#ppxh").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#ppxh").val()==""){
//             hint_info("ppxh","车辆厂牌不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regPpxh.test($("#ppxh").val())){
//             hint_info("ppxh","车辆厂牌格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车辆型号
//     $("#clxh").focus(function(){
//         hint_info("clxh","请输入车辆型号。例如“CAF7202AC3”","3");
//     });
//     $("#clxh").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#clxh").val()==""){
//             hint_info("clxh","车辆型号不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regClsbh.test($("#clxh").val())){
//             hint_info("clxh","车辆型号格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车辆颜色
//     $("#cpys").focus(function(){
//         hint_info("cpys","请输入车辆颜色。“红色”","3");
//     });
//     $("#cpys").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#cpys").val()==""){
//             hint_info("cpys","车辆颜色不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regFwjgmc.test($("#cpys").val())){
//             hint_info("cpys","车辆颜色格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车长
//     $("#chec").focus(function(){
//         hint_info("chec","请输入车长。例如“3000”","3");
//     });
//     $("#chec").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#chec").val()==""){
//             hint_info("chec","车长不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regCkg.test($("#chec").val())){
//             hint_info("chec","车长格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车宽
//     $("#chek").focus(function(){
//         hint_info("chek","请输入车宽。例如“2500”","3");
//     });
//     $("#chek").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#chek").val()==""){
//             hint_info("chek","车宽不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regCkg.test($("#chek").val())){
//             hint_info("chek","车宽格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //车高
//     $("#cheg").focus(function(){
//         hint_info("cheg","请输入车高。例如“1500”","3");
//     });
//     $("#cheg").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#cheg").val()==""){
//             hint_info("cheg","车高不能为空!","3");
//             div.addClass('has-error');
//         }else if(!regCkg.test($("#cheg").val())){
//             hint_info("cheg","车高格式不正确!","3");
//             div.addClass('has-error');
//         }else{
//             div.addClass('has-success');
//         }
//     });
    //总质量
//     $("#zzl").focus(function(){
//         hint_info("zzl","请输入总质量（总量）。例如“3”","3");
//     });
//     $("#zzl").blur(function(){
//         removeInputBorderStyle($(this));
//         var div = $(this).parent();
//         if($("#zzl").val()==""){
//             hint_info("zzl","总质量（总量）不能为空!","3");
//             div.addClass('has-error');
//        }else if(!regCkg.test($("#zzl").val())){
//            hint_info("zzl","总质量（总量）格式不正确!","3");
//         }else{
//             div.addClass('has-success');
//         }
//     });
//     function jdcdjzsHtml() {
// 		return '<div class="panel-body" class="djzs"><label for="fileupload_jdcdjzs">机动车登记证书第1、2页：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs" name="JDCDJZ" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs\').click();">上传</button></div>' +
//             '<div class="panel-body" class="djzs"><label for="fileupload_jdcdjzs2">机动车登记证书第3、4页(若有)：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs2" name="JDCDJZ1" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs2\').click();">上传</button></div>' +
//             '<div class="panel-body" class="djzs"><label for="fileupload_jdcdjzs3">机动车登记证书第5、6页(若有)：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs3" name="JDCDJZ2" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs3\').click();">上传</button></div>';
//     }
//     function jdccchgzsHtml() {
// 		return '<div class="panel-body" class="hgzs"><label for="fileupload_jdcdjzs">机动车出厂合格证书(正面)：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs" name="JDCDJZ" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs\').click();">上传</button></div>' +
//             '<div class="panel-body" class="hgzs"><label for="fileupload_jdcdjzs2">机动车出厂合格证书(反面)：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs2" name="JDCDJZ1" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs2\').click();">上传</button></div>' +
//             '<div class="panel-body" class="hgzs"><label>示例：</label><img width="330" height="260" style="margin-left: -40px;" src="../../../resources/images/jdccchgzs.png" alt=""><br></div>';
//     }
//     function clyzxzsHtml() {
// 		return '<div class="panel-body" class="yzzs"><label for="fileupload_jdcdjzs">车辆一致性证书(第一部分)：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs" name="JDCDJZ" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs\').click();">上传</button></div>' +
//             '<div class="panel-body" class="yzzs"><label for="fileupload_jdcdjzs2">车辆一致性证书(第二部分)：</label><img width="200" height="270" src="" alt=""><input type="file" id="fileupload_jdcdjzs2" name="JDCDJZ1" accept="image/jpeg,image/png,image/jpg" style="display: none;"><button type="button" class="btn btn-info btnFile" onclick="$(\'#fileupload_jdcdjzs2\').click();">上传</button></div>' +
//             '<div class="panel-body" class="yzzs"><label>示例：</label><img width="330" height="260" style="margin-left: -40px;" src="../../../resources/images/clyzxzs.jpg" alt=""><br></div>';
//     }
//     $('#clzjlxBox').html(jdcdjzsHtml());
//     $('input.clzj_img').on('change', function () {
// 		if ('机动车登记证书' === $(this).val()) {
// 		    $('#clzjlxBox').html(jdcdjzsHtml());
// 		    bindImageChange();
// 		} else if ('机动车出厂合格证书' === $(this).val()) {
//             $('#clzjlxBox').html(jdccchgzsHtml());
//             bindImageChange();
// 		} else if ('车辆一致性证书' === $(this).val()) {
//             $('#clzjlxBox').html(clyzxzsHtml());
//             bindImageChange();
// 		}
//     }); 
//保险公司
    $("#dszzrxbxqx").focus(function(){
        hint_info("dszzrxbxqx","保险公司名称:1-20个任意字符,例如:XX保险","3");
    });
    $("#dszzrxbxqx").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#dszzrxbxqx").val()==""){
            hint_info("dszzrxbxqx","保险公司不能为空不能为空!","3");
            div.addClass('has-error');
        }else if(!regName.test($("#dszzrxbxqx").val())) {
            hint_info("dszzrxbxqx","保险公司格式不正确!","3");
            div.addClass('has-error');
        }else {
            div.addClass('has-success');
        }
    });
    //保险投保日期
    $("#bxqx").focus(function(){
        hint_info("bxqx","保险投保日期:请选择当天或者当天以后的日期,例如:2018-02-02","3");
    });
    $("#bxqx").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#bxqx").val()==""){
            hint_info("bxqx","保险投保日期不能为空!","3");
            div.addClass('has-error');
        }else if(!regDate.test($("#bxqx").val())) {
            hint_info("bxqx","保险投保日期格式不正确!","3");
            div.addClass('has-error');
        }
    });
    //人身伤亡每座保额
    $("#dszzrxbxed").focus(function(){
        hint_info("dszzrxbxed","人身伤亡每座保险:一千万一下的数字,例如:5000000","3");
    });
    $("#dszzrxbxed").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#dszzrxbxed").val()==""){
            hint_info("dszzrxbxed","人身伤亡每座保险不能为空!","3");
            div.addClass('has-error');
        }else if(!regBxed.test($("#dszzrxbxed").val())) {
            hint_info("dszzrxbxed","人身伤亡每座保险格式不正确!","3");
            div.addClass('has-error');
        }else {
            div.addClass('has-success');
        }
    });
    //保险有效期起
    $("#bxed").focus(function(){
        hint_info("bxed","保险有效期起:请选择当天或者当天以前的日期,例如:2014-02-02","2");
    });
    $("#bxed").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#bxed").val()==""){
            hint_info("bxed","保险有效日期不能为空!","2");
            div.addClass('has-error');
        }else if(!regDate.test($("#bxed").val())) {
            hint_info("bxed","保险有效日期格式不正确!","2");
            div.addClass('has-error');
        }
    });
    //投保日期
    $("#tbrq").focus(function(){
        hint_info("tbrq","请选择投保日期","2");
    });
    $("#tbrq").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#tbrq").val()==""){
            hint_info("tbrq","投保日期不能为空!","2");
            div.addClass('has-error');
        }else if(!regDate.test($("#tbrq").val())) {
            hint_info("tbrq","投保日期格式不正确!","2");
            div.addClass('has-error');
        }
    });
    //保险有效期止
    $("#bxez").focus(function(){
        hint_info("bxez","保险有效期止:请选择当天或者当天以后的日期,例如:2000-02-02","2");
    });
    $("#bxez").blur(function(){
        removeInputBorderStyle($(this));
        var div = $(this).parent();
        if($("#bxez").val()==""){
            hint_info("bxez","保险有效日期止不能为空!","2");
            div.addClass('has-error');
        }else if(!regDate.test($("#bxez").val())) {
            hint_info("bxez","保险有效日期止格式不正确!","2");
            div.addClass('has-error');
        }
    });