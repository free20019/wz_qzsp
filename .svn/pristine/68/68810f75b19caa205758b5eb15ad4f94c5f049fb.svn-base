package helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正则校验方法
 * @author Administrator
 *
 */
public class Verify {
	private static Logger logger = LoggerFactory.getLogger(Verify.class);
	/**
	 * 校验姓名
	 * 只能为汉字 1--10
	 * @return
	 */
	public static final String REGEX_USER_NAME = "(.{1,20})";
//	public static final String REGEX_USER_NAME = "([\u4e00-\u9fa5]{1,10})";
	public static boolean isUSERName(String isusername){
		return Pattern.matches(REGEX_USER_NAME, isusername);
	}
	/**
	 * 校验国籍
	 * 只能为汉字 1--20
	 * @return
	 */
	public static final String REGEX_GJ = "([\u4e00-\u9fa5]{1,10})";
	public static boolean isGJ(String GJ){
		return Pattern.matches(REGEX_GJ, GJ);
	}
	/**
	 * 校验性别
	 * 只能为男 女
	 * @return
	 */
	public static boolean isXB(String xb){
		return (xb.equals("男")||xb.equals("女"));
	}
	/**
	 * 校验申请类型
	 * 只能为汉字 1--20
	 */
	public static final String REGEX_SQLX = "([\u4e00-\u9fa5]{1,20})";
	public static boolean REGEX_SQLX(String SQLX){
		return Pattern.matches(REGEX_SQLX, SQLX);
	}
	/**
	 * 校验身份证、驾驶证
	 * 只能为18为正确的身份证号码
	 */
	public static final String REGEX_ID_CARD = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
	public static boolean isIDCard(String idCard) {
		return Pattern.matches(REGEX_ID_CARD, idCard);
	}
	/**
	 * 校验护照
	 */
	public static final String REGEX_HZID = "(^E[1][0-9]{8}[1]$)";
	public static boolean isHZID(String idCard) {
		return Pattern.matches(REGEX_HZID, idCard);
	}
	
	/**
	 * 校验档案编号
	 * 12位数字
	 */
	public static final String REGEX_DABH = "(^[0-9]{12}$)";
	public static final boolean isDabh(String dabh){
		return Pattern.matches(REGEX_DABH, dabh);
	}
	/**
	 * 申请车牌号
	 */
	public static final String REGEX_CPHM = "(.{1,10})";
//	 public static final String REGEX_CPHM = "(^(浙C[0-9A-Z]{5})|浙C#$)";
	public static boolean isCPHM(String cphm){
		return Pattern.matches(REGEX_CPHM, cphm);
	}
	/**
	 * 营运性质
	 * 只能是营运或非营运
	 */
	public static boolean isYYXZ(String yyxz){
		return (yyxz.equals("营运")||yyxz.equals("非营运"));
	}
	/**
	 * 车辆类型与价格
	 * 只能为燃油车或新能源车
	 */
	public static boolean isCLLX(String cllx){
		return (cllx.equals("非新能源车")||cllx.equals("新能源车"));
	}
	/**
	 * 
	 * 匹配年份
	 * */
	public static final String REGEX_NFZZ = "(^(?:(?!0000)[0-9]{4})$)";
	public boolean isNFZZ(String rqzz){
		boolean boo = true;
		if(Pattern.matches(REGEX_NFZZ, rqzz)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			Date d = new Date();
			if(rqzz.compareTo(sdf.format(d))>0){
				boo = false;
			}
		}else{
			boo = false;
		}
		return boo;
	}
	/**
	 * 日期验证
	 */
	public static final String REGEX_RQ = "(^\\d{4}(-\\d{1,2}){2}$)";
	public static boolean isRQ(String RQ){
		return Pattern.matches(REGEX_RQ, RQ);
	}
	/**
	 * 日期正则
	 * 必须为2016-10-10这种格式
	 * 且不能大于当前日期
	 */
	public static final String REGEX_RQZZ = "(^\\d{4}(-\\d{1,2}){2}$)";
	public static boolean isRQZZ(String rqzz){
		boolean boo = true;
		if(Pattern.matches(REGEX_RQZZ, rqzz)){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = new Date();
			long a = d.getTime();
			long b =0;

	        Calendar c = Calendar.getInstance();
	        c.add(Calendar.YEAR, -4);
	        long y5 = c.getTime().getTime();
			try {
				b = sdf.parse(rqzz).getTime();
			} catch (ParseException e) {
				System.out.println("日期转换错误");
				e.printStackTrace();
			}
			if(b>a){
				boo = false;
			}else if(b<y5){
				boo = false;
			}
		}else{
			boo = false;
		}
		return boo;
	}
	/**
	 * 是否验证
	 * 只能为是或否
	 */
	public static boolean isSFYZ(String sfyz){
		return (sfyz.equals("是")||sfyz.equals("否"));
	}
	/**
	 * 电子邮箱验证
	 * jddsb@163.com
	 * 总长度为6--30
	 */
	public static final String REGEX_DZYXYZ = "(^[a-zA-Z0-9_-]{1,16}@[a-zA-Z0-9_-]{2,10}(.[a-zA-Z0-9_-]{2,10}){1,3}$)";
	public static boolean isDZYXYZ(String dzyxyz){
		return Pattern.matches(REGEX_DZYXYZ, dzyxyz);
	}
	/**
	 * 邮编验证
	 */
	public static final String REGEX_YBYZ = "([0-9]\\d{5})";
	public static boolean isYBYZ(String ybyz){
		return Pattern.matches(REGEX_YBYZ, ybyz);
	}
	/**
	 * 联系地址
	 * 1--100个字符
	 */
	public static boolean isLXDZ(String lxdz){
		if(lxdz!=null&&lxdz.length()<101){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 英文姓名1-20个字母
	 */
	public static final String REGEX_YWXM = "([A-Z,a-z]{1,20})";
	public static boolean isYWXM(String ywxm){
		return Pattern.matches(REGEX_YWXM, ywxm);
	}
	/**
	 * 港澳台大陆通行证
	 */
	/**
	 * 外国人护照
	 */
	public static final String REGEX_HZ = "(^1[45][0-9]{7}|G[0-9]{8}|P[0-9]{7}|S[0-9]{7,8}|D[0-9]+$)";
	public static boolean isHZ(String hz){
		return Pattern.matches(REGEX_HZ, hz);
	}
	/**
	 * 车辆识别码
	 */
	public static final String REGEX_CLSBM = "([A-Z,0-9]{17})";
	public static boolean isCLSBM(String clsbm){
		return Pattern.matches(REGEX_CLSBM, clsbm);
	}
	/*核定载客位*/
	public static final String REGEX_HDZKW = "([1-7]{1})";
	public static boolean isHDZKW(String HDZKW){
		return Pattern.matches(REGEX_HDZKW, HDZKW);
	}
	/*车辆轴距---新能源车*/
	public static final String REGEX_XNYC = "(^(2[6-9]\\d{2})|([3-9]\\d{3})$)";
	public static boolean isXNYC(String XNYC){
		return Pattern.matches(REGEX_XNYC, XNYC);
	}
	/*车辆轴距---非新能源车*/
	public static final String REGEX_FXNYC = "(^(26[5-9]\\d|2[7-9]\\d{2})|([3-9]\\d{3})$)";
	public static boolean isFXNYC(String FXNYC){
		return Pattern.matches(REGEX_FXNYC, FXNYC);
	}
	/*续航里程*/
	public static final String REGEX_XHLC = "(^(2[5-9]\\d{1})|([3-9]\\d{2}|\\d{4})$)";
	public static boolean isXHLC(String XHLC){
		return Pattern.matches(REGEX_XHLC, XHLC);
	}
	/*计税与价格*/
	public static final String REGEX_JGYJS = "(^((1[2-9])|([2-9][0-9])|(\\d{3,4}))(\\.([0-9]{1,2}))?$)";
	public static boolean isJGYJS(String JGYJS){
		return Pattern.matches(REGEX_JGYJS, JGYJS);
	}
	public static final String REGEX_JGYJS1 = "(^((1[5-9])|([2-9][0-9])|(\\d{3,4}))(\\.([0-9]{1,2}))?$)";
	public static boolean isJGYJS1(String JGYJS){
		return Pattern.matches(REGEX_JGYJS1, JGYJS);
	}
	/*工商注册号*/
	public static final String REGEX_GSZCH = "(^\\d{15}$)";
	public static boolean isGSZCH(String GSZCH){
		return Pattern.matches(REGEX_GSZCH, GSZCH);
	}
	/*服务机构名称*/
	public static final String REGEX_FWJGMC = "(^[\u4E00-\u9FA5A-Za-z0-9]+$)";
	public static boolean isFWJGMC(String FWJGMC){
		return Pattern.matches(REGEX_FWJGMC, FWJGMC);
	}
	/*联系方式*/
	public static final String REGEX_LXFS = "(^1\\d{10}|\\d{8}$)";
	public static boolean isLXFS(String FWJGMC){
		return Pattern.matches(REGEX_LXFS, FWJGMC);
	}
	/*出生日期*/
	public static final String REGEX_CSRQ = "(^\\d{4}(-\\d{2}){2}$)";
	public static boolean isCSRQ(String CSRQ){
		return Pattern.matches(REGEX_CSRQ, CSRQ);
	}
	/*验证码*/
	public static final String REGEX_YZM = "([0-9]\\d{3})";
	public static boolean isYZM(String YZM){
		return Pattern.matches(REGEX_YZM, YZM);
	}
	/*密码*/
	public static final String REGEX_MM = "(^.{32}$)";
	public static boolean isMM(String MM){
		return Pattern.matches(REGEX_MM, MM);
	}
	/*组织机构代码证*/
	public static final String REGEX_ZZJGDMZ = "([a-zA-Z0-9]{8}-[a-zA-Z0-9])";
	public static boolean isZZJGDMZ(String zjhm){
		return Pattern.matches(REGEX_ZZJGDMZ, zjhm);
	}
	/*统一社会信用*/
	public static final String REGEX_TYSHXY = "([1-9A-GY]{1}[1239]{1}[1-5]{1}[0-9]{5}[0-9A-Z]{10})";
	public static boolean isTYSHXY(String zjhm){
		return Pattern.matches(REGEX_TYSHXY, zjhm);
	}
	/*服务机构具体地址*/
	public static final String REGEX_FWJGJTDZ = "(^(?=.*?[\u4E00-\u9FA5])[\\dA-Za-z\u4E00-\u9FA5]+$)";
	public static boolean isFWJGJTDZ(String fwjgjtdz){
		return Pattern.matches(REGEX_FWJGJTDZ, fwjgjtdz);
	}
	/*邮寄方式*/
	public static final String REGEX_YJFS = "(^[\u4e00-\u9fa5]{1,10}$)";
	public static boolean isYJFS(String yjfs){
		return Pattern.matches(REGEX_YJFS, yjfs);
	}
	/*车辆品牌*/
	public static final String REGEX_CLPP = "(^.{1,200}$)";
	public static boolean isCLPP(String CLPP){
		return Pattern.matches(REGEX_CLPP, CLPP);
	}
	/*准驾车型*/
	public static final String REGEX_ZJCX = "(^[A][1-3]|[B-C][1-2]$)";
	public static boolean isZJCX(String zjcx){
		return Pattern.matches(REGEX_ZJCX, zjcx);
	}
	/*发动机号*/
	public static final String REGEX_FDJH = "(^[0-9A-Z]{1,20}$)";
	public static boolean isFDJH(String fdjh){
		return Pattern.matches(REGEX_FDJH, fdjh);
	}
	/*车辆长宽高*/
	public static final String REGEX_CLCKG = "(^[0-9]{1,7}$)";
	public static boolean isCLCKG(String clckg){
		return Pattern.matches(REGEX_CLCKG, clckg);
	}
	/*保险额度*/
	public static final String REGEX_BXED = "(^[0-9]{1,8}$)";
	public static boolean isBXED(String bxed){
		return Pattern.matches(REGEX_BXED, bxed);
	}
}
