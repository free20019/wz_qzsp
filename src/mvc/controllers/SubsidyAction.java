package mvc.controllers;

import mvc.dao.DownloadAct;
import mvc.service.SubsidyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author: xianlehuang
 * @Description:补助申请
 * @date: 2020/5/25 - 15:48
 */

@Controller
@RequestMapping(value="/subsidy")
public class SubsidyAction {

    @Autowired
    SubsidyService subsidyService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //经营权人专项补助申请查询
    @RequestMapping(value = "/findBusinessOwnerSubsidy")
    @ResponseBody
    public String findBusinessOwnerSubsidy(HttpServletRequest request) {
        String msg = "";
        msg = subsidyService.findBusinessOwnerSubsidy(request);
        return msg;
    }

    //经营权人专项补助申请导出
    @RequestMapping(value = "/findBusinessOwnerSubsidyExcel")
    @ResponseBody
    public String findBusinessOwnerSubsidyExcel(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String a[] = {"序号","车牌号","经营权所有人","联系电话"};//导出列明
        String b[] = {"RN","CPHM","SQRXM","SJHM"};//导出map中的key
        String gzb = "经营权人专项补助申请";//导出sheet名和导出的文件名
        String msg = subsidyService.findBusinessOwnerSubsidy(request);
        List<Map<String, Object>> list = DownloadAct.parseJSON2List2(msg);//导出的数据
        DownloadAct.download3(request,response,a,b,gzb,list);
        return null;
    }
    //经营权人专项补助申请添加
    @RequestMapping(value = "/addBusinessOwnerSubsidy")
    @ResponseBody
    public String addBusinessOwnerSubsidy(HttpServletRequest request) {
        String msg = "";
        msg = subsidyService.addBusinessOwnerSubsidy(request);
        return msg;
    }

    //公司专项补助申请查询
    @RequestMapping(value = "/findCompanySubsidy")
    @ResponseBody
    public String findCompanySubsidy(HttpServletRequest request) {
        String msg = "";
        msg = subsidyService.findCompanySubsidy(request);
        return msg;
    }

    //公司专项补助申请导出
    @RequestMapping(value = "/findCompanySubsidyExcel")
    @ResponseBody
    public String findCompanySubsidyExcel(HttpServletRequest request,HttpServletResponse response) throws IOException {
        String a[] = {"序号","车牌号"};//导出列明
        String b[] = {"RN","CPHM"};//导出map中的key
        String c[] = {"公司名称","统一信用代码","注册地址","车辆总数","补助金额"};//导出列明
        String d[] = {"SQRXM1","dfsjflj","dfsjflj","dfsjflj","dfsjflj","dfsjflj"};//导出map中的key
        String gzb = "公司专项补助申请";//导出sheet名和导出的文件名
        String msg = subsidyService.findCompanySubsidy(request);
        List<Map<String, Object>> list = DownloadAct.parseJSON2List2(msg);//导出的数据
        DownloadAct.download2(request,response,a,b,c,d,gzb,list);
        return null;
    }

    //公司专项补助申请添加
    @RequestMapping(value = "/addCompanySubsidy")
    @ResponseBody
    public String addCompanySubsidy(HttpServletRequest request) {
        String msg = "";
        msg = subsidyService.addCompanySubsidy(request);
        return msg;
    }

    //车辆
    @RequestMapping(value = "/findVehicle")
    @ResponseBody
    public String findVehicle(HttpServletRequest request) {
        String msg = "";
        msg = subsidyService.findVehicle(request);
        return msg;
    }

    //上传
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(HttpServletRequest request) throws IOException {
        String msg = subsidyService.upload(request);
        return msg;
    }

    @RequestMapping(value = "/pic")
    public void pic(HttpServletRequest request, HttpServletResponse response,
                    @RequestParam("key") String key) {
        subsidyService.getFile(request, response, key);
    }
}
