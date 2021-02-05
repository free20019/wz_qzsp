<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

  <body>
  <h3>司机信息</h3>
  <label style="display: block;">姓名: ${XM }</label>
  <label style="display: block;">性别: ${XB }</label>
  <label style="display: block;">国籍: ${GJ }</label>
  <label style="display: block;">出生日期: ${CSRQ }</label>
  <label style="display: block;">驾驶证号: ${JSZH }</label>
  <label style="display: block;">准驾车型: ${ZJCX }</label>
  <label style="display: block;">住址: ${DZ }</label>
  <label style="display: block;">初次领取驾驶证日期 : ${CLJSZRQ }</label>
  </body>
</html>
