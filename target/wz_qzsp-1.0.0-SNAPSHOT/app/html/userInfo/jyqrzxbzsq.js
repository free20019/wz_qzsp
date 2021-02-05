$('#go_next').on('click', function () {
  aaa = 1
  if ($('#pt_grjsyzdb_cphm').val() == '') {
    Pop_up_box('车牌号码不能为空!', '2')
    return
  } else if (!regLicenseplate2.test($('#pt_grjsyzdb_cphm').val())) {
    Pop_up_box('车牌号码格式不正确!', '2')
    return
  }

  if ($('#wz_cljyqsyrxm').val() == '') {
    Pop_up_box('车辆所有人名称不能为空!', '2')
    return
  }

  if ($('input[name="sqrlx"]:checked').val() == '0') {
    //正面
    if ($('#fileupload_jdcsfzm').val() == '') {
      Pop_up_box('机动车所有人身份证明(正面)必须上传!', '2')
      return false
    } else {
      var jdcsfzmz = $('#fileupload_jdcsfzm').val()
      var a = jdcsfzmz.substr(jdcsfzmz.indexOf('.') + 1)
      if (
        a != 'jpg' &&
        a != 'jpeg' &&
        a != 'JPG' &&
        a != 'JPEG' &&
        a != 'png' &&
        a != 'PNG'
      ) {
        Pop_up_box(
          '机动车身份证明(正面)只能上传.jpg或者.JPEG、png格式的图片！',
          '2'
        )
        return false
      }
    }
    //机动车所有人身份证明文件(反面)
    if ($('#fileupload_jdcsfzmfm').val() == '') {
      Pop_up_box('机动车所有人身份证明(反面)必须上传!', '2')
      return false
    } else {
      var jdcsfzmf = $('#fileupload_jdcsfzmfm').val()
      var a = jdcsfzmf.substr(jdcsfzmf.indexOf('.') + 1)
      if (
        a != 'jpg' &&
        a != 'jpeg' &&
        a != 'JPG' &&
        a != 'JPEG' &&
        a != 'png' &&
        a != 'PNG'
      ) {
        Pop_up_box(
          '机动车身份证明(反面)只能上传.jpg或者.JPEG、png格式的图片！',
          '2'
        )
        return false
      }
    }
  } else {
    // 企业营业执照
    if ($('#fileupload_qyyyzz').val() == '') {
      Pop_up_box('企业营业执照必须上传!', '2')
      return false
    } else {
      var jdcsfzmf = $('#fileupload_qyyyzz').val()
      var a = jdcsfzmf.substr(jdcsfzmf.indexOf('.') + 1)
      if (
        a != 'jpg' &&
        a != 'jpeg' &&
        a != 'JPG' &&
        a != 'JPEG' &&
        a != 'png' &&
        a != 'PNG'
      ) {
        Pop_up_box('企业营业执照只能上传.jpg或者.JPEG、png格式的图片！', '2')
        return false
      }
    }
  }

  //情况说明
  if ($('#fileupload_qksm').val() == '') {
    Pop_up_box('情况说明必须上传!', '2')
    return false
  } else {
    var jdcsfzmf = $('#fileupload_qksm').val()
    var a = jdcsfzmf.substr(jdcsfzmf.indexOf('.') + 1)
    if (
      a != 'jpg' &&
      a != 'jpeg' &&
      a != 'JPG' &&
      a != 'JPEG' &&
      a != 'png' &&
      a != 'PNG'
    ) {
      Pop_up_box('情况说明只能上传.jpg或者.JPEG、png格式的图片！', '2')
      return false
    }
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

  if (
    !$('#fileupload_jsycyzgz1').val() ||
    !$('#fileupload_pyht1').val() ||
    !$('#fileupload_pyht12').val()
  ) {
    Pop_up_box('最少上传一组驾驶员从业资格证与聘用合同!', '2')
    return false
  }
  if ($('#fileupload_jsycyzgz2').val()) {
    if (!$('#fileupload_pyht2').val() || !$('#fileupload_pyht22').val()) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht2').val()) {
    if (!$('#fileupload_jsycyzgz2').val() || !$('#fileupload_pyht22').val()) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht22').val()) {
    if (!$('#fileupload_jsycyzgz2').val() || !$('#fileupload_pyht2').val()) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht23').val()) {
    if (
      !$('#fileupload_jsycyzgz2').val() ||
      !$('#fileupload_pyht2').val() ||
      !$('#fileupload_pyht22').val()
    ) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht24').val()) {
    if (
      !$('#fileupload_jsycyzgz2').val() ||
      !$('#fileupload_pyht2').val() ||
      !$('#fileupload_pyht22').val()
    ) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }

  if ($('#fileupload_jsycyzgz3').val()) {
    if (!$('#fileupload_pyht3').val() || !$('#fileupload_pyht32').val()) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht3').val()) {
    if (!$('#fileupload_jsycyzgz3').val() || !$('#fileupload_pyht32').val()) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht32').val()) {
    if (!$('#fileupload_jsycyzgz3').val() || !$('#fileupload_pyht3').val()) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht33').val()) {
    if (
      !$('#fileupload_jsycyzgz3').val() ||
      !$('#fileupload_pyht3').val() ||
      !$('#fileupload_pyht32').val()
    ) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }
  if ($('#fileupload_pyht34').val()) {
    if (
      !$('#fileupload_jsycyzgz3').val() ||
      !$('#fileupload_pyht3').val() ||
      !$('#fileupload_pyht32').val()
    ) {
      Pop_up_box('驾驶员从业资格证对应两张聘用合同!', '2')
      return false
    }
  }

  aaa = 1
  if ($('input[name="sqrlx"]:checked').val() == '0') {
    $.ajax({
      type: 'get',
      url: basePath + 'subsidy/addBusinessOwnerSubsidy',
      data: {
        sqrlx: $('input[name="sqrlx"]:checked').val(),
        cphm: $('#pt_grjsyzdb_cphm').val(),
        sqrxm: $('#wz_cljyqsyrxm').val(),
        sfzh: $('#pt_grjsyzdb_sfzh').val(),
        sjhm: $('#pt_grjsyzdb_lxdh').val(),
        jyqrsfzzm: $('#fileupload_jdcsfzm').attr('data-address'),
        jyqrsfzfm: $('#fileupload_jdcsfzmfm').attr('data-address'),
        qksm: $('#fileupload_qksm').attr('data-address'),
        yszzb: $('#fileupload_czcdlyszzb').attr('data-address'),
        yszfb: $('#fileupload_czcdlyszfb').attr('data-address'),
        cyzgz1: $('#fileupload_jsycyzgz1').attr('data-address'),
        pyht1: $('#fileupload_pyht1').attr('data-address'),
        pyht12: $('#fileupload_pyht12').attr('data-address'),
        pyht13:
          ($('#fileupload_pyht13').attr('data-address') &&
            $('#fileupload_pyht13').attr('data-address')) ||
          '',
        pyht14:
          ($('#fileupload_pyht14').attr('data-address') &&
            $('#fileupload_pyht14').attr('data-address')) ||
          '',
        cyzgz2:
          ($('#fileupload_jsycyzgz2').attr('data-address') &&
            $('#fileupload_jsycyzgz2').attr('data-address')) ||
          '',
        pyht2:
          ($('#fileupload_pyht2').attr('data-address') &&
            $('#fileupload_pyht2').attr('data-address')) ||
          '',
        pyht22:
          ($('#fileupload_pyht22').attr('data-address') &&
            $('#fileupload_pyht22').attr('data-address')) ||
          '',
        pyht23:
          ($('#fileupload_pyht23').attr('data-address') &&
            $('#fileupload_pyht23').attr('data-address')) ||
          '',
        pyht24:
          ($('#fileupload_pyht24').attr('data-address') &&
            $('#fileupload_pyht24').attr('data-address')) ||
          '',
        cyzgz3:
          ($('#fileupload_jsycyzgz3').attr('data-address') &&
            $('#fileupload_jsycyzgz3').attr('data-address')) ||
          '',
        pyht3:
          ($('#fileupload_pyht3').attr('data-address') &&
            $('#fileupload_pyht3').attr('data-address')) ||
          '',
        pyht32:
          ($('#fileupload_pyht32').attr('data-address') &&
            $('#fileupload_pyht32').attr('data-address')) ||
          '',
        pyht33:
          ($('#fileupload_pyht33').attr('data-address') &&
            $('#fileupload_pyht33').attr('data-address')) ||
          '',
        pyht34:
          ($('#fileupload_pyht34').attr('data-address') &&
            $('#fileupload_pyht34').attr('data-address')) ||
          '',
      },
      dataType: 'json',
      success: function (data) {
        var data1 = data
        if (data1.info == '提交成功') {
          window.location.href = 'jyqrzxbzsq.html'
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
  } else {
    $.ajax({
      type: 'get',
      url: basePath + 'subsidy/addBusinessOwnerSubsidy',
      data: {
        sqrlx: $('input[name="sqrlx"]:checked').val(),
        cphm: $('#pt_grjsyzdb_cphm').val(),
        sqrxm: $('#wz_cljyqsyrxm').val(),
        sjhm: $('#pt_grjsyzdb_lxdh').val(),
        qyyyzz: $('#fileupload_qyyyzz').attr('data-address'),
        qksm: $('#fileupload_qksm').attr('data-address'),
        yszzb: $('#fileupload_czcdlyszzb').attr('data-address'),
        yszfb: $('#fileupload_czcdlyszfb').attr('data-address'),
        cyzgz1: $('#fileupload_jsycyzgz1').attr('data-address'),
        pyht1: $('#fileupload_pyht1').attr('data-address'),
        pyht12: $('#fileupload_pyht12').attr('data-address'),
        pyht13:
          ($('#fileupload_pyht13').attr('data-address') &&
            $('#fileupload_pyht13').attr('data-address')) ||
          '',
        pyht14:
          ($('#fileupload_pyht14').attr('data-address') &&
            $('#fileupload_pyht14').attr('data-address')) ||
          '',
        cyzgz2:
          ($('#fileupload_jsycyzgz2').attr('data-address') &&
            $('#fileupload_jsycyzgz2').attr('data-address')) ||
          '',
        pyht2:
          ($('#fileupload_pyht2').attr('data-address') &&
            $('#fileupload_pyht2').attr('data-address')) ||
          '',
        pyht22:
          ($('#fileupload_pyht22').attr('data-address') &&
            $('#fileupload_pyht22').attr('data-address')) ||
          '',
        pyht23:
          ($('#fileupload_pyht23').attr('data-address') &&
            $('#fileupload_pyht23').attr('data-address')) ||
          '',
        pyht24:
          ($('#fileupload_pyht24').attr('data-address') &&
            $('#fileupload_pyht24').attr('data-address')) ||
          '',
        cyzgz3:
          ($('#fileupload_jsycyzgz3').attr('data-address') &&
            $('#fileupload_jsycyzgz3').attr('data-address')) ||
          '',
        pyht3:
          ($('#fileupload_pyht3').attr('data-address') &&
            $('#fileupload_pyht3').attr('data-address')) ||
          '',
        pyht32:
          ($('#fileupload_pyht32').attr('data-address') &&
            $('#fileupload_pyht32').attr('data-address')) ||
          '',
        pyht33:
          ($('#fileupload_pyht33').attr('data-address') &&
            $('#fileupload_pyht33').attr('data-address')) ||
          '',
        pyht34:
          ($('#fileupload_pyht34').attr('data-address') &&
            $('#fileupload_pyht34').attr('data-address')) ||
          '',
      },
      dataType: 'json',
      success: function (data) {
        var data1 = data
        if (data1.info == '提交成功') {
          window.location.href = 'jyqrzxbzsq.html'
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
  }

  //    layer.load(1);
})
