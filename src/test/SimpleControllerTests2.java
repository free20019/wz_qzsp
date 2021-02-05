package test;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration //默认是src/main/webapp
@ContextConfiguration("file:resources/spring/applicationContext.xml")
public class SimpleControllerTests2 {

//	public void simple() throws Exception {
//		standaloneSetup(new CommonAction()).build()
//			.perform(get("/common/test"))
//			.andExpect(status().isOk())
//			.andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
//			.andExpect(content().string("ok"))
//			.andReturn();
//	}
	
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	@Before
	public void setup() throws Exception {
	this.mockMvc = webAppContextSetup(this.wac).build();
	}

	/**
	 * 车辆运输证 查询车辆所有人个人信息
	 * @throws Exception
	 */
	@Test
	public void findgrsqxx() throws Exception {
	String result = this.mockMvc.perform(get("/clyszsq/findgrsqxx"))
	.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
	System.out.println("==========查询车辆所有人个人信息:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	assertEquals("曹建华,男,网络预约出租汽车运输证,居民身份证,411103199808214398,浙A6C828",result);
	}
	/**
	 * 查询驾驶员个人信息
	 * @throws Exception
	 */
	@Test
	public void findjsygrsq() throws Exception {
		String result = this.mockMvc.perform(get("/clyszsq/findjsygrsq"))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("++++++++++查询驾驶员个人信息:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
		assertEquals("李博林,男,网络预约出租车驾驶证,居民身份证,411103199808214398",result);
	}
	
	/**
	 * 增加车辆申请信息
	 * @throws Exception
	 */
	@Test
	public void addgrsqxx() throws Exception {
	String result = this.mockMvc.perform(post("/clyszsq/addgrsqxx")
			.header("X-Requested-With", "XMLHttpRequest")
			.param("postData", "{\"CPHM\":\"浙A12345\",\"YCLYYXZ\":\"12000\",\"HDZKW\":\"15\",\"DJZDJRQ\":\"2016-05-15\"}"))
	.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
	System.out.println("#############增加车辆申请信息:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	}
	/**
	 * 增加车辆申请信息 (错误数据)
	 * @throws Exception
	 */
	@Test
	public void addgrsqxx_false_cphm() throws Exception {
		String result = this.mockMvc.perform(post("/clyszsq/addgrsqxx")
				.header("X-Requested-With", "XMLHttpRequest")
				.param("postData", "{\"CPHM\":\"123456\",\"YCLYYXZ\":\"12000\",\"HDZKW\":\"15\",\"DJZDJRQ\":\"2016-05-15\"}"))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("@@@@@@@@@@@@增加车辆申请信息 (错误数据):"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	}
	/**
	 * 增加外国人申请信息
	 * @throws Exception
	 */
	@Test
	public void controllerExceptionHandler3() throws Exception {
		String result = this.mockMvc.perform(post("/clyszsq/addgrsqxxfore")
				.header("X-Requested-With", "XMLHttpRequest")
				.param("postData", "{\"CPHM\":\"浙a1234\",\"YCLYYXZ\":\"12000\",\"HDZKW\":\"15\",\"DJZDJRQ\":\"2016-05-15\",\"YWX\":\"Gavin\",\"YWM\":\"Matthew\",\"YB\":\"030001\",\"DZYX\":\"sunwukong@gmail.com\",\"ZJHM\":\"330269198910210019\",\"ZJHM_S\":\"2507563946\"}")) 
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("$$$$$$$$$$$$增加外国人申请信息:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	}

	/**
	 * 增加驾驶员申请
	 * @throws Exception
	 */
	@Test
	public void addjsygrsq() throws Exception {
		String result = this.mockMvc.perform(post("/clyszsq/addjsygrsq")
				.header("X-Requested-With", "XMLHttpRequest")
				.param("postData", "{\"XM\":\"李志深\",\"XB\":\"男\",\"ZJHM\":\"280156199008210122\",\"JZZQFRQ\":\"2016-05-16\",\"IS_A\":\"1\",\"DZYX\":\"gh23687495@qq.com\"}"))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("%%%%%%%%%%%%增加驾驶员申请:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	}
	
	/**
	 * 增加驾驶员申请（姓名 数据错误 ）
	 * @throws Exception
	 */
	@Test
	public void addjsygrsq_false_xm() throws Exception {
		String result = this.mockMvc.perform(post("/clyszsq/addjsygrsq")
				.header("X-Requested-With", "XMLHttpRequest")
				.param("postData", "{\"XM\":\"李志aa深\",\"ZJHM\":\"33025619891221001595786872354\",\"JZZQFRQ\":\"20ewr16-05-16\",\"IS_A\":\"1\",\"DZYX\":\"gh2368749..qq.com\"}"))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("!!!!!!!!!!增加驾驶员申请（姓名 数据错误 ）:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	}
	
	/**
	 * 增加驾驶员申请（证件号码  数据错误）
	 * @throws Exception
	 */
	@Test
	public void addjsygrsq_false_zjhm() throws Exception {
		String result = this.mockMvc.perform(post("/clyszsq/addjsygrsq")
				.header("X-Requested-With", "XMLHttpRequest")
				.param("postData", "{\"XM\":\"李志深\",\"ZJHM\":\"33025619891221001595786872354\",\"JZZQFRQ\":\"20ewr16-05-16\",\"IS_A\":\"1\",\"DZYX\":\"gh2368749..qq.com\"}"))
				.andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println("***********增加驾驶员申请（证件号码  数据错误）:"+result);
//	Assert.isTrue(result.contains("浙A6D726"));
	}
	
	
	
	
	
	
	
}
