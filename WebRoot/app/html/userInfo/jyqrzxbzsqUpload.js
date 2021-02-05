function fileChange(e) {
  layer.load()
  console.info(e.files[0])
  console.info()
  let data = new FormData()
  data.append('file', e.files[0])
  $.ajax({
    type: 'post',
    url: basePath + 'subsidy/upload',
    processData: false, // jQuery不要去处理发送的数据
    contentType: false, // jQuery不要去设置Content-Type请求头
    data: data,
    dataType: 'json',
    success: function (res) {
      setTimeout(() => {
        layer.closeAll('loading')
      }, 800)
      if (res.msg == 0) {
        let dom = $('#' + $(e).attr('id'))
        dom.attr('data-address', res.file_address)
      }
    },
    error: function () {},
  })
}