<%@ page language="java" import="java.util.*" contentType="text/html;charset=utf-8"%>  
<html>
<head>
    <title>温州市出租汽车申报服务管理系统</title>
	<link rel="icon" href="wz_qzsp/../../resources/images/I16.ico" type="image/x-icon" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" href="wz_qzsp/../../libs/bs/css/bootstrap.min.css">
    <link rel="stylesheet" href="wz_qzsp/../../libs/bs/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="wz_qzsp/../../app/main.css">
    <script type="text/javascript" src="wz_qzsp/../../resources/js/jquery-1.12.1.min.js"></script>
    <script type="text/javascript" src="wz_qzsp/../../app/config.js"></script>
</head>
<body>
<input type="hidden" id="username" value="${username}"/>
<input type="hidden" id="sex" value="${sex}"/>
<input type="hidden" id="sjhm" value="${sjhm}"/>
<input type="hidden" id="zjhm" value="${zjhm}"/>
<!-- <input type="hidden" id="org" value="${orgNumber}"/> -->
<script type="text/javascript">
    var type = ${type}
    console.log(type)
    	var sex = $('#sex').val();
    	var username = $('#username').val();
    	var sjhm = $('#sjhm').val();
    	var zjhm = $('#zjhm').val();
    	window.location.assign(encodeURI(basePath+"app/html/zcxx/zctx2.html?sex="+sex+"&username="+username+"&sjhm="+sjhm+"&zjhm="+zjhm));
// 		window.location.href= basePath+"/app/html/xxtx/jyzzc.html?compname="+comp+"&dmz="+zzjgdmz;
</script>
</body>
</html>