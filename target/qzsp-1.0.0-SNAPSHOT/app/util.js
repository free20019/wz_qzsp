window.setInterval("xt_1()",5000);
/**
* 心跳  每隔5秒钟执行
*/
function xt_1(){
	$.ajax({
        type:"post",
        url: basePath + "user/xt1",
        data:{},
        dataType: "json",
        success:function(data){
        },
        error: function(){
        }         
     });
}



//window.setInterval("xt_2()",5000);
/**
* 心跳  每隔5秒钟执行
*/
function xt_2(){
	$.ajax({
        type:"post",
        url: basePath + "user/xt2",
        data:{},
        dataType: "json",
        success:function(data){
        	if(data.code=='510'){
        		 layer.confirm(('您长时间未操作或账号在别的地方登陆，请重新登录！'), {
                     cancel: function(index){
                         window.location.href= basePath+"index.html";
                         return false;
                     },
                     btn: ['确定'] //按钮
                 }, function(index){
                     layer.close(index);
                     window.location.href= basePath+"index.html";
                 });
        	}
        },
        error: function(){
        }         
     });
}