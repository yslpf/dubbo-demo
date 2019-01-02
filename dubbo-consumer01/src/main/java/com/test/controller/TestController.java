package com.test.controller;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.service.MyService;
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

	@Autowired
	MyService myService;
 
	@RequestMapping(value = { "/consumer/testMain" })
	@ResponseBody
	public String testDubbo() {
		return "consuemr01" + testInterface.test();
	}
 
 
	@RequestMapping(value = { "/consumer/testMyService" })
	@ResponseBody
	public String testMyService() {
		return "myService-result:"+myService.testMyService();
	}
}
