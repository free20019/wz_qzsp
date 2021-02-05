/*
 * @Descripttion:
 * @version:
 * @Author: CFQ
 * @Date: 2020-05-26 16:29:31
 * @LastEditors: CFQ
 * @LastEditTime: 2020-05-28 19:11:46
 */

$('#go_next').on('click', function () {
  aaa = 1
  if ($('#pt_grjsyzdb_cphm').val() == '') {
    Pop_up_box('车牌号码不能为空!', '2')
    return
  } else if (!regLicenseplate2.test($('#pt_grjsyzdb_cphm').val())) {
    Pop_up_box('车牌号码格式不正确!', '2')
    return
  }

  if ($('#wz_companyname').val() == '') {
    Pop_up_box('公司名称不能为空!', '2')
    return
  }

  //出租车道路运输证
  if ($('#fileupload_czcdlyszzb').val() == '') {
    Pop_up_box('出租车道路运输证必须上传!', '2')
    return false
  } else {
    var jdcdjz = $('#fileupload_czcdlyszzb').val()
    var a = jdcdjz.substr(jdcdjz.indexOf('.') + 1)
    if (
      a != 'jpg' &&
      a != 'jpeg' &&
      a != 'JPG' &&
      a != 'JPEG' &&
      a != 'png' &&
      a != 'PNG'
    ) {
      Pop_up_box('出租车道路运输证只能上传.jpg或者.JPEG、png格式的图片!', '2')
      return false
    }
  }
  if ($('#fileupload_czcdlyszfb').val() == '') {
    Pop_up_box('出租车道路运输证必须上传!', '2')
    return false
  } else {
    var jdcdjz = $('#fileupload_czcdlyszfb').val()
    var a = jdcdjz.substr(jdcdjz.indexOf('.') + 1)
    if (
      a != 'jpg' &&
      a != 'jpeg' &&
      a != 'JPG' &&
      a != 'JPEG' &&
      a != 'png' &&
      a != 'PNG'
    ) {
      Pop_up_box('出租车道路运输证只能上传.jpg或者.JPEG、png格式的图片!', '2')
      return false
    }
  }

  aaa = 1
  console.info('sqrxm', $('#fileupload_qyyyzz').attr('data-address'))
  $.ajax({
    type: 'get',
    url: basePath + 'subsidy/addCompanySubsidy',
    data: {
      sqrlx: 2,
      cphm: $('#pt_grjsyzdb_cphm').val(),
      sqrxm: $('#wz_companyname').val(),
      qyyyzz: $('#fileupload_qyyyzz').attr('data-address'),
      yszzb: $('#fileupload_czcdlyszzb').attr('data-address'),
      yszfb: $('#fileupload_czcdlyszfb').attr('data-address'),
    },
    dataType: 'json',
    success: function (data) {
      var data1 = data
      if (data1.info == '提交成功') {
        window.location.href = 'qyzxbzsq.html'
        layer.closeAll('loading')
      } else {
        layer.closeAll('loading')
        Pop_up_box(data1.info, '2')
      }
    },
    error: function () {
      layer.closeAll('loading')
    },
  })

  //    layer.load(1);
})
