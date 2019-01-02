package com.test.controller;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
 
import com.test.service.TestService;
 
 
 
 
/**
 * @author xianghui1
 *
 *         测试controller
 */
@Controller
public class TestController {
 
 
	@Autowired
	TestService testInterface;
 
 
	@RequestMapping(value = { "/consumer/testMain" })
	@ResponseBody
	public String testDubbo() {
		return "consuemr02" + testInterface.test();
	}
 
 
}
