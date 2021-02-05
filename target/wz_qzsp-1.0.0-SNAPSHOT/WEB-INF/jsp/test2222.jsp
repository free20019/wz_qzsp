<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
	<title>申请信息</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<link rel="stylesheet" href="../../../libs/bs/css/bootstrap.min.css">
	<link rel="stylesheet" href="../../../libs/bs/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="../../main.css">
	<script type="text/javascript" src="../../../resources/js/jquery-1.12.1.min.js"></script>
    <script type="text/javascript" src="../../../resources/js/jquery.cookie.js"></script>
	<script type="text/javascript" src="../../../libs/bs/js/bootstrap.min.js"></script>
	 <script type="text/javascript" src="../../../libs/layer/layer.js"></script>
	<script type="text/javascript" src="../../../libs/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="../../config.js"></script>
	<script type="text/javascript" src="../../main.js"></script>
	<link rel="stylesheet" href="clxxtx.css">
<body>
<div class="topWrapper">
	<div class="topHeader">
		<div class="topLogin"></div>
		<div class="topTitle">温州市出租汽车申报服务管理系统</div>
		<input type="hidden" id="cl_vhic"/>
	</div>
</div>
<div class="infoBox">
	<div class="infoPage notMT">
		<div class="top_banner">
			<ul>
				<li>
					<i class="icon_sqsm"></i>
					<span>申请说明</span>
					<i class="icon_jt"></i>
				</li>
				<li>
					<i class="icon_sqtx"></i>
					<span>申请填写</span>
					<i class="icon_jt"></i>
				</li>
				<!--<li>
					<i class="icon_qrsq"></i>
					<span>确认申请</span>
					<i class="icon_jt"></i>
				</li>
				<li>
					<i class="icon_dxqr"></i>
					<span>短信确认</span>
					<i class="icon_jt"></i>
				</li>-->
				<li>
					<i class="icon_wcsp"></i>
					<span>完成申请</span>
					<i class="icon_jt"></i>
				</li>
				<li>
					<i class="icon_bgxz"></i>
					<span>变更性质</span>
					<i class="icon_jt"></i>
				</li>
				<li>
					<i class="icon_xkfz"></i>
					<span>许可发证</span>
				</li>
			</ul>
		</div>
		<div class="pageCenter">
			<h3 class="titleH3">申请信息
				<p class="rightNav">
					<a href="javascript:void(0);">申请流程</a>
					<a href="javascript:void(0);">办事指南</a>
					<a href="javascript:void(0);">返回首页</a>
				</p>
			</h3>
			<div class="panel panel-default">
				<div class="panel-body form-inline">
					<h3 style="text-align: center;">个人办理车辆运输证申请表</h3>
					<div class="control-group" style="text-align: center;">
						<label class="form-control fontLength30" style="text-align: left;">申请编号：<span class="sqbh"></span></label>
						<label class="form-control fontLength30" style="text-align: left;">申请状态：<span class="sqzt"></span></label>
					</div>
					<div style="margin: 20px 60px;">
						<div class="panel panel-default">
							<div class="panel-body control-group">
								<div class="control-group">
									<label for="sqrxm">申请人姓名：</label>
									<span id="sqrxm" class="form-control fontLength15 xm" readonly="true">${data }</span>
									<label for="sex">性别：</label>
									<span id="sex" class="form-control fontLength15 sex" readonly="true">${data }</span>
								</div>
							</div>
						</div>
						<div class="panel panel-default" style="padding-left: 20px;">
							<h4>申请类型：网络预约出租汽车运输证</h4>
							<div class="panel-body" style="padding-left: 140px;">
								<div class="control-group">
									<label for="zjlx">证件类型：</label>
									<span id="zjlx" class="form-control fontLength30" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="zjhm">证件号码：</label>
									<span id="zjhm" class="form-control fontLength30" readonly="true"></span>
								</div>
								<br>
								<div class="control-group">
									<label for="cphm">车牌号码：</label>
									<span id="cphm" class="form-control fontLength30" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="clsyxz">当前车辆使用性质：</label>
									<span id="clsyxz" class="form-control fontLength30" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="hdzkw">车辆识别码：</label>
									<span id="vin" class="form-control fontLength30" readonly="true"></span>
								</div>
								<!-- 					<br> -->
								<!-- 					<div class="control-group"> -->
								<!-- 						<label for="clrllx">车辆燃料类型：</label> -->
								<!-- 						<span id="clrllx" class="form-control fontLength30" readonly="true">燃油</span> -->
								<!-- 					</div> -->
								<!-- 					<div class="control-group"> -->
								<!-- 						<label for="cljg">车辆价格：</label> -->
								<!-- 						<span id="cljg" class="form-control fontLength30" readonly="true">20万</span> -->
								<!-- 					</div> -->
								<!-- 					<div class="control-group"> -->
								<!-- 						<label for="cz">轴距：</label> -->
								<!-- 						<span id="cz" class="form-control fontLength30" readonly="true">4</span> -->
								<!-- 					</div> -->
								<!-- 					<div class="control-group"> -->
								<!-- 						<label for="xhlc">续航里程：</label> -->
								<!-- 						<span id="xhlc" class="form-control fontLength30" readonly="true">500km</span> -->
								<!-- 					</div> -->
								<!-- 					<br> -->
								<!-- 					<div class="control-group"> -->
								<!-- 						<label for="clccdjrq">车辆初次登记日期：</label> -->
								<!-- 						<span id="clccdjrq" class="form-control fontLength30" readonly="true">2010年10月20日</span> -->
								<!-- 					</div> -->
								<div class="control-group">
									<label for="clxszlc">车辆行驶总里程：</label>
									<span id="clxszlc" class="form-control fontLength30" readonly="true"></span>
								</div>
								<!-- 					<div class="control-group"> -->
								<!-- 						<label for="gbdj">环保等级：</label> -->
								<!-- 						<span id="gbdj" class="form-control fontLength30" readonly="true">国III</span> -->
								<!-- 					</div> -->
								<div class="control-group">
									<label for="sfazwxdwzz" style="width: auto;">是否安装具有行驶记录功能的车辆卫星定位装置：</label>
									<span id="sfazwxdwzz" class="form-control fontLength15" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="sfazyjbjzz">是否安装应急报警装置：</label>
									<span id="sfazyjbjzz" class="form-control fontLength15" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="ywptxyczqcbz" style="width: auto;">有无喷涂巡游出租汽车标志标识：</label>
									<span id="ywptxyczqcbz" class="form-control fontLength15" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="ywazddzz">有无安装顶灯装置：</label>
									<span id="ywazddzz" class="form-control fontLength15" readonly="true"></span>
								</div>
								<br>
								<div class="control-group">
									<label for="jdcsyrsfzm">机动车所有人身份证明：</label>
									<span id="jdcsyrsfzm" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="jdcdjz">机动车登记证：</label>
									<span id="jdcdjz" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="jdcxsz">机动车行驶证：</label>
									<span id="jdcxsz" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="jdcgzfp">机动车购置发票：</label>
									<span id="jdcgzfp" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="clgzsjspz">车辆购置税缴税凭证：</label>
									<span id="clgzsjspz" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="clbxzm">车辆保险证明：</label>
									<span id="clbxzm" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="jdczhxnjcbg" style="width: auto;">机动车综合性能监测报告：</label>
									<span id="jdczhxnjcbg" class="form-control" readonly="true">已提交</span>
								</div>
								<div class="control-group">
									<label for="jchgzm">检测合格证明：</label>
									<span id="jchgzm" class="form-control" readonly="true">已提交</span>
								</div>
								<br>
								<div class="control-group">
									<label for="dzyx">电子邮箱：</label>
									<span id="dzyx" class="form-control fontLength30" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="yb">邮编：</label>
									<span id="yb" class="form-control fontLength30" readonly="true"></span>
								</div>
								<div class="control-group">
									<label for="zhjzlxdz">在杭居住联系地址：</label>
									<span id="zhjzlxdz" class="form-control fontLength30" readonly="true"></span>
								</div>
							</div>
						</div>
						<!-- 					<div class="control-group"> -->
						<!-- 						<div class="controls fontCenter mt2em"> -->
						<!-- 							<button type="submit" class="btn btn-info">下一步</button> -->
						<!-- 							<button type="button" class="btn btn-danger" id="go_back">返 回</button> -->
						<!-- 						</div> -->
						<!-- 					</div> -->
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="bottomFooler"></div>
<script class="resize" type="text/javascript">
    $(window).resize(setInfoPageHeight);
    $('.infoPage').bind('DOMNodeInserted', setInfoPageHeight);
    setInfoPageHeight()
</script>
<script type="text/javascript">
 var href=  ${data}
</script>
</body>
</html>